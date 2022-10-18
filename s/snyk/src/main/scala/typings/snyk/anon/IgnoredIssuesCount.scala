package typings.snyk.anon

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.RulesOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoredIssuesCount extends StObject {
  
  var ignoredIssuesCount: Double
  
  var rulesOrigin: RulesOrigin
}
object IgnoredIssuesCount {
  
  inline def apply(ignoredIssuesCount: Double, rulesOrigin: RulesOrigin): IgnoredIssuesCount = {
    val __obj = js.Dynamic.literal(ignoredIssuesCount = ignoredIssuesCount.asInstanceOf[js.Any], rulesOrigin = rulesOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoredIssuesCount]
  }
  
  extension [Self <: IgnoredIssuesCount](x: Self) {
    
    inline def setIgnoredIssuesCount(value: Double): Self = StObject.set(x, "ignoredIssuesCount", value.asInstanceOf[js.Any])
    
    inline def setRulesOrigin(value: RulesOrigin): Self = StObject.set(x, "rulesOrigin", value.asInstanceOf[js.Any])
  }
}
