package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/twitter/Twitter.TwitterPickerStylesProps> */
@js.native
trait PartialTwitterPickerStyle extends js.Object {
  
  var body: js.UndefOr[CSSProperties] = js.native
  
  var card: js.UndefOr[CSSProperties] = js.native
  
  var clear: js.UndefOr[CSSProperties] = js.native
  
  var hash: js.UndefOr[CSSProperties] = js.native
  
  var input: js.UndefOr[CSSProperties] = js.native
  
  var label: js.UndefOr[CSSProperties] = js.native
  
  var swatch: js.UndefOr[CSSProperties] = js.native
  
  var triangle: js.UndefOr[CSSProperties] = js.native
  
  var triangleShadow: js.UndefOr[CSSProperties] = js.native
}
object PartialTwitterPickerStyle {
  
  @scala.inline
  def apply(): PartialTwitterPickerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTwitterPickerStyle]
  }
  
  @scala.inline
  implicit class PartialTwitterPickerStyleOps[Self <: PartialTwitterPickerStyle] (val x: Self) extends AnyVal {
    
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
    def setClear(value: CSSProperties): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setHash(value: CSSProperties): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setInput(value: CSSProperties): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLabel(value: CSSProperties): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSwatch(value: CSSProperties): Self = this.set("swatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwatch: Self = this.set("swatch", js.undefined)
    
    @scala.inline
    def setTriangle(value: CSSProperties): Self = this.set("triangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangle: Self = this.set("triangle", js.undefined)
    
    @scala.inline
    def setTriangleShadow(value: CSSProperties): Self = this.set("triangleShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleShadow: Self = this.set("triangleShadow", js.undefined)
  }
}
