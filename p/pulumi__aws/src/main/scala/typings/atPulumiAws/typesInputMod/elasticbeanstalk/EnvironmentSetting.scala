package typings.atPulumiAws.typesInputMod.elasticbeanstalk

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentSetting extends js.Object {
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  var name: Input[String]
  var namespace: Input[String]
  var resource: js.UndefOr[Input[String]] = js.undefined
  var value: Input[String]
}

object EnvironmentSetting {
  @scala.inline
  def apply(
    name: Input[String],
    namespace: Input[String],
    value: Input[String],
    resource: Input[String] = null
  ): EnvironmentSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentSetting]
  }
}

