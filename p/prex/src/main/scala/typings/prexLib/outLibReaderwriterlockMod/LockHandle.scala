package typings
package prexLib.outLibReaderwriterlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockHandle extends js.Object {
  /**
    * Releases the lock.
    */
  def release(): scala.Unit
}

object LockHandle {
  @scala.inline
  def apply(release: js.Function0[scala.Unit]): LockHandle = {
    val __obj = js.Dynamic.literal(release = release)
  
    __obj.asInstanceOf[LockHandle]
  }
}

