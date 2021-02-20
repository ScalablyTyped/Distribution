package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Image
import typings.reactNativeMaterialUi.anon.ContainerContentContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerHeaderProps extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[Element] = js.native
  
  var image: js.UndefOr[js.Array[Image]] = js.native
  
  var style: js.UndefOr[ContainerContentContainer] = js.native
}
object DrawerHeaderProps {
  
  @scala.inline
  def apply(): DrawerHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerHeaderProps]
  }
  
  @scala.inline
  implicit class DrawerHeaderPropsMutableBuilder[Self <: DrawerHeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setImage(value: js.Array[Image]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setImageVarargs(value: Image*): Self = StObject.set(x, "image", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: ContainerContentContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
