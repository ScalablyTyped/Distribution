package typings.promiseDashSftp

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  /** The buffer passed to `#read()`, but offset-adjusted */
  var buffer: Buffer
  /** The number of bytes successfully read */
  var bytesRead: Double
  /** The position passed to `#read()` */
  var position: Double
}

object Anon_Buffer {
  @scala.inline
  def apply(buffer: Buffer, bytesRead: Double, position: Double): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead, position = position)
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

