package typings.reachRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateFn extends js.Object {
  def apply(to: String): js.Promise[Unit] = js.native
  def apply(to: String, options: NavigateOptions[js.Object]): js.Promise[Unit] = js.native
  def apply(to: Double): js.Promise[Unit] = js.native
}

