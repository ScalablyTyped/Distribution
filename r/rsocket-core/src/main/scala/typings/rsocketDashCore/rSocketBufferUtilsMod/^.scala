package typings.rsocketDashCore.rSocketBufferUtilsMod

import typings.node.Buffer
import typings.rsocketDashCore.rsocketDashCoreNumbers._0x100000000
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBufferUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BITWISE_OVERFLOW: _0x100000000 = js.native
  def byteLength(data: js.Any, encoding: Encoding): Double = js.native
  def createBuffer(args: js.Any*): Buffer = js.native
  def readUInt24BE(buffer: Buffer, offset: Double): Double = js.native
  def readUInt64BE(buffer: Buffer, offset: Double): Double = js.native
  def toBuffer(data: js.Any): Buffer = js.native
  def writeUInt24BE(buffer: Buffer, value: Double, offset: Double): Double = js.native
  def writeUInt64BE(buffer: Buffer, value: Double, offset: Double): Double = js.native
}

