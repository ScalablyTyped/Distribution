package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndDate extends StObject {
  
  var endDate: js.Date
  
  var periodDays: Double
  
  var repoPath: String
}
object EndDate {
  
  inline def apply(endDate: js.Date, periodDays: Double, repoPath: String): EndDate = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], periodDays = periodDays.asInstanceOf[js.Any], repoPath = repoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndDate] (val x: Self) extends AnyVal {
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setPeriodDays(value: Double): Self = StObject.set(x, "periodDays", value.asInstanceOf[js.Any])
    
    inline def setRepoPath(value: String): Self = StObject.set(x, "repoPath", value.asInstanceOf[js.Any])
  }
}
