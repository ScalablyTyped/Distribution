package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemContentProps
  extends StObject
     with MDLHTMLAttributes
     with DOMAttributes[ListItemContent] {
  
  var avatar: js.UndefOr[String | Element] = js.undefined
  
  var icon: js.UndefOr[String | Element] = js.undefined
  
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  
  var useBodyClass: js.UndefOr[Boolean] = js.undefined
}
object ListItemContentProps {
  
  inline def apply(): ListItemContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemContentProps]
  }
  
  extension [Self <: ListItemContentProps](x: Self) {
    
    inline def setAvatar(value: String | Element): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setIcon(value: String | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setUseBodyClass(value: Boolean): Self = StObject.set(x, "useBodyClass", value.asInstanceOf[js.Any])
    
    inline def setUseBodyClassUndefined: Self = StObject.set(x, "useBodyClass", js.undefined)
  }
}
