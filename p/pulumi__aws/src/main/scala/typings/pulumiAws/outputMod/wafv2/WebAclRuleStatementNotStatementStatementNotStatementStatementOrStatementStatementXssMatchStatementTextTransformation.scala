package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation extends StObject {
  
  /**
    * The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
    */
  var priority: Double
  
  /**
    * The transformation to apply, you can specify the following types: `NONE`, `COMPRESS_WHITE_SPACE`, `HTML_ENTITY_DECODE`, `LOWERCASE`, `CMD_LINE`, `URL_DECODE`. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
    */
  var `type`: String
}
object WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation {
  
  @scala.inline
  def apply(priority: Double, `type`: String): WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformationMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
