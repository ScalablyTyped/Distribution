package typings.sonicDashBoom.sonicDashBoomMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SonicBoom extends EventEmitter {
  /**
    * Closes the stream immediately, the data is not flushed.
    */
  def destroy(): Unit = js.native
  /**
    * Closes the stream, the data will be flushed down asynchronously
    */
  def end(): Unit = js.native
  /**
    * Writes the current buffer to the file if a write was not in progress.
    * Do nothing if minLength is zero or if it is already writing.
    */
  def flush(): Unit = js.native
  /**
    * Flushes the buffered data synchronously. This is a costly operation.
    */
  def flushSync(): Unit = js.native
  /**
    * Reopen the file in place, useful for log rotation.
    */
  def reopen(): Unit = js.native
  def reopen(fileDescriptor: String): Unit = js.native
  def reopen(fileDescriptor: Double): Unit = js.native
  /**
    * Writes the string to the file. It will return false to signal the producer to slow down.
    */
  def write(string: String): Unit = js.native
}

