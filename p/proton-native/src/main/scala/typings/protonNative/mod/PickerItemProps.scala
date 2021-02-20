package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerItemProps extends StObject {
  
  var children: String = js.native
}
object PickerItemProps {
  
  @scala.inline
  def apply(children: String): PickerItemProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerItemProps]
  }
  
  @scala.inline
  implicit class PickerItemPropsMutableBuilder[Self <: PickerItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
