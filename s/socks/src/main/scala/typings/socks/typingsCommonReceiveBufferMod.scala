package typings.socks

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socks/typings/common/receiveBuffer", JSImport.Namespace)
@js.native
object typingsCommonReceiveBufferMod extends js.Object {
  @js.native
  class ReceiveBuffer () extends js.Object {
    def this(size: Double) = this()
    var _buffer: js.Any = js.native
    var _offset: js.Any = js.native
    var _originalSize: js.Any = js.native
    val length: Double = js.native
    def append(data: Buffer): Double = js.native
    def get(length: Double): Buffer = js.native
    def peek(length: Double): Buffer = js.native
  }
  
}

