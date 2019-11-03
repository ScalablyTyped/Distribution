package typings.restDashIo.libSrcSubResourceMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.restDashIo.Anon_Id
import typings.restDashIo.libSrcResourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubResource extends Resource {
  def createFindQuery(req: Request[ParamsDictionary]): Anon_Id = js.native
  def createProjectionQuery(req: Request[ParamsDictionary]): js.Object = js.native
  def createPullQuery(req: Request[ParamsDictionary]): js.Object = js.native
  def createSubUpdateQuery(req: Request[ParamsDictionary]): js.Object = js.native
}

