package typings
package promiseDashSftpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  /** The buffer passed to `#read()`, but offset-adjusted */
  var buffer: nodeLib.Buffer
  /** The number of bytes successfully read */
  var bytesRead: scala.Double
  /** The position passed to `#read()` */
  var position: scala.Double
}

object Anon_Buffer {
  @scala.inline
  def apply(buffer: nodeLib.Buffer, bytesRead: scala.Double, position: scala.Double): Anon_Buffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("bytesRead")(bytesRead)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Buffer]
  }
}

