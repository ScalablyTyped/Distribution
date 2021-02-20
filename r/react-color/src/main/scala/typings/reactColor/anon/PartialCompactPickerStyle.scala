package typings.reactColor.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/compact/Compact.CompactPickerStylesProps> */
@js.native
trait PartialCompactPickerStyle extends StObject {
  
  var Compact: js.UndefOr[CSSProperties] = js.native
  
  var clear: js.UndefOr[CSSProperties] = js.native
  
  var compact: js.UndefOr[CSSProperties] = js.native
}
object PartialCompactPickerStyle {
  
  @scala.inline
  def apply(): PartialCompactPickerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCompactPickerStyle]
  }
  
  @scala.inline
  implicit class PartialCompactPickerStyleMutableBuilder[Self <: PartialCompactPickerStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setCompact(value: CSSProperties): Self = StObject.set(x, "Compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "Compact", js.undefined)
  }
}
