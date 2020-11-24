package typings.seatsio.Seatsio

import typings.seatsio.seatsioStrings.Lato
import typings.seatsio.seatsioStrings.Montserrat
import typings.seatsio.seatsioStrings.NotoSansHK
import typings.seatsio.seatsioStrings.Roboto
import typings.seatsio.seatsioStrings.WorkSans
import typings.seatsio.seatsioStrings.`3d`
import typings.seatsio.seatsioStrings.asymmetrical
import typings.seatsio.seatsioStrings.bolder
import typings.seatsio.seatsioStrings.fillEnabled
import typings.seatsio.seatsioStrings.fillHighlightedOption
import typings.seatsio.seatsioStrings.max
import typings.seatsio.seatsioStrings.minMax
import typings.seatsio.seatsioStrings.none
import typings.seatsio.seatsioStrings.spacious
import typings.seatsio.seatsioStrings.thick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends js.Object {
  
  var border: js.UndefOr[thick | `3d`] = js.native
  
  var borderRadius: js.UndefOr[none | max | asymmetrical] = js.native
  
  var buttonFace: js.UndefOr[fillEnabled | fillHighlightedOption] = js.native
  
  var font: js.UndefOr[Roboto | Montserrat | WorkSans | NotoSansHK | Lato] = js.native
  
  var fontWeight: js.UndefOr[bolder | minMax] = js.native
  
  var padding: js.UndefOr[spacious] = js.native
}
object Style {
  
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: thick | `3d`): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: none | max | asymmetrical): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setButtonFace(value: fillEnabled | fillHighlightedOption): Self = this.set("buttonFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonFace: Self = this.set("buttonFace", js.undefined)
    
    @scala.inline
    def setFont(value: Roboto | Montserrat | WorkSans | NotoSansHK | Lato): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontWeight(value: bolder | minMax): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setPadding(value: spacious): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
}
