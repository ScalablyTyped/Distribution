package typings.restIo

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io/lib/src/userResource", JSImport.Namespace)
@js.native
object userResourceMod extends js.Object {
  @js.native
  trait UserResource
    extends typings.restIo.authorizedResourceMod.default {
    def createRoleModel(): Unit = js.native
    def ensureBaseUserModel(model: js.Any): Unit = js.native
    def isSelf(req: Request_[ParamsDictionary]): Boolean = js.native
    def login(req: Request_[ParamsDictionary], res: Response_): Unit = js.native
  }
  
  @js.native
  class default () extends UserResource
  
}

