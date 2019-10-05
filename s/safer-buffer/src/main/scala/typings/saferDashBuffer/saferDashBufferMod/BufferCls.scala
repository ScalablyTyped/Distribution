package typings.saferDashBuffer.saferDashBufferMod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("safer-buffer", "Buffer")
@js.native
class BufferCls protected ()
  extends typings.node.Buffer {
  /**
    * Allocates a new buffer containing the given {str}.
    *
    * @param str String to store in buffer.
    * @param encoding encoding to use, optional.  Default is 'utf8'
    * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
    */
  def this(str: String) = this()
  /**
    * Allocates a new buffer containing the given {str}.
    *
    * @param str String to store in buffer.
    * @param encoding encoding to use, optional.  Default is 'utf8'
    * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
    */
  def this(str: String, encoding: BufferEncoding) = this()
}

