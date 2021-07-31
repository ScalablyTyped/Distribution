package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument extends StObject {
  
  /**
    * The name of the query header to inspect. This setting must be provided as lower case characters.
    */
  var name: Input[String]
}
object WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument {
  
  @scala.inline
  def apply(name: Input[String]): WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
