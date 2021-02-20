package typings.reactColor.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/hue/Hue.HuePickerStylesProps> */
@js.native
trait PartialHuePickerStylesPro extends StObject {
  
  var hue: js.UndefOr[CSSProperties] = js.native
  
  var picker: js.UndefOr[CSSProperties] = js.native
}
object PartialHuePickerStylesPro {
  
  @scala.inline
  def apply(): PartialHuePickerStylesPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHuePickerStylesPro]
  }
  
  @scala.inline
  implicit class PartialHuePickerStylesProMutableBuilder[Self <: PartialHuePickerStylesPro] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHue(value: CSSProperties): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
  }
}
