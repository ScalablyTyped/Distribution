package typings.qDashIo

import org.scalablytyped.runtime.Instantiable0
import typings.node.Buffer
import typings.qDashIo.QioNs.Reader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QioBufferReader extends Instantiable0[Reader] {
  def join(buffers: js.Array[Buffer]): Buffer = js.native
  def read(stream: Reader): Buffer = js.native
  def read(stream: Reader, charset: String): String = js.native
}

