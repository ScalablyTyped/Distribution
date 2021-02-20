package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemContentProps
  extends MDLHTMLAttributes
     with DOMAttributes[ListItemContent] {
  
  var avatar: js.UndefOr[String | Element] = js.native
  
  var icon: js.UndefOr[String | Element] = js.native
  
  var subtitle: js.UndefOr[ReactNode] = js.native
  
  var useBodyClass: js.UndefOr[Boolean] = js.native
}
object ListItemContentProps {
  
  @scala.inline
  def apply(): ListItemContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemContentProps]
  }
  
  @scala.inline
  implicit class ListItemContentPropsMutableBuilder[Self <: ListItemContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: String | Element): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setIcon(value: String | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setUseBodyClass(value: Boolean): Self = StObject.set(x, "useBodyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBodyClassUndefined: Self = StObject.set(x, "useBodyClass", js.undefined)
  }
}
