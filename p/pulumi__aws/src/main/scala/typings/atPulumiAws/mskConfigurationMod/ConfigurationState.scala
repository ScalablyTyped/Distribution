package typings.atPulumiAws.mskConfigurationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the configuration.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Latest revision of the configuration.
    */
  val latestRevision: js.UndefOr[Input[Double]] = js.native
  /**
    * Name of the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
    */
  val serverProperties: js.UndefOr[Input[String]] = js.native
}

object ConfigurationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    kafkaVersions: Input[js.Array[Input[String]]] = null,
    latestRevision: Input[Double] = null,
    name: Input[String] = null,
    serverProperties: Input[String] = null
  ): ConfigurationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (kafkaVersions != null) __obj.updateDynamic("kafkaVersions")(kafkaVersions.asInstanceOf[js.Any])
    if (latestRevision != null) __obj.updateDynamic("latestRevision")(latestRevision.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serverProperties != null) __obj.updateDynamic("serverProperties")(serverProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationState]
  }
}

