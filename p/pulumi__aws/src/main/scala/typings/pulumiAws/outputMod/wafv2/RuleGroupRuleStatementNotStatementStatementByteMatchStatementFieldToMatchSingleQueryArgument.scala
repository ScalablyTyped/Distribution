package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument extends StObject {
  
  /**
    * The name of the query header to inspect. This setting must be provided as lower case characters.
    */
  var name: String
}
object RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument {
  
  @scala.inline
  def apply(name: String): RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentMutableBuilder[Self <: RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
