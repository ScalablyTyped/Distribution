package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleStatementXssMatchStatement extends js.Object {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[Input[RuleGroupRuleStatementXssMatchStatementFieldToMatch]] = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: Input[js.Array[Input[RuleGroupRuleStatementXssMatchStatementTextTransformation]]] = js.native
}
object RuleGroupRuleStatementXssMatchStatement {
  
  @scala.inline
  def apply(
    textTransformations: Input[js.Array[Input[RuleGroupRuleStatementXssMatchStatementTextTransformation]]]
  ): RuleGroupRuleStatementXssMatchStatement = {
    val __obj = js.Dynamic.literal(textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementXssMatchStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementXssMatchStatementOps[Self <: RuleGroupRuleStatementXssMatchStatement] (val x: Self) extends AnyVal {
    
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
    def setTextTransformationsVarargs(value: Input[RuleGroupRuleStatementXssMatchStatementTextTransformation]*): Self = this.set("textTransformations", js.Array(value :_*))
    
    @scala.inline
    def setTextTransformations(value: Input[js.Array[Input[RuleGroupRuleStatementXssMatchStatementTextTransformation]]]): Self = this.set("textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatch(value: Input[RuleGroupRuleStatementXssMatchStatementFieldToMatch]): Self = this.set("fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldToMatch: Self = this.set("fieldToMatch", js.undefined)
  }
}
