package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader extends StObject {
  
  /**
    * The name of the query header to inspect. This setting must be provided as lower case characters.
    */
  var name: String
}
object WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader {
  
  inline def apply(name: String): WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader]
  }
  
  extension [Self <: WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
