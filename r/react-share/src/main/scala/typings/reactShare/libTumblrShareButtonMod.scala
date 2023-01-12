package typings.reactShare

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.reactShare.anon.OmitPropsOptionstagsstrin
import typings.reactShare.reactShareStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTumblrShareButtonMod extends Shortcut {
  
  @JSImport("react-share/lib/TumblrShareButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OmitPropsOptionstagsstrin] = js.native
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setPosttype(value: link | String): Self = StObject.set(x, "posttype", value.asInstanceOf[js.Any])
      
      inline def setPosttypeUndefined: Self = StObject.set(x, "posttype", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[OmitPropsOptionstagsstrin]
  
  /* This means you don't have to write `default`, but can instead just say `libTumblrShareButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[OmitPropsOptionstagsstrin] = default
}
