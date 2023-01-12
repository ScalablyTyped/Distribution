package typings.rsocketCore

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wellKnownAuthTypeMod {
  
  @JSImport("rsocket-core/WellKnownAuthType", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WellKnownAuthType {
    def this(str: String, identifier: Double) = this()
    
    /** @return the byte identifier of the auth type, guaranteed to be positive or zero. */
    /* CompleteClass */
    override val identifier: Double = js.native
    
    /**
      * @return the auth type represented as a {@link String}, which is made of US_ASCII compatible
      *     characters only
      */
    /* CompleteClass */
    override val string: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("rsocket-core/WellKnownAuthType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Find the {@link WellKnownAuthType} for the given identifier (as an {@link number}). Valid
      * identifiers are defined to be integers between 0 and 127, inclusive. Identifiers outside of
      * this range will produce the {@link #UNPARSEABLE_AUTH_TYPE}. Additionally, some identifiers in
      * that range are still only reserved and don't have a type associated yet: this method returns
      * the {@link #UNKNOWN_RESERVED_AUTH_TYPE} when passing such an identifier, which lets call sites
      * potentially detect this and keep the original representation when transmitting the associated
      * metadata buffer.
      *
      * @param id the looked up identifier
      * @return the {@link WellKnownAuthType}, or {@link #UNKNOWN_RESERVED_AUTH_TYPE} if the id is out
      *     of the specification's range, or {@link #UNKNOWN_RESERVED_AUTH_TYPE} if the id is one that
      *     is merely reserved but unknown to this implementation.
      */
    inline def fromIdentifier(id: Double): WellKnownAuthType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[WellKnownAuthType]
    
    /**
      * Find the {@link WellKnownAuthType} for the given {@link String} representation. If the
      * representation is {@code null} or doesn't match a {@link WellKnownAuthType}, the {@link
      * #UNPARSEABLE_AUTH_TYPE} is returned.
      *
      * @param authTypeString the looked up mime type
      * @return the matching {@link WellKnownAuthType}, or {@link #UNPARSEABLE_AUTH_TYPE} if none
      *     matches
      */
    inline def fromString(authTypeString: String): WellKnownAuthType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(authTypeString.asInstanceOf[js.Any]).asInstanceOf[WellKnownAuthType]
  }
  
  @JSImport("rsocket-core/WellKnownAuthType", "BEARER")
  @js.native
  val BEARER: WellKnownAuthType = js.native
  
  @JSImport("rsocket-core/WellKnownAuthType", "SIMPLE")
  @js.native
  val SIMPLE: WellKnownAuthType = js.native
  
  @JSImport("rsocket-core/WellKnownAuthType", "TYPES_BY_AUTH_ID")
  @js.native
  val TYPES_BY_AUTH_ID: js.Array[WellKnownAuthType] = js.native
  
  @JSImport("rsocket-core/WellKnownAuthType", "TYPES_BY_AUTH_STRING")
  @js.native
  val TYPES_BY_AUTH_STRING: Map[String, WellKnownAuthType] = js.native
  
  @JSImport("rsocket-core/WellKnownAuthType", "UNKNOWN_RESERVED_AUTH_TYPE")
  @js.native
  val UNKNOWN_RESERVED_AUTH_TYPE: WellKnownAuthType = js.native
  
  @JSImport("rsocket-core/WellKnownAuthType", "UNPARSEABLE_AUTH_TYPE")
  @js.native
  val UNPARSEABLE_AUTH_TYPE: WellKnownAuthType = js.native
  
  trait WellKnownAuthType extends StObject {
    
    /** @return the byte identifier of the auth type, guaranteed to be positive or zero. */
    val identifier: Double
    
    /**
      * @return the auth type represented as a {@link String}, which is made of US_ASCII compatible
      *     characters only
      */
    val string: String
  }
  object WellKnownAuthType {
    
    inline def apply(identifier: Double, string: String): WellKnownAuthType = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[WellKnownAuthType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WellKnownAuthType] (val x: Self) extends AnyVal {
      
      inline def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
