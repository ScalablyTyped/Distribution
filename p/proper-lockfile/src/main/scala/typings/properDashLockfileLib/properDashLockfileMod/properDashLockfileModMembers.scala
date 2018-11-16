package typings
package properDashLockfileLib.properDashLockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proper-lockfile", JSImport.Namespace)
@js.native
object properDashLockfileModMembers extends js.Object {
  def check(file: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def check(file: java.lang.String, options: CheckOptions): stdLib.Promise[scala.Boolean] = js.native
  def checkSync(file: java.lang.String): scala.Boolean = js.native
  def checkSync(file: java.lang.String, options: CheckOptions): scala.Boolean = js.native
  def lock(file: java.lang.String): stdLib.Promise[js.Function0[stdLib.Promise[scala.Unit]]] = js.native
  def lock(file: java.lang.String, options: LockOptions): stdLib.Promise[js.Function0[stdLib.Promise[scala.Unit]]] = js.native
  def lockSync(file: java.lang.String): js.Function0[scala.Unit] = js.native
  def lockSync(file: java.lang.String, options: LockOptions): js.Function0[scala.Unit] = js.native
  def unlock(file: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def unlock(file: java.lang.String, options: UnlockOptions): stdLib.Promise[scala.Unit] = js.native
  def unlockSync(file: java.lang.String): scala.Unit = js.native
  def unlockSync(file: java.lang.String, options: UnlockOptions): scala.Unit = js.native
}

