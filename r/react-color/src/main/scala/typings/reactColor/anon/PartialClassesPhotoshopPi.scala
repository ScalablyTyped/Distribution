package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/photoshop/Photoshop.PhotoshopPickerStylesProps>> */
trait PartialClassesPhotoshopPi extends StObject {
  
  var default: js.UndefOr[PartialPhotoshopPickerSty] = js.undefined
}
object PartialClassesPhotoshopPi {
  
  @scala.inline
  def apply(): PartialClassesPhotoshopPi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesPhotoshopPi]
  }
  
  @scala.inline
  implicit class PartialClassesPhotoshopPiMutableBuilder[Self <: PartialClassesPhotoshopPi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: PartialPhotoshopPickerSty): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
