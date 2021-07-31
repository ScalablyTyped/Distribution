package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementTextTransformation extends StObject {
  
  /**
    * The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
    */
  var priority: Input[Double]
  
  /**
    * The transformation to apply, you can specify the following types: `NONE`, `COMPRESS_WHITE_SPACE`, `HTML_ENTITY_DECODE`, `LOWERCASE`, `CMD_LINE`, `URL_DECODE`. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
    */
  var `type`: Input[String]
}
object WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementTextTransformation {
  
  @scala.inline
  def apply(priority: Input[Double], `type`: Input[String]): WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementTextTransformation = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementTextTransformation]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementTextTransformationMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementTextTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
