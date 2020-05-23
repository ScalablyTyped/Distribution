package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents any VR device supported by this API. It includes generic information such as device IDs and descriptions, as well as methods for starting to present a VR scene, retrieving eye parameters and display capabilities, and other important functionality. */
@js.native
trait VRDisplay extends EventTarget {
  val capabilities: VRDisplayCapabilities = js.native
  var depthFar: Double = js.native
  var depthNear: Double = js.native
  val displayId: Double = js.native
  val displayName: java.lang.String = js.native
  val isConnected: scala.Boolean = js.native
  val isPresenting: scala.Boolean = js.native
  val stageParameters: VRStageParameters | Null = js.native
  def cancelAnimationFrame(handle: Double): Unit = js.native
  def exitPresent(): js.Promise[Unit] = js.native
  def getEyeParameters(whichEye: java.lang.String): VREyeParameters = js.native
  def getFrameData(frameData: VRFrameData): scala.Boolean = js.native
  def getLayers(): js.Array[VRLayer] = js.native
  /** @deprecated */
  def getPose(): VRPose = js.native
  def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  def requestPresent(layers: js.Array[VRLayer]): js.Promise[Unit] = js.native
  def requestPresent(layers: Iterable[VRLayer]): js.Promise[Unit] = js.native
  def resetPose(): Unit = js.native
  def submitFrame(): Unit = js.native
  def submitFrame(pose: VRPose): Unit = js.native
}

