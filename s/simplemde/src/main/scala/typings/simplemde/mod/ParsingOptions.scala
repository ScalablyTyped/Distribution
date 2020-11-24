package typings.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsingOptions extends js.Object {
  
  var allowAtxHeaderWithoutSpace: js.UndefOr[Boolean] = js.native
  
  var strikethrough: js.UndefOr[Boolean] = js.native
  
  var underscoresBreakWords: js.UndefOr[Boolean] = js.native
}
object ParsingOptions {
  
  @scala.inline
  def apply(): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsingOptions]
  }
  
  @scala.inline
  implicit class ParsingOptionsOps[Self <: ParsingOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowAtxHeaderWithoutSpace(value: Boolean): Self = this.set("allowAtxHeaderWithoutSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAtxHeaderWithoutSpace: Self = this.set("allowAtxHeaderWithoutSpace", js.undefined)
    
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikethrough: Self = this.set("strikethrough", js.undefined)
    
    @scala.inline
    def setUnderscoresBreakWords(value: Boolean): Self = this.set("underscoresBreakWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderscoresBreakWords: Self = this.set("underscoresBreakWords", js.undefined)
  }
}
