package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerAction extends StObject {
  
  /**
    * Arguments to be passed to the job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes.
    */
  var arguments: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The name of the crawler to be executed. Conflicts with `jobName`.
    */
  var crawlerName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a job to be executed. Conflicts with `crawlerName`.
    */
  var jobName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies configuration properties of a job run notification. see Notification Property details below.
    */
  var notificationProperty: js.UndefOr[TriggerActionNotificationProperty] = js.undefined
  
  /**
    * The name of the Security Configuration structure to be used with this action.
    */
  var securityConfiguration: js.UndefOr[String] = js.undefined
  
  /**
    * The job run timeout in minutes. It overrides the timeout value of the job.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object TriggerAction {
  
  inline def apply(): TriggerAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerAction]
  }
  
  extension [Self <: TriggerAction](x: Self) {
    
    inline def setArguments(value: StringDictionary[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setCrawlerName(value: String): Self = StObject.set(x, "crawlerName", value.asInstanceOf[js.Any])
    
    inline def setCrawlerNameUndefined: Self = StObject.set(x, "crawlerName", js.undefined)
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setNotificationProperty(value: TriggerActionNotificationProperty): Self = StObject.set(x, "notificationProperty", value.asInstanceOf[js.Any])
    
    inline def setNotificationPropertyUndefined: Self = StObject.set(x, "notificationProperty", js.undefined)
    
    inline def setSecurityConfiguration(value: String): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
