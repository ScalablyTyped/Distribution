package typings.smartystreetsJavascriptSdk.mod.core

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "core.StaticCredentials")
@js.native
class StaticCredentials protected () extends js.Object {
  def this(authId: String, authToken: String) = this()
  
  def sign(request: Request_[ParamsDictionary, _, _, Query]): js.Any = js.native
}
