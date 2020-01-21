package typings.restIo.authorizedSubResourceMod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizedSubResource
  extends typings.restIo.authorizedResourceMod.default {
  def createFindQuery(req: Request_[ParamsDictionary]): js.Any = js.native
  def createProjectionQuery(req: Request_[ParamsDictionary]): js.Any = js.native
  def createPullQuery(req: Request_[ParamsDictionary]): js.Any = js.native
  def createSubUpdateQuery(req: Request_[ParamsDictionary]): js.Any = js.native
}

