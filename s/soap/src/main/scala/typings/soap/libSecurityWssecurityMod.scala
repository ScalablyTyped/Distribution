package typings.soap

import typings.soap.libTypesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityWssecurityMod {
  
  @JSImport("soap/lib/security/WSSecurity", "WSSecurity")
  @js.native
  open class WSSecurity protected ()
    extends StObject
       with ISecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, options: String) = this()
    def this(username: String, password: String, options: IWSSecurityOptions) = this()
    
    /* private */ var _actor: Any = js.native
    
    /* private */ var _envelopeKey: Any = js.native
    
    /* private */ var _hasNonce: Any = js.native
    
    /* private */ var _hasTimeStamp: Any = js.native
    
    /* private */ var _hasTokenCreated: Any = js.native
    
    /* private */ var _mustUnderstand: Any = js.native
    
    /* private */ var _password: Any = js.native
    
    /* private */ var _passwordType: Any = js.native
    
    /* private */ var _username: Any = js.native
    
    @JSName("toXML")
    def toXML_MWSSecurity(): String = js.native
  }
  
  trait IWSSecurityOptions extends StObject {
    
    var actor: js.UndefOr[String] = js.undefined
    
    var envelopeKey: js.UndefOr[String] = js.undefined
    
    var hasNonce: js.UndefOr[Boolean] = js.undefined
    
    var hasTimeStamp: js.UndefOr[Boolean] = js.undefined
    
    var hasTokenCreated: js.UndefOr[Boolean] = js.undefined
    
    var mustUnderstand: js.UndefOr[Any] = js.undefined
    
    var passwordType: js.UndefOr[String] = js.undefined
  }
  object IWSSecurityOptions {
    
    inline def apply(): IWSSecurityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWSSecurityOptions]
    }
    
    extension [Self <: IWSSecurityOptions](x: Self) {
      
      inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
      
      inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
      
      inline def setEnvelopeKey(value: String): Self = StObject.set(x, "envelopeKey", value.asInstanceOf[js.Any])
      
      inline def setEnvelopeKeyUndefined: Self = StObject.set(x, "envelopeKey", js.undefined)
      
      inline def setHasNonce(value: Boolean): Self = StObject.set(x, "hasNonce", value.asInstanceOf[js.Any])
      
      inline def setHasNonceUndefined: Self = StObject.set(x, "hasNonce", js.undefined)
      
      inline def setHasTimeStamp(value: Boolean): Self = StObject.set(x, "hasTimeStamp", value.asInstanceOf[js.Any])
      
      inline def setHasTimeStampUndefined: Self = StObject.set(x, "hasTimeStamp", js.undefined)
      
      inline def setHasTokenCreated(value: Boolean): Self = StObject.set(x, "hasTokenCreated", value.asInstanceOf[js.Any])
      
      inline def setHasTokenCreatedUndefined: Self = StObject.set(x, "hasTokenCreated", js.undefined)
      
      inline def setMustUnderstand(value: Any): Self = StObject.set(x, "mustUnderstand", value.asInstanceOf[js.Any])
      
      inline def setMustUnderstandUndefined: Self = StObject.set(x, "mustUnderstand", js.undefined)
      
      inline def setPasswordType(value: String): Self = StObject.set(x, "passwordType", value.asInstanceOf[js.Any])
      
      inline def setPasswordTypeUndefined: Self = StObject.set(x, "passwordType", js.undefined)
    }
  }
}
