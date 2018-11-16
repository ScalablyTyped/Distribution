package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRDisplay extends EventTarget {
  val capabilities: VRDisplayCapabilities = js.native
  var depthFar: scala.Double = js.native
  var depthNear: scala.Double = js.native
  val displayId: scala.Double = js.native
  val displayName: java.lang.String = js.native
  val isConnected: scala.Boolean = js.native
  val isPresenting: scala.Boolean = js.native
  val stageParameters: VRStageParameters | scala.Null = js.native
  def cancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  def exitPresent(): Promise[scala.Unit] = js.native
  def getEyeParameters(whichEye: java.lang.String): VREyeParameters = js.native
  def getFrameData(frameData: VRFrameData): scala.Boolean = js.native
  def getLayers(): js.Array[VRLayer] = js.native
  /** @deprecated */
  def getPose(): VRPose = js.native
  def requestAnimationFrame(callback: FrameRequestCallback): scala.Double = js.native
  def requestPresent(layers: js.Array[VRLayer]): Promise[scala.Unit] = js.native
  def resetPose(): scala.Unit = js.native
  def submitFrame(): scala.Unit = js.native
  def submitFrame(pose: VRPose): scala.Unit = js.native
}

@JSGlobal("VRDisplay")
@js.native
object VRDisplay
  extends ScalablyTyped.runtime.Instantiable0[VRDisplay]

