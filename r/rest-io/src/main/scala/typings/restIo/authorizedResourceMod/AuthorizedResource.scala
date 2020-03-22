package typings.restIo.authorizedResourceMod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.restIo.resourceMod.Resource
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizedResource extends Resource {
  var maxDays: Double = js.native
  var methodAccess: IMethodAccess = js.native
  var permissions: IMethodAccess = js.native
  def baseCreate(req: Request_[ParamsDictionary], res: Response_[_]): Unit = js.native
  def baseDel(req: Request_[ParamsDictionary], res: Response_[_]): Unit = js.native
  def baseGetAll(req: Request_[ParamsDictionary], res: Response_[_]): Unit = js.native
  def baseGetById(req: Request_[ParamsDictionary], res: Response_[_]): Unit = js.native
  def baseUpdate(req: Request_[ParamsDictionary], res: Response_[_]): Unit = js.native
  def getRoles(id: String): js.Any = js.native
  def hasAccessRightsDefined(req: Request_[ParamsDictionary], authorizedRoles: js.Array[String]): js.Any = js.native
  def hasAuthorizedRole(roles: js.Array[_], authorizedRoles: js.Array[String]): Boolean = js.native
  def isAuthorized(req: Request_[ParamsDictionary], authorizedRoles: js.Array[String]): js.Any = js.native
  def isTokenExpired(createdAt: Date): Boolean = js.native
  def sendUnauthorized(error: Error, res: Response_[_]): Unit = js.native
}

