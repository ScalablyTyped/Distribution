package typings.atPulumiAws.typesOutputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDeploymentController extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object ServiceDeploymentController {
  @scala.inline
  def apply(`type`: String = null): ServiceDeploymentController = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServiceDeploymentController]
  }
}

