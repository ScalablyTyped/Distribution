package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerAction extends StObject {
  
  /**
    * Arguments to be passed to the job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes.
    */
  var arguments: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * The name of the crawler to be executed. Conflicts with `jobName`.
    */
  var crawlerName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of a job to be executed. Conflicts with `crawlerName`.
    */
  var jobName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies configuration properties of a job run notification. see Notification Property details below.
    */
  var notificationProperty: js.UndefOr[Input[TriggerActionNotificationProperty]] = js.undefined
  
  /**
    * The name of the Security Configuration structure to be used with this action.
    */
  var securityConfiguration: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The job run timeout in minutes. It overrides the timeout value of the job.
    */
  var timeout: js.UndefOr[Input[Double]] = js.undefined
}
object TriggerAction {
  
  @scala.inline
  def apply(): TriggerAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerAction]
  }
  
  @scala.inline
  implicit class TriggerActionMutableBuilder[Self <: TriggerAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setCrawlerName(value: Input[String]): Self = StObject.set(x, "crawlerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlerNameUndefined: Self = StObject.set(x, "crawlerName", js.undefined)
    
    @scala.inline
    def setJobName(value: Input[String]): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    @scala.inline
    def setNotificationProperty(value: Input[TriggerActionNotificationProperty]): Self = StObject.set(x, "notificationProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationPropertyUndefined: Self = StObject.set(x, "notificationProperty", js.undefined)
    
    @scala.inline
    def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
    
    @scala.inline
    def setTimeout(value: Input[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
