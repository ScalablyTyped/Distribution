package typings.romajiName.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends js.Object {
  
  /**
    * Names that don't have a "ja" locale should be flipped ("Smith John" becomes "John Smith").
    */
  var flipNonJa: js.UndefOr[Boolean] = js.native
  
  /**
    * Assumes that the first name is always the given name.
    */
  var givenFirst: js.UndefOr[Boolean] = js.native
  
  /**
    * Removes anything that's wrapped in parentheses.
    * Normally this is left intact and any extra information is parsed from it.
    */
  var stripParens: js.UndefOr[Boolean] = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def setFlipNonJa(value: Boolean): Self = this.set("flipNonJa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipNonJa: Self = this.set("flipNonJa", js.undefined)
    
    @scala.inline
    def setGivenFirst(value: Boolean): Self = this.set("givenFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenFirst: Self = this.set("givenFirst", js.undefined)
    
    @scala.inline
    def setStripParens(value: Boolean): Self = this.set("stripParens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripParens: Self = this.set("stripParens", js.undefined)
  }
}
