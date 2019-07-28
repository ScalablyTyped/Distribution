package typings.atPulumiAws.ec2GetLaunchConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchConfigurationArgs extends js.Object {
  /**
    * The name of the launch configuration.
    */
  val name: String
}

object GetLaunchConfigurationArgs {
  @scala.inline
  def apply(name: String): GetLaunchConfigurationArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetLaunchConfigurationArgs]
  }
}

