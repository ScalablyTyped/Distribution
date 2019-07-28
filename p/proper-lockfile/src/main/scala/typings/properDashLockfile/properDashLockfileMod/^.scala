package typings.properDashLockfile.properDashLockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proper-lockfile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check(file: String): js.Promise[Boolean] = js.native
  def check(file: String, options: CheckOptions): js.Promise[Boolean] = js.native
  def checkSync(file: String): Boolean = js.native
  def checkSync(file: String, options: CheckOptions): Boolean = js.native
  def lock(file: String): js.Promise[js.Function0[js.Promise[Unit]]] = js.native
  def lock(file: String, options: LockOptions): js.Promise[js.Function0[js.Promise[Unit]]] = js.native
  def lockSync(file: String): js.Function0[Unit] = js.native
  def lockSync(file: String, options: LockOptions): js.Function0[Unit] = js.native
  def unlock(file: String): js.Promise[Unit] = js.native
  def unlock(file: String, options: UnlockOptions): js.Promise[Unit] = js.native
  def unlockSync(file: String): Unit = js.native
  def unlockSync(file: String, options: UnlockOptions): Unit = js.native
}

