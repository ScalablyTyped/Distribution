package typings.readConfigFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("read-config-file", "loadParentConfig")
@js.native
object loadParentConfig extends js.Object {
  
  def apply[T](request: ReadConfigRequest, spec: String): js.Promise[ReadConfigResult[T]] = js.native
}
