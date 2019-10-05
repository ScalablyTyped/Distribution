package typings.atPulumiAws.typesInputMod.ecs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDeploymentController extends js.Object {
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object ServiceDeploymentController {
  @scala.inline
  def apply(`type`: Input[String] = null): ServiceDeploymentController = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDeploymentController]
  }
}

