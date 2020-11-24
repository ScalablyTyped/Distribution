package typings.pulumiAws.wafRegexMatchSetMod

import typings.pulumiAws.inputMod.waf.RegexMatchSetRegexMatchTuple
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexMatchSetArgs extends js.Object {
  
  /**
    * The name or description of the Regex Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
    */
  val regexMatchTuples: js.UndefOr[Input[js.Array[Input[RegexMatchSetRegexMatchTuple]]]] = js.native
}
object RegexMatchSetArgs {
  
  @scala.inline
  def apply(): RegexMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexMatchSetArgs]
  }
  
  @scala.inline
  implicit class RegexMatchSetArgsOps[Self <: RegexMatchSetArgs] (val x: Self) extends AnyVal {
    
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
    def setRegexMatchTuplesVarargs(value: Input[RegexMatchSetRegexMatchTuple]*): Self = this.set("regexMatchTuples", js.Array(value :_*))
    
    @scala.inline
    def setRegexMatchTuples(value: Input[js.Array[Input[RegexMatchSetRegexMatchTuple]]]): Self = this.set("regexMatchTuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexMatchTuples: Self = this.set("regexMatchTuples", js.undefined)
  }
}
