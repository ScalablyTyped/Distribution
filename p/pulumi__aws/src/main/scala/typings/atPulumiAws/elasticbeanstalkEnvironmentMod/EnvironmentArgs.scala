package typings.atPulumiAws.elasticbeanstalkEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameNamespaceResource
import typings.atPulumiAws.elasticbeanstalkApplicationMod.Application
import typings.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersion
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentArgs extends js.Object {
  /**
    * Name of the application that contains the version
    * to be deployed
    */
  val application: Input[Application]
  /**
    * Prefix to use for the fully qualified DNS name of
    * the Environment.
    */
  val cnamePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Short description of the Environment
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The [ARN][2] of the Elastic Beanstalk [Platform][3]
    * to use in deployment
    */
  val platformArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The time between polling the AWS API to
    * check if changes have been applied. Use this to adjust the rate of API calls
    * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
    * use the default behavior, which is an exponential backoff
    */
  val pollInterval: js.UndefOr[Input[String]] = js.undefined
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: js.UndefOr[Input[js.Array[Input[Anon_NameNamespaceResource]]]] = js.undefined
  /**
    * A solution stack to base your environment
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A set of tags to apply to the Environment.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The name of the Elastic Beanstalk Configuration
    * template to use in deployment
    */
  val templateName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Elastic Beanstalk Environment tier. Valid values are `Worker`
    * or `WebServer`. If tier is left blank `WebServer` will be used.
    */
  val tier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the Elastic Beanstalk Application Version
    * to use in deployment.
    */
  val version: js.UndefOr[Input[ApplicationVersion]] = js.undefined
  /**
    * The maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
    * wait for an Elastic Beanstalk Environment to be in a ready state before timing
    * out.
    */
  val waitForReadyTimeout: js.UndefOr[Input[String]] = js.undefined
}

object EnvironmentArgs {
  @scala.inline
  def apply(
    application: Input[Application],
    cnamePrefix: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    platformArn: Input[String] = null,
    pollInterval: Input[String] = null,
    settings: Input[js.Array[Input[Anon_NameNamespaceResource]]] = null,
    solutionStackName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    templateName: Input[String] = null,
    tier: Input[String] = null,
    version: Input[ApplicationVersion] = null,
    waitForReadyTimeout: Input[String] = null
  ): EnvironmentArgs = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    if (cnamePrefix != null) __obj.updateDynamic("cnamePrefix")(cnamePrefix.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformArn != null) __obj.updateDynamic("platformArn")(platformArn.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (solutionStackName != null) __obj.updateDynamic("solutionStackName")(solutionStackName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (templateName != null) __obj.updateDynamic("templateName")(templateName.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (waitForReadyTimeout != null) __obj.updateDynamic("waitForReadyTimeout")(waitForReadyTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentArgs]
  }
}

