package typings.soap

import typings.soap.typesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wssecurityMod {
  
  @JSImport("soap/lib/security/WSSecurity", "WSSecurity")
  @js.native
  class WSSecurity protected ()
    extends StObject
       with ISecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, options: String) = this()
    def this(username: String, password: String, options: IWSSecurityOptions) = this()
    
    var _actor: js.Any = js.native
    
    var _hasNonce: js.Any = js.native
    
    var _hasTimeStamp: js.Any = js.native
    
    var _hasTokenCreated: js.Any = js.native
    
    var _mustUnderstand: js.Any = js.native
    
    var _password: js.Any = js.native
    
    var _passwordType: js.Any = js.native
    
    var _username: js.Any = js.native
    
    @JSName("toXML")
    def toXML_MWSSecurity(): String = js.native
  }
  
  trait IWSSecurityOptions extends StObject {
    
    var actor: js.UndefOr[String] = js.undefined
    
    var hasNonce: js.UndefOr[Boolean] = js.undefined
    
    var hasTimeStamp: js.UndefOr[Boolean] = js.undefined
    
    var hasTokenCreated: js.UndefOr[Boolean] = js.undefined
    
    var mustUnderstand: js.UndefOr[js.Any] = js.undefined
    
    var passwordType: js.UndefOr[String] = js.undefined
  }
  object IWSSecurityOptions {
    
    @scala.inline
    def apply(): IWSSecurityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWSSecurityOptions]
    }
    
    @scala.inline
    implicit class IWSSecurityOptionsMutableBuilder[Self <: IWSSecurityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
      
      @scala.inline
      def setHasNonce(value: Boolean): Self = StObject.set(x, "hasNonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasNonceUndefined: Self = StObject.set(x, "hasNonce", js.undefined)
      
      @scala.inline
      def setHasTimeStamp(value: Boolean): Self = StObject.set(x, "hasTimeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTimeStampUndefined: Self = StObject.set(x, "hasTimeStamp", js.undefined)
      
      @scala.inline
      def setHasTokenCreated(value: Boolean): Self = StObject.set(x, "hasTokenCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTokenCreatedUndefined: Self = StObject.set(x, "hasTokenCreated", js.undefined)
      
      @scala.inline
      def setMustUnderstand(value: js.Any): Self = StObject.set(x, "mustUnderstand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMustUnderstandUndefined: Self = StObject.set(x, "mustUnderstand", js.undefined)
      
      @scala.inline
      def setPasswordType(value: String): Self = StObject.set(x, "passwordType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordTypeUndefined: Self = StObject.set(x, "passwordType", js.undefined)
    }
  }
}
