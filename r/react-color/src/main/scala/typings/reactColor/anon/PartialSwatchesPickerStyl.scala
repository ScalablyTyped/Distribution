package typings.reactColor.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/swatches/Swatches.SwatchesPickerStylesProps> */
@js.native
trait PartialSwatchesPickerStyl extends StObject {
  
  var body: js.UndefOr[CSSProperties] = js.native
  
  var clear: js.UndefOr[CSSProperties] = js.native
  
  var overflow: js.UndefOr[CSSProperties] = js.native
  
  var picker: js.UndefOr[CSSProperties] = js.native
}
object PartialSwatchesPickerStyl {
  
  @scala.inline
  def apply(): PartialSwatchesPickerStyl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSwatchesPickerStyl]
  }
  
  @scala.inline
  implicit class PartialSwatchesPickerStylMutableBuilder[Self <: PartialSwatchesPickerStyl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setOverflow(value: CSSProperties): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
  }
}
