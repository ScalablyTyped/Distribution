package typings.restDashIo.libSrcUserResourceMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserResource
  extends typings.restDashIo.libSrcAuthorizedResourceMod.default {
  def createRoleModel(): Unit = js.native
  def ensureBaseUserModel(model: js.Any): Unit = js.native
  def isSelf(req: Request): Boolean = js.native
  def login(req: Request, res: Response): Unit = js.native
}

