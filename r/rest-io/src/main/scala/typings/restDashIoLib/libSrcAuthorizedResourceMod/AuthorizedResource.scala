package typings
package restDashIoLib.libSrcAuthorizedResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizedResource
  extends restDashIoLib.libSrcResourceMod.Resource {
  var maxDays: scala.Double = js.native
  var methodAccess: IMethodAccess = js.native
  var permissions: IMethodAccess = js.native
  def baseCreate(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
  def baseDel(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
  def baseGetAll(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
  def baseGetById(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
  def baseUpdate(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
  def getRoles(id: java.lang.String): js.Any = js.native
  def hasAccessRightsDefined(req: expressLib.expressMod.Request, authorizedRoles: js.Array[java.lang.String]): js.Any = js.native
  def hasAuthorizedRole(roles: js.Array[_], authorizedRoles: js.Array[java.lang.String]): scala.Boolean = js.native
  def isAuthorized(req: expressLib.expressMod.Request, authorizedRoles: js.Array[java.lang.String]): js.Any = js.native
  def isTokenExpired(createdAt: stdLib.Date): scala.Boolean = js.native
  def sendUnauthorized(error: stdLib.Error, res: expressLib.expressMod.Response): scala.Unit = js.native
}

