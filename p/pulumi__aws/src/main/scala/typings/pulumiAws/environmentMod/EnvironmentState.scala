package typings.pulumiAws.environmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.applicationVersionMod.ApplicationVersion
import typings.pulumiAws.elasticbeanstalkApplicationMod.Application
import typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentAllSetting
import typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentSetting
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentState extends js.Object {
  /**
    * List of all option settings configured in this Environment. These
    * are a combination of default settings and their overrides from `setting` in
    * the configuration.
    */
  val allSettings: js.UndefOr[Input[js.Array[Input[EnvironmentAllSetting]]]] = js.native
  /**
    * Name of the application that contains the version
    * to be deployed
    */
  val application: js.UndefOr[Input[String | Application]] = js.native
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The autoscaling groups used by this Environment.
    */
  val autoscalingGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Fully qualified DNS name for this Environment.
    */
  val cname: js.UndefOr[Input[String]] = js.native
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
    * The URL to the Load Balancer for this Environment
    */
  val endpointUrl: js.UndefOr[Input[String]] = js.native
  /**
    * Instances used by this Environment.
    */
  val instances: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Launch configurations in use by this Environment.
    */
  val launchConfigurations: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Elastic load balancers in use by this Environment.
    */
  val loadBalancers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The [ARN][2] of the Elastic Beanstalk [Platform][3]
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
    * SQS queues in use by this Environment.
    */
  val queues: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: js.UndefOr[Input[js.Array[Input[EnvironmentSetting]]]] = js.native
  /**
    * A solution stack to base your environment
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: js.UndefOr[Input[String]] = js.native
  /**
    * A set of tags to apply to the Environment.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
    * Autoscaling triggers in use by this Environment.
    */
  val triggers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
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

object EnvironmentState {
  @scala.inline
  def apply(
    allSettings: Input[js.Array[Input[EnvironmentAllSetting]]] = null,
    application: Input[String | Application] = null,
    arn: Input[String] = null,
    autoscalingGroups: Input[js.Array[Input[String]]] = null,
    cname: Input[String] = null,
    cnamePrefix: Input[String] = null,
    description: Input[String] = null,
    endpointUrl: Input[String] = null,
    instances: Input[js.Array[Input[String]]] = null,
    launchConfigurations: Input[js.Array[Input[String]]] = null,
    loadBalancers: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    platformArn: Input[String] = null,
    pollInterval: Input[String] = null,
    queues: Input[js.Array[Input[String]]] = null,
    settings: Input[js.Array[Input[EnvironmentSetting]]] = null,
    solutionStackName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    templateName: Input[String] = null,
    tier: Input[String] = null,
    triggers: Input[js.Array[Input[String]]] = null,
    version: Input[ApplicationVersion] = null,
    waitForReadyTimeout: Input[String] = null
  ): EnvironmentState = {
    val __obj = js.Dynamic.literal()
    if (allSettings != null) __obj.updateDynamic("allSettings")(allSettings.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (autoscalingGroups != null) __obj.updateDynamic("autoscalingGroups")(autoscalingGroups.asInstanceOf[js.Any])
    if (cname != null) __obj.updateDynamic("cname")(cname.asInstanceOf[js.Any])
    if (cnamePrefix != null) __obj.updateDynamic("cnamePrefix")(cnamePrefix.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl.asInstanceOf[js.Any])
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (launchConfigurations != null) __obj.updateDynamic("launchConfigurations")(launchConfigurations.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformArn != null) __obj.updateDynamic("platformArn")(platformArn.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (queues != null) __obj.updateDynamic("queues")(queues.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (solutionStackName != null) __obj.updateDynamic("solutionStackName")(solutionStackName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (templateName != null) __obj.updateDynamic("templateName")(templateName.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (waitForReadyTimeout != null) __obj.updateDynamic("waitForReadyTimeout")(waitForReadyTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentState]
  }
}

