package typings.pulumiAws.inputMod.elasticbeanstalk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationTemplateSetting extends js.Object {
  /**
    * A unique name for this Template.
    */
  var name: Input[String] = js.native
  var namespace: Input[String] = js.native
  var resource: js.UndefOr[Input[String]] = js.native
  var value: Input[String] = js.native
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

