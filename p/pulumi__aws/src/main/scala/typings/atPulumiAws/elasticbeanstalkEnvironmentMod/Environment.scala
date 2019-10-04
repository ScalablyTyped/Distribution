package typings.atPulumiAws.elasticbeanstalkEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.elasticbeanstalkApplicationMod.Application
import typings.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersion
import typings.atPulumiAws.typesOutputMod.elasticbeanstalkNs.EnvironmentAllSetting
import typings.atPulumiAws.typesOutputMod.elasticbeanstalkNs.EnvironmentSetting
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk/environment", "Environment")
@js.native
class Environment protected () extends CustomResource {
  /**
    * Create a Environment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EnvironmentArgs) = this()
  def this(name: String, args: EnvironmentArgs, opts: CustomResourceOptions) = this()
  /**
    * List of all option settings configured in this Environment. These
    * are a combination of default settings and their overrides from `setting` in
    * the configuration.
    */
  val allSettings: Output[js.Array[EnvironmentAllSetting]] = js.native
  /**
    * Name of the application that contains the version
    * to be deployed
    */
  val application: Output[Application] = js.native
  val arn: Output[String] = js.native
  /**
    * The autoscaling groups used by this Environment.
    */
  val autoscalingGroups: Output[js.Array[String]] = js.native
  /**
    * Fully qualified DNS name for this Environment.
    */
  val cname: Output[String] = js.native
  /**
    * Prefix to use for the fully qualified DNS name of
    * the Environment.
    */
  val cnamePrefix: Output[String] = js.native
  /**
    * Short description of the Environment
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The URL to the Load Balancer for this Environment
    */
  val endpointUrl: Output[String] = js.native
  /**
    * Instances used by this Environment.
    */
  val instances: Output[js.Array[String]] = js.native
  /**
    * Launch configurations in use by this Environment.
    */
  val launchConfigurations: Output[js.Array[String]] = js.native
  /**
    * Elastic load balancers in use by this Environment.
    */
  val loadBalancers: Output[js.Array[String]] = js.native
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  val name: Output[String] = js.native
  /**
    * The [ARN][2] of the Elastic Beanstalk [Platform][3]
    * to use in deployment
    */
  val platformArn: Output[String] = js.native
  /**
    * The time between polling the AWS API to
    * check if changes have been applied. Use this to adjust the rate of API calls
    * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
    * use the default behavior, which is an exponential backoff
    */
  val pollInterval: Output[js.UndefOr[String]] = js.native
  /**
    * SQS queues in use by this Environment.
    */
  val queues: Output[js.Array[String]] = js.native
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: Output[js.UndefOr[js.Array[EnvironmentSetting]]] = js.native
  /**
    * A solution stack to base your environment
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: Output[String] = js.native
  /**
    * A set of tags to apply to the Environment.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The name of the Elastic Beanstalk Configuration
    * template to use in deployment
    */
  val templateName: Output[js.UndefOr[String]] = js.native
  /**
    * Elastic Beanstalk Environment tier. Valid values are `Worker`
    * or `WebServer`. If tier is left blank `WebServer` will be used.
    */
  val tier: Output[js.UndefOr[String]] = js.native
  /**
    * Autoscaling triggers in use by this Environment.
    */
  val triggers: Output[js.Array[String]] = js.native
  /**
    * The name of the Elastic Beanstalk Application Version
    * to use in deployment.
    */
  val version: Output[ApplicationVersion] = js.native
  /**
    * The maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
    * wait for an Elastic Beanstalk Environment to be in a ready state before timing
    * out.
    */
  val waitForReadyTimeout: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticbeanstalk/environment", "Environment")
@js.native
object Environment extends js.Object {
  /**
    * Get an existing Environment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Environment = js.native
  def get(name: String, id: Input[ID], state: EnvironmentState): Environment = js.native
  def get(name: String, id: Input[ID], state: EnvironmentState, opts: CustomResourceOptions): Environment = js.native
  /**
    * Returns true if the given object is an instance of Environment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean = js.native
}

