package typings.scrypt.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrypt", "kdf")
@js.native
object kdf extends js.Object {
  
  def apply(key: String, paramsObject: Params_): js.Promise[Buffer] = js.native
  def apply(
    key: String,
    paramsObject: Params_,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def apply(key: Buffer, paramsObject: Params_): js.Promise[Buffer] = js.native
  def apply(
    key: Buffer,
    paramsObject: Params_,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
}
