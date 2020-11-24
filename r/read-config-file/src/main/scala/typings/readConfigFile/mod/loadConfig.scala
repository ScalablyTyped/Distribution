package typings.readConfigFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("read-config-file", "loadConfig")
@js.native
object loadConfig extends js.Object {
  
  def apply[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = js.native
}
