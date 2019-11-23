package typings.rsocketDashCore

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", JSImport.Namespace)
@js.native
object rSocketBinaryFramingMod extends js.Object {
  def deserializeFrame(buffer: Buffer): Frame = js.native
  def deserializeFrame(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  def deserializeFrameWithLength(buffer: Buffer): Frame = js.native
  def deserializeFrameWithLength(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  def deserializeFrames(buffer: Buffer): js.Tuple2[js.Array[Frame], Buffer] = js.native
  def deserializeFrames(buffer: Buffer, encoders: Encoders[_]): js.Tuple2[js.Array[Frame], Buffer] = js.native
  def serializeFrame(frame: Frame): Buffer = js.native
  def serializeFrame(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  def serializeFrameWithLength(frame: Frame): Buffer = js.native
  def serializeFrameWithLength(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  def sizeOfFrame(frame: Frame): Double = js.native
  def sizeOfFrame(frame: Frame, encoders: Encoders[_]): Double = js.native
}

