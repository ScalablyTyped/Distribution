package typings
package atPulumiAwsLib.elasticbeanstalkEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk/environment", "Environment")
@js.native
class Environment protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Environment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: EnvironmentArgs) = this()
  def this(name: java.lang.String, args: EnvironmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * List of all option settings configured in the Environment. These
    * are a combination of default settings and their overrides from `setting` in
    * the configuration.
    */
  val allSettings: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiAwsLib.Anon_NamespaceResourceValue]] = js.native
  /**
    * Name of the application that contains the version
    * to be deployed
    */
  val application: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.elasticbeanstalkApplicationMod.Application] = js.native
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The autoscaling groups used by this environment.
    */
  val autoscalingGroups: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Fully qualified DNS name for the Environment.
    */
  val cname: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Prefix to use for the fully qualified DNS name of
    * the Environment.
    */
  val cnamePrefix: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Short description of the Environment
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Instances used by this environment.
    */
  val instances: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Launch configurations in use by this environment.
    */
  val launchConfigurations: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Elastic load balancers in use by this environment.
    */
  val loadBalancers: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The [ARN][2] of the Elastic Beanstalk [Platform][3]
    * to use in deployment
    */
  val platformArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The time between polling the AWS API to
    * check if changes have been applied. Use this to adjust the rate of API calls
    * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
    * use the default behavior, which is an exponential backoff
    */
  val pollInterval: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * SQS queues in use by this environment.
    */
  val queues: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_NamespaceResourceValue]]] = js.native
  /**
    * A solution stack to base your environment
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A set of tags to apply to the Environment.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The name of the Elastic Beanstalk Configuration
    * template to use in deployment
    */
  val templateName: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Elastic Beanstalk Environment tier. Valid values are `Worker`
    * or `WebServer`. If tier is left blank `WebServer` will be used.
    */
  val tier: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Autoscaling triggers in use by this environment.
    */
  val triggers: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The name of the Elastic Beanstalk Application Version
    * to use in deployment.
    */
  val version: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion] = js.native
  /**
    * The maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that Terraform should
    * wait for an Elastic Beanstalk Environment to be in a ready state before timing
    * out.
    */
  val waitForReadyTimeout: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticbeanstalkEnvironmentMod.Environment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticbeanstalkEnvironmentMod.EnvironmentState
  ): atPulumiAwsLib.elasticbeanstalkEnvironmentMod.Environment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticbeanstalkEnvironmentMod.EnvironmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticbeanstalkEnvironmentMod.Environment = js.native
}

