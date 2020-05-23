package typings.promiseSftp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  /** The buffer passed to `#read()`, but offset-adjusted */
  var buffer: typings.node.Buffer
  /** The number of bytes successfully read */
  var bytesRead: Double
  /** The position passed to `#read()` */
  var position: Double
}

object Buffer {
  @scala.inline
  def apply(buffer: typings.node.Buffer, bytesRead: Double, position: Double): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

