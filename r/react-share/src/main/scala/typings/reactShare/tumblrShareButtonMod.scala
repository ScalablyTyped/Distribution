package typings.reactShare

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.reactShare.anon.PickPropsOptionstagsstrin
import typings.reactShare.reactShareStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tumblrShareButtonMod extends Shortcut {
  
  @JSImport("react-share/lib/TumblrShareButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PickPropsOptionstagsstrin] = js.native
  
  trait Options extends StObject {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var posttype: js.UndefOr[link | String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setPosttype(value: link | String): Self = StObject.set(x, "posttype", value.asInstanceOf[js.Any])
      
      inline def setPosttypeUndefined: Self = StObject.set(x, "posttype", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PickPropsOptionstagsstrin]
  
  /* This means you don't have to write `default`, but can instead just say `tumblrShareButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[PickPropsOptionstagsstrin] = default
}
