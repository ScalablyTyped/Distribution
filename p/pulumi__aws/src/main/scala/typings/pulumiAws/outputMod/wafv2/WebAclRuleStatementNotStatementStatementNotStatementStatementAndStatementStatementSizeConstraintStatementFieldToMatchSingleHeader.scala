package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader extends StObject {
  
  /**
    * The name of the query header to inspect. This setting must be provided as lower case characters.
    */
  var name: String
}
object WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader {
  
  @scala.inline
  def apply(name: String): WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
