package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudwatchLog extends StObject {
  
  var filter: String = js.native
  
  var logGroup: String = js.native
}
object CloudwatchLog {
  
  @scala.inline
  def apply(filter: String, logGroup: String): CloudwatchLog = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchLog]
  }
  
  @scala.inline
  implicit class CloudwatchLogMutableBuilder[Self <: CloudwatchLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroup(value: String): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
  }
}
