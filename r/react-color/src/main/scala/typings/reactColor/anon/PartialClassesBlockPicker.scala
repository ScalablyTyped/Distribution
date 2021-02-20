package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/block/Block.BlockPickerStylesProps>> */
@js.native
trait PartialClassesBlockPicker extends StObject {
  
  var default: js.UndefOr[PartialBlockPickerStylesP] = js.native
}
object PartialClassesBlockPicker {
  
  @scala.inline
  def apply(): PartialClassesBlockPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesBlockPicker]
  }
  
  @scala.inline
  implicit class PartialClassesBlockPickerMutableBuilder[Self <: PartialClassesBlockPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: PartialBlockPickerStylesP): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
