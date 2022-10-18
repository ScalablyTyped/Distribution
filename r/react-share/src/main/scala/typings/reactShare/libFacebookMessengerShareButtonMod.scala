package typings.reactShare

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.reactShare.anon.OmitPropsOptionsforwardedAbout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFacebookMessengerShareButtonMod extends Shortcut {
  
  @JSImport("react-share/lib/FacebookMessengerShareButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OmitPropsOptionsforwardedAbout] = js.native
  
  trait Options extends StObject {
    
    /** Your app's unique identifier. */
    var appId: String
    
    /** The URL to redirect to after a person clicks a button on the dialog.
      * Required when using URL redirection. */
    var redirectUri: js.UndefOr[String] = js.undefined
    
    /** A user ID of a recipient. Once the dialog comes up, the sender can
      * specify additional people as recipients. */
    var to: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(appId: String): Options = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[OmitPropsOptionsforwardedAbout]
  
  /* This means you don't have to write `default`, but can instead just say `libFacebookMessengerShareButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[OmitPropsOptionsforwardedAbout] = default
}
