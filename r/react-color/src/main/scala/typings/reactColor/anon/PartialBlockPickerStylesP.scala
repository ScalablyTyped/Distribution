package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/block/Block.BlockPickerStylesProps> */
@js.native
trait PartialBlockPickerStylesP extends js.Object {
  
  var body: js.UndefOr[CSSProperties] = js.native
  
  var card: js.UndefOr[CSSProperties] = js.native
  
  var head: js.UndefOr[CSSProperties] = js.native
  
  var input: js.UndefOr[CSSProperties] = js.native
  
  var label: js.UndefOr[CSSProperties] = js.native
  
  var triangle: js.UndefOr[CSSProperties] = js.native
}
object PartialBlockPickerStylesP {
  
  @scala.inline
  def apply(): PartialBlockPickerStylesP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBlockPickerStylesP]
  }
  
  @scala.inline
  implicit class PartialBlockPickerStylesPOps[Self <: PartialBlockPickerStylesP] (val x: Self) extends AnyVal {
    
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
    def setBody(value: CSSProperties): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCard(value: CSSProperties): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    
    @scala.inline
    def setHead(value: CSSProperties): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setInput(value: CSSProperties): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLabel(value: CSSProperties): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setTriangle(value: CSSProperties): Self = this.set("triangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangle: Self = this.set("triangle", js.undefined)
  }
}
