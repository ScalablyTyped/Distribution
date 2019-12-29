package typings.restDashIo

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io/lib/src/userResource", JSImport.Namespace)
@js.native
object libSrcUserResourceMod extends js.Object {
  @js.native
  trait UserResource
    extends typings.restDashIo.libSrcAuthorizedResourceMod.default {
    def createRoleModel(): Unit = js.native
    def ensureBaseUserModel(model: js.Any): Unit = js.native
    def isSelf(req: Request[ParamsDictionary]): Boolean = js.native
    def login(req: Request[ParamsDictionary], res: Response): Unit = js.native
  }
  
  @js.native
  class default () extends UserResource
  
}

