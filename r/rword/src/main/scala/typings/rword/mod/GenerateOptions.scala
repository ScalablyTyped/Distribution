package typings.rword.mod

import typings.rword.rwordStrings.all
import typings.rword.rwordStrings.first
import typings.rword.rwordStrings.none
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateOptions extends js.Object {
  
  /**
    * Sets the capitalization of the randomly chosen words
    */
  var capitalize: js.UndefOr[none | first | all] = js.native
  
  /**
    * Regex words must match to have a chance of being randomly chosen
    * @example "word"
    * @example /ing$/
    */
  var contains: js.UndefOr[RegExp | String] = js.native
  
  /**
    * A length or range of lengths that a word must match for it to have a
    *  chance of being randomly chosen
    * @example 5
    * @example "3-10"
    */
  var length: js.UndefOr[String | Double] = js.native
}
object GenerateOptions {
  
  @scala.inline
  def apply(): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOptions]
  }
  
  @scala.inline
  implicit class GenerateOptionsOps[Self <: GenerateOptions] (val x: Self) extends AnyVal {
    
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
    def setCapitalize(value: none | first | all): Self = this.set("capitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapitalize: Self = this.set("capitalize", js.undefined)
    
    @scala.inline
    def setContains(value: RegExp | String): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setLength(value: String | Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
}
