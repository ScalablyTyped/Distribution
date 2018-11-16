package typings
package rwlockLib.rwlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadWriteLock
  extends ReadWriteGeneric[rwlockLib.rwlockMod.ReadWriteLockNs.Callback] {
  var async: ReadWriteGeneric[rwlockLib.rwlockMod.ReadWriteLockNs.AsyncCallback] = js.native
}

