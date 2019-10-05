package typings.atPulumiAws.typesInputMod.elasticbeanstalk

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationTemplateSetting extends js.Object {
  /**
    * A unique name for this Template.
    */
  var name: Input[String]
  var namespace: Input[String]
  var resource: js.UndefOr[Input[String]] = js.undefined
  var value: Input[String]
}

object ConfigurationTemplateSetting {
  @scala.inline
  def apply(
    name: Input[String],
    namespace: Input[String],
    value: Input[String],
    resource: Input[String] = null
  ): ConfigurationTemplateSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationTemplateSetting]
  }
}

