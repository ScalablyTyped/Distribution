package typings.properLockfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proper-lockfile", "check")
@js.native
object check extends js.Object {
  
  def apply(file: String): js.Promise[Boolean] = js.native
  def apply(file: String, options: CheckOptions): js.Promise[Boolean] = js.native
}
