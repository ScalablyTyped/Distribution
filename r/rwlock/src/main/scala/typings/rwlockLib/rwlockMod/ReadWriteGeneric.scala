package typings
package rwlockLib.rwlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadWriteGeneric[T] extends js.Object {
  def readLock(callback: T): scala.Unit = js.native
  def readLock(callback: T, options: Options): scala.Unit = js.native
  def readLock(key: java.lang.String, callback: T): scala.Unit = js.native
  def readLock(key: java.lang.String, callback: T, options: Options): scala.Unit = js.native
  def writeLock(callback: T): scala.Unit = js.native
  def writeLock(callback: T, options: Options): scala.Unit = js.native
  def writeLock(key: java.lang.String, callback: T): scala.Unit = js.native
  def writeLock(key: java.lang.String, callback: T, options: Options): scala.Unit = js.native
}

