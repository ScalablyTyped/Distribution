package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/compact/Compact.CompactPickerStylesProps> */
@js.native
trait PartialCompactPickerStyle extends js.Object {
  
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
  implicit class PartialCompactPickerStyleOps[Self <: PartialCompactPickerStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompact(value: CSSProperties): Self = this.set("Compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("Compact", js.undefined)
    
    @scala.inline
    def setClear(value: CSSProperties): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
  }
}
