package typings.readConfigFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-config-file", "findAndReadConfig")
@js.native
object findAndReadConfig extends js.Object {
  def apply[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = js.native
}

