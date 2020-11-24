package typings.projectNameGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Whether to output words beginning with the same letter or not
    * @default false
    */
  var alliterative: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether a numeric suffix is generated or not. The number is between 1 - 9999, both inclusive.
    * @default false
    */
  var number: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of words generated (excluding number).
    * All words will be adjectives, except the last one which will be a noun
    * @default 2
    */
  var words: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAlliterative(value: Boolean): Self = this.set("alliterative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlliterative: Self = this.set("alliterative", js.undefined)
    
    @scala.inline
    def setNumber(value: Boolean): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setWords(value: Double): Self = this.set("words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
}
