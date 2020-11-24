package typings.restIo

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rest-io/lib/src/userResource", JSImport.Namespace)
@js.native
object userResourceMod extends js.Object {
  
  @js.native
  trait UserResource
    extends typings.restIo.authorizedResourceMod.default {
    
    def createRoleModel(): Unit = js.native
    
    def ensureBaseUserModel(model: js.Any): Unit = js.native
    
    def isSelf(req: Request_[ParamsDictionary, _, _, Query]): Boolean = js.native
    
    def login(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  }
  
  @js.native
  class default () extends UserResource
}
