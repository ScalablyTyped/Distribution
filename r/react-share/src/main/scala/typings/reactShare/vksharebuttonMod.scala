package typings.reactShare

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.reactShare.anon.PickPropsOptionsclassNameAriaactivedescendant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vksharebuttonMod extends Shortcut {
  
  @JSImport("react-share/lib/VKShareButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PickPropsOptionsclassNameAriaactivedescendant] = js.native
  
  trait Options extends StObject {
    
    var image: js.UndefOr[String] = js.undefined
    
    var noParse: js.UndefOr[Boolean] = js.undefined
    
    var noVkLinks: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setNoParse(value: Boolean): Self = StObject.set(x, "noParse", value.asInstanceOf[js.Any])
      
      inline def setNoParseUndefined: Self = StObject.set(x, "noParse", js.undefined)
      
      inline def setNoVkLinks(value: Boolean): Self = StObject.set(x, "noVkLinks", value.asInstanceOf[js.Any])
      
      inline def setNoVkLinksUndefined: Self = StObject.set(x, "noVkLinks", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PickPropsOptionsclassNameAriaactivedescendant]
  
  /* This means you don't have to write `default`, but can instead just say `vksharebuttonMod.foo` */
  override def _to: ForwardRefExoticComponent[PickPropsOptionsclassNameAriaactivedescendant] = default
}
