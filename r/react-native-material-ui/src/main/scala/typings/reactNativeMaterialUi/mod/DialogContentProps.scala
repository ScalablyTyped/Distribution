package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.ContentContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogContentProps extends StObject {
  
  var children: Element
  
  var style: js.UndefOr[ContentContainer] = js.undefined
}
object DialogContentProps {
  
  @scala.inline
  def apply(children: Element): DialogContentProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContentProps]
  }
  
  @scala.inline
  implicit class DialogContentPropsMutableBuilder[Self <: DialogContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: ContentContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
