package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader extends StObject {
  
  /**
    * The name of the query header to inspect. This setting must be provided as lower case characters.
    */
  var name: String
}
object WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader {
  
  inline def apply(name: String): WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader]
  }
  
  extension [Self <: WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
