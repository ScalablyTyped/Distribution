package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkspaceRequest extends js.Object {
  // longer explanation for the workspace
  var description: js.UndefOr[String] = js.undefined
  // descriptive label and unique identifier
  var name: String
}

object CreateWorkspaceRequest {
  @scala.inline
  def apply(name: String, description: String = null): CreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[CreateWorkspaceRequest]
  }
}

