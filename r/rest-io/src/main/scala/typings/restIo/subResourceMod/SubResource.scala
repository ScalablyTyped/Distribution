package typings.restIo.subResourceMod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.restIo.anon.Id
import typings.restIo.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubResource extends Resource {
  
  def createFindQuery(req: Request_[ParamsDictionary, _, _, Query]): Id = js.native
  
  def createProjectionQuery(req: Request_[ParamsDictionary, _, _, Query]): js.Object = js.native
  
  def createPullQuery(req: Request_[ParamsDictionary, _, _, Query]): js.Object = js.native
  
  def createSubUpdateQuery(req: Request_[ParamsDictionary, _, _, Query]): js.Object = js.native
}
