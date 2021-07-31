package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader extends StObject {
  
  /**
    * The name of the query header to inspect. This setting must be provided as lower case characters.
    */
  var name: Input[String]
}
object WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader {
  
  @scala.inline
  def apply(name: Input[String]): WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
