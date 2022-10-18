package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudwatchLog extends StObject {
  
  var filter: String
  
  var logGroup: String
}
object CloudwatchLog {
  
  inline def apply(filter: String, logGroup: String): CloudwatchLog = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchLog]
  }
  
  extension [Self <: CloudwatchLog](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setLogGroup(value: String): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
  }
}
