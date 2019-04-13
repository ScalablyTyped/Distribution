package typings
package restDashIoLib.libSrcUserResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserResource
  extends restDashIoLib.libSrcAuthorizedResourceMod.default {
  def createRoleModel(): scala.Unit = js.native
  def ensureBaseUserModel(model: js.Any): scala.Unit = js.native
  def isSelf(req: expressLib.expressMod.Request): scala.Boolean = js.native
  def login(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
}

