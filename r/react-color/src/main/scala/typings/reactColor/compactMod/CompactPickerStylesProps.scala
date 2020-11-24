package typings.reactColor.compactMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompactPickerStylesProps extends js.Object {
  
  var Compact: CSSProperties = js.native
  
  var clear: CSSProperties = js.native
  
  var compact: CSSProperties = js.native
}
object CompactPickerStylesProps {
  
  @scala.inline
  def apply(Compact: CSSProperties, clear: CSSProperties, compact: CSSProperties): CompactPickerStylesProps = {
    val __obj = js.Dynamic.literal(Compact = Compact.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactPickerStylesProps]
  }
  
  @scala.inline
  implicit class CompactPickerStylesPropsOps[Self <: CompactPickerStylesProps] (val x: Self) extends AnyVal {
    
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
    def setClear(value: CSSProperties): Self = this.set("clear", value.asInstanceOf[js.Any])
  }
}
