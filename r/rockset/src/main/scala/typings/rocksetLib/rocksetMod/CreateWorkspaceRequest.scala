package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkspaceRequest extends js.Object {
  // longer explanation for the workspace
  var description: js.UndefOr[java.lang.String] = js.undefined
  // descriptive label and unique identifier
  var name: java.lang.String
}

object CreateWorkspaceRequest {
  @scala.inline
  def apply(name: java.lang.String, description: java.lang.String = null): CreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[CreateWorkspaceRequest]
  }
}

