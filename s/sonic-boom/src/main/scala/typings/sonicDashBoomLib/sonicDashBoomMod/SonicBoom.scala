package typings
package sonicDashBoomLib.sonicDashBoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SonicBoom
  extends nodeLib.eventsMod.EventEmitter {
  /**
       * Closes the stream immediately, the data is not flushed.
       */
  def destroy(): scala.Unit = js.native
  /**
       * Closes the stream, the data will be flushed down asynchronously
       */
  def end(): scala.Unit = js.native
  /**
       * Writes the current buffer to the file if a write was not in progress.
       * Do nothing if minLength is zero or if it is already writing.
       */
  def flush(): scala.Unit = js.native
  /**
       * Flushes the buffered data synchronously. This is a costly operation.
       */
  def flushSync(): scala.Unit = js.native
  /**
       * Reopen the file in place, useful for log rotation.
       */
  def reopen(): scala.Unit = js.native
  /**
       * Reopen the file in place, useful for log rotation.
       */
  def reopen(fileDescriptor: java.lang.String): scala.Unit = js.native
  /**
       * Reopen the file in place, useful for log rotation.
       */
  def reopen(fileDescriptor: scala.Double): scala.Unit = js.native
  /**
       * Writes the string to the file. It will return false to signal the producer to slow down.
       */
  def write(string: java.lang.String): scala.Unit = js.native
}

