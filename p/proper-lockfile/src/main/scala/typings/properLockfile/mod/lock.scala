package typings.properLockfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proper-lockfile", "lock")
@js.native
object lock extends js.Object {
  
  def apply(file: String): js.Promise[js.Function0[js.Promise[Unit]]] = js.native
  def apply(file: String, options: LockOptions): js.Promise[js.Function0[js.Promise[Unit]]] = js.native
}
