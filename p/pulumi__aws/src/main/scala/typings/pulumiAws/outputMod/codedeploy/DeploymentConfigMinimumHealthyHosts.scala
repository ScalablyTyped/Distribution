package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigMinimumHealthyHosts extends js.Object {
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object DeploymentConfigMinimumHealthyHosts {
  @scala.inline
  def apply(`type`: String = null, value: Int | Double = null): DeploymentConfigMinimumHealthyHosts = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigMinimumHealthyHosts]
  }
}

