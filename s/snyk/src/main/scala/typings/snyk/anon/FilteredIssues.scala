package typings.snyk.anon

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.FormattedResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilteredIssues extends StObject {
  
  var filteredIssues: js.Array[FormattedResult]
  
  var ignoreCount: Double
}
object FilteredIssues {
  
  inline def apply(filteredIssues: js.Array[FormattedResult], ignoreCount: Double): FilteredIssues = {
    val __obj = js.Dynamic.literal(filteredIssues = filteredIssues.asInstanceOf[js.Any], ignoreCount = ignoreCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredIssues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilteredIssues] (val x: Self) extends AnyVal {
    
    inline def setFilteredIssues(value: js.Array[FormattedResult]): Self = StObject.set(x, "filteredIssues", value.asInstanceOf[js.Any])
    
    inline def setFilteredIssuesVarargs(value: FormattedResult*): Self = StObject.set(x, "filteredIssues", js.Array(value*))
    
    inline def setIgnoreCount(value: Double): Self = StObject.set(x, "ignoreCount", value.asInstanceOf[js.Any])
  }
}
