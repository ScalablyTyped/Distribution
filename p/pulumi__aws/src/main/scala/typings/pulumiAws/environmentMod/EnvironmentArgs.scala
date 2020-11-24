package typings.pulumiAws.environmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.elasticbeanstalkMod.Application
import typings.pulumiAws.elasticbeanstalkMod.ApplicationVersion
import typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentSetting
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentArgs extends js.Object {
  
  /**
    * Name of the application that contains the version
    * to be deployed
    */
  val application: Input[String | Application] = js.native
  
  /**
    * Prefix to use for the fully qualified DNS name of
    * the Environment.
    */
  val cnamePrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * Short description of the Environment
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the Elastic Beanstalk [Platform](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
    * to use in deployment
    */
  val platformArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The time between polling the AWS API to
    * check if changes have been applied. Use this to adjust the rate of API calls
    * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
    * use the default behavior, which is an exponential backoff
    */
  val pollInterval: js.UndefOr[Input[String]] = js.native
  
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: js.UndefOr[Input[js.Array[Input[EnvironmentSetting]]]] = js.native
  
  /**
    * A solution stack to base your environment
    * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
    */
  val solutionStackName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A set of tags to apply to the Environment.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The name of the Elastic Beanstalk Configuration
    * template to use in deployment
    */
  val templateName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Elastic Beanstalk Environment tier. Valid values are `Worker`
    * or `WebServer`. If tier is left blank `WebServer` will be used.
    */
  val tier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the Elastic Beanstalk Application Version
    * to use in deployment.
    */
  val version: js.UndefOr[Input[ApplicationVersion]] = js.native
  
  /**
    * The maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
    * wait for an Elastic Beanstalk Environment to be in a ready state before timing
    * out.
    */
  val waitForReadyTimeout: js.UndefOr[Input[String]] = js.native
}
object EnvironmentArgs {
  
  @scala.inline
  def apply(application: Input[String | Application]): EnvironmentArgs = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentArgs]
  }
  
  @scala.inline
  implicit class EnvironmentArgsOps[Self <: EnvironmentArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Input[String | Application]): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCnamePrefix(value: Input[String]): Self = this.set("cnamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCnamePrefix: Self = this.set("cnamePrefix", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlatformArn(value: Input[String]): Self = this.set("platformArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformArn: Self = this.set("platformArn", js.undefined)
    
    @scala.inline
    def setPollInterval(value: Input[String]): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollInterval: Self = this.set("pollInterval", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: Input[EnvironmentSetting]*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: Input[js.Array[Input[EnvironmentSetting]]]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setSolutionStackName(value: Input[String]): Self = this.set("solutionStackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionStackName: Self = this.set("solutionStackName", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTemplateName(value: Input[String]): Self = this.set("templateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
    
    @scala.inline
    def setTier(value: Input[String]): Self = this.set("tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[ApplicationVersion]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWaitForReadyTimeout(value: Input[String]): Self = this.set("waitForReadyTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForReadyTimeout: Self = this.set("waitForReadyTimeout", js.undefined)
  }
}
