package typings.restIo.subResourceMod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.restIo.AnonId
import typings.restIo.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubResource extends Resource {
  def createFindQuery(req: Request_[ParamsDictionary]): AnonId = js.native
  def createProjectionQuery(req: Request_[ParamsDictionary]): js.Object = js.native
  def createPullQuery(req: Request_[ParamsDictionary]): js.Object = js.native
  def createSubUpdateQuery(req: Request_[ParamsDictionary]): js.Object = js.native
}

