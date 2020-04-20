package typings.pulumiAws.getLaunchConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchConfigurationArgs extends js.Object {
  /**
    * The name of the launch configuration.
    */
  val name: String = js.native
}

object GetLaunchConfigurationArgs {
  @scala.inline
  def apply(name: String): GetLaunchConfigurationArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchConfigurationArgs]
  }
}

