package typings.atPulumiAws.mqConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationArgs extends js.Object {
  /**
    * The broker configuration in XML format.
    * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
    * for supported parameters and format of the XML.
    */
  val data: Input[String]
  /**
    * The description of the configuration.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of broker engine.
    */
  val engineType: Input[String]
  /**
    * The version of the broker engine.
    */
  val engineVersion: Input[String]
  /**
    * The name of the configuration
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ConfigurationArgs {
  @scala.inline
  def apply(
    data: Input[String],
    engineType: Input[String],
    engineVersion: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ConfigurationArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationArgs]
  }
}

