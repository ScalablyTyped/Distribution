package typings.sidewayAddress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uriMod {
  
  @JSImport("@sideway/address/dist/uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ipVersions {
    
    @JSImport("@sideway/address/dist/uri", "ipVersions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@sideway/address/dist/uri", "ipVersions.ipv4")
    @js.native
    def ipv4: String = js.native
    inline def ipv4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ipv4")(x.asInstanceOf[js.Any])
    
    @JSImport("@sideway/address/dist/uri", "ipVersions.ipv6")
    @js.native
    def ipv6: String = js.native
    inline def ipv6_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ipv6")(x.asInstanceOf[js.Any])
    
    @JSImport("@sideway/address/dist/uri", "ipVersions.ipvfuture")
    @js.native
    def ipvfuture: String = js.native
    inline def ipvfuture_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ipvfuture")(x.asInstanceOf[js.Any])
    
    @JSImport("@sideway/address/dist/uri", "ipVersions.v4Cidr")
    @js.native
    def v4Cidr: String = js.native
    inline def v4Cidr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v4Cidr")(x.asInstanceOf[js.Any])
    
    @JSImport("@sideway/address/dist/uri", "ipVersions.v6Cidr")
    @js.native
    def v6Cidr: String = js.native
    inline def v6Cidr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v6Cidr")(x.asInstanceOf[js.Any])
  }
  
  inline def uriRegex(): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("uriRegex")().asInstanceOf[Expression]
  inline def uriRegex(options: Options): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("uriRegex")(options.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  trait Expression extends StObject {
    
    /** The raw regular expression string. */
    var raw: String
    
    /** The regular expression. */
    var regex: js.RegExp
    
    /** The specified URI scheme */
    var scheme: String | Null
  }
  object Expression {
    
    inline def apply(raw: String, regex: js.RegExp): Expression = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], scheme = null)
      __obj.asInstanceOf[Expression]
    }
    
    extension [Self <: Expression](x: Self) {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeNull: Self = StObject.set(x, "scheme", null)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Allow the use of [] in query parameters.
      *
      * @default false
      */
    val allowQuerySquareBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow relative URIs.
      *
      * @default false
      */
    val allowRelative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Capture domain segment ($1).
      *
      * @default false
      */
    val domain: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Requires the URI to be relative.
      *
      * @default false
      */
    val relativeOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The allowed URI schemes.
      */
    val scheme: js.UndefOr[Scheme | js.Array[Scheme]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowQuerySquareBrackets(value: Boolean): Self = StObject.set(x, "allowQuerySquareBrackets", value.asInstanceOf[js.Any])
      
      inline def setAllowQuerySquareBracketsUndefined: Self = StObject.set(x, "allowQuerySquareBrackets", js.undefined)
      
      inline def setAllowRelative(value: Boolean): Self = StObject.set(x, "allowRelative", value.asInstanceOf[js.Any])
      
      inline def setAllowRelativeUndefined: Self = StObject.set(x, "allowRelative", js.undefined)
      
      inline def setDomain(value: Boolean): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setRelativeOnly(value: Boolean): Self = StObject.set(x, "relativeOnly", value.asInstanceOf[js.Any])
      
      inline def setRelativeOnlyUndefined: Self = StObject.set(x, "relativeOnly", js.undefined)
      
      inline def setScheme(value: Scheme | js.Array[Scheme]): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setSchemeVarargs(value: Scheme*): Self = StObject.set(x, "scheme", js.Array(value*))
    }
  }
  
  type Scheme = String | js.RegExp
}
