package typings
package atPulumiAwsLib.ec2GetLaunchConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchConfigurationArgs extends js.Object {
  /**
    * The name of the launch configuration.
    */
  val name: java.lang.String
}

object GetLaunchConfigurationArgs {
  @scala.inline
  def apply(name: java.lang.String): GetLaunchConfigurationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetLaunchConfigurationArgs]
  }
}

