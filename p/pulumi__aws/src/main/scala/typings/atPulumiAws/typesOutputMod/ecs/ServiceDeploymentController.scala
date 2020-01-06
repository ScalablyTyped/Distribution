package typings.atPulumiAws.typesOutputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDeploymentController extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object ServiceDeploymentController {
  @scala.inline
  def apply(`type`: String = null): ServiceDeploymentController = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDeploymentController]
  }
}

