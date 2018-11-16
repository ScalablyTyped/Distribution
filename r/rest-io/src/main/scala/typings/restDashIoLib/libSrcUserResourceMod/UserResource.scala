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
  def isSelf(req: expressLib.expressMod.eNs.Request): scala.Boolean = js.native
  def login(req: expressLib.expressMod.eNs.Request, res: expressLib.expressMod.eNs.Response): scala.Unit = js.native
}

