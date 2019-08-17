package typings.rsocketDashCore.rSocketBinaryFramingMod

import typings.node.Buffer
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashCore.rsocketDashCoreNumbers.`14`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`22`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`2`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`3`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`4`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`6`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`8`
import typings.rsocketDashTypes.reactiveSocketTypesMod.CancelFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.ErrorFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import typings.rsocketDashTypes.reactiveSocketTypesMod.KeepAliveFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.LeaseFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.PayloadFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestChannelFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestFnfFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestNFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestResponseFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.RequestStreamFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.ResumeFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.ResumeOkFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.SetupFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketBinaryFraming", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ERROR_FIXED_SIZE: `4` = js.native
  val FRAME_HEADER_SIZE: `6` = js.native
  val KEEPALIVE_FIXED_SIZE: `8` = js.native
  val LEASE_FIXED_SIZE: `8` = js.native
  val REQUEST_MANY_HEADER: `4` = js.native
  val REQUEST_N_HEADER: `4` = js.native
  val RESUME_FIXED_SIZE: `22` = js.native
  val RESUME_OK_FIXED_SIZE: `8` = js.native
  val RESUME_TOKEN_LENGTH_SIZE: `2` = js.native
  val SETUP_FIXED_SIZE: `14` = js.native
  val UINT24_SIZE: `3` = js.native
  def deserializeCancelFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): CancelFrame = js.native
  def deserializeErrorFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): ErrorFrame = js.native
  def deserializeFrame(buffer: Buffer): Frame = js.native
  def deserializeFrame(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  def deserializeFrameWithLength(buffer: Buffer): Frame = js.native
  def deserializeFrameWithLength(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  def deserializeFrames(buffer: Buffer): js.Tuple2[js.Array[Frame], Buffer] = js.native
  def deserializeFrames(buffer: Buffer, encoders: Encoders[_]): js.Tuple2[js.Array[Frame], Buffer] = js.native
  def deserializeKeepAliveFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): KeepAliveFrame = js.native
  def deserializeLeaseFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): LeaseFrame = js.native
  def deserializePayloadFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): PayloadFrame = js.native
  def deserializeRequestChannelFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): RequestChannelFrame = js.native
  def deserializeRequestFnfFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): RequestFnfFrame = js.native
  def deserializeRequestNFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): RequestNFrame = js.native
  def deserializeRequestResponseFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): RequestResponseFrame = js.native
  def deserializeRequestStreamFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): RequestStreamFrame = js.native
  def deserializeResumeFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): ResumeFrame = js.native
  def deserializeResumeOkFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): ResumeOkFrame = js.native
  def deserializeSetupFrame(buffer: Buffer, streamId: Double, flags: Double, encoders: Encoders[_]): SetupFrame = js.native
  def getPayloadLength(frame: FrameWithPayload, encoders: Encoders[_]): Double = js.native
  def readPayload(buffer: Buffer, frame: FrameWithPayload, encoders: Encoders[_], offset: Double): Unit = js.native
  def serializeCancelFrame(frame: CancelFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeErrorFrame(frame: ErrorFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeFrame(frame: Frame): Buffer = js.native
  def serializeFrame(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  def serializeFrameWithLength(frame: Frame): Buffer = js.native
  def serializeFrameWithLength(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  def serializeKeepAliveFrame(frame: KeepAliveFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeLeaseFrame(frame: LeaseFrame, encoders: Encoders[_]): Buffer = js.native
  def serializePayloadFrame(frame: PayloadFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeRequestFrame(frame: RequestFnfFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeRequestFrame(frame: RequestResponseFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeRequestManyFrame(frame: RequestChannelFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeRequestManyFrame(frame: RequestStreamFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeRequestNFrame(frame: RequestNFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeResumeFrame(frame: ResumeFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeResumeOkFrame(frame: ResumeOkFrame, encoders: Encoders[_]): Buffer = js.native
  def serializeSetupFrame(frame: SetupFrame, encoders: Encoders[_]): Buffer = js.native
  def writeHeader(frame: Frame, buffer: Buffer): Double = js.native
  def writePayload(frame: FrameWithPayload, buffer: Buffer, encoders: Encoders[_], offset: Double): Unit = js.native
}

