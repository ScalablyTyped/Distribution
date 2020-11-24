package typings.ssbKeys.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssb-keys", "loadOrCreate")
@js.native
object loadOrCreate extends js.Object {
  
  def apply(filename: String, cb: js.Function2[/* err */ Error | Null, /* keys */ Keys, _]): Unit = js.native
}
