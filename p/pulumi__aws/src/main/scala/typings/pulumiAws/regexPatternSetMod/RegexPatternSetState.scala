package typings.pulumiAws.regexPatternSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexPatternSetState extends js.Object {
  
  /**
    * The name or description of the Regex Pattern Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
    */
  val regexPatternStrings: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object RegexPatternSetState {
  
  @scala.inline
  def apply(): RegexPatternSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexPatternSetState]
  }
  
  @scala.inline
  implicit class RegexPatternSetStateOps[Self <: RegexPatternSetState] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRegexPatternStringsVarargs(value: Input[String]*): Self = this.set("regexPatternStrings", js.Array(value :_*))
    
    @scala.inline
    def setRegexPatternStrings(value: Input[js.Array[Input[String]]]): Self = this.set("regexPatternStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexPatternStrings: Self = this.set("regexPatternStrings", js.undefined)
  }
}
