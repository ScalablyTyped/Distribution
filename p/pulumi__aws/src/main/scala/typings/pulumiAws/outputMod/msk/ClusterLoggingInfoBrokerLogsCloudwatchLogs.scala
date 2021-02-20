package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterLoggingInfoBrokerLogsCloudwatchLogs extends StObject {
  
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Boolean = js.native
  
  /**
    * Name of the Cloudwatch Log Group to deliver logs to.
    */
  var logGroup: js.UndefOr[String] = js.native
}
object ClusterLoggingInfoBrokerLogsCloudwatchLogs {
  
  @scala.inline
  def apply(enabled: Boolean): ClusterLoggingInfoBrokerLogsCloudwatchLogs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsCloudwatchLogs]
  }
  
  @scala.inline
  implicit class ClusterLoggingInfoBrokerLogsCloudwatchLogsMutableBuilder[Self <: ClusterLoggingInfoBrokerLogsCloudwatchLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroup(value: String): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupUndefined: Self = StObject.set(x, "logGroup", js.undefined)
  }
}
