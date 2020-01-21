package typings.promiseSftp

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  /** The buffer passed to `#read()`, but offset-adjusted */
  var buffer: Buffer
  /** The number of bytes successfully read */
  var bytesRead: Double
  /** The position passed to `#read()` */
  var position: Double
}

object AnonBuffer {
  @scala.inline
  def apply(buffer: Buffer, bytesRead: Double, position: Double): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuffer]
  }
}

