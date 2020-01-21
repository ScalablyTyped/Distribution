package typings.pulumiAws.configurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationState extends js.Object {
  /**
    * The ARN of the configuration.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The broker configuration in XML format.
    * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
    * for supported parameters and format of the XML.
    */
  val data: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The type of broker engine.
    */
  val engineType: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the broker engine.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The latest revision of the configuration.
    */
  val latestRevision: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the configuration
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ConfigurationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    data: Input[String] = null,
    description: Input[String] = null,
    engineType: Input[String] = null,
    engineVersion: Input[String] = null,
    latestRevision: Input[Double] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ConfigurationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (engineType != null) __obj.updateDynamic("engineType")(engineType.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (latestRevision != null) __obj.updateDynamic("latestRevision")(latestRevision.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationState]
  }
}

