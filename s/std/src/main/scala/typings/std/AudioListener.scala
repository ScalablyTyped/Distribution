package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute. */
trait AudioListener extends js.Object {
  val forwardX: AudioParam
  val forwardY: AudioParam
  val forwardZ: AudioParam
  val positionX: AudioParam
  val positionY: AudioParam
  val positionZ: AudioParam
  val upX: AudioParam
  val upY: AudioParam
  val upZ: AudioParam
  /** @deprecated */
  def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit
  /** @deprecated */
  def setPosition(x: Double, y: Double, z: Double): Unit
}

object AudioListener {
  @scala.inline
  def apply(
    forwardX: AudioParam,
    forwardY: AudioParam,
    forwardZ: AudioParam,
    positionX: AudioParam,
    positionY: AudioParam,
    positionZ: AudioParam,
    setOrientation: (Double, Double, Double, Double, Double, Double) => Unit,
    setPosition: (Double, Double, Double) => Unit,
    upX: AudioParam,
    upY: AudioParam,
    upZ: AudioParam
  ): AudioListener = {
    val __obj = js.Dynamic.literal(forwardX = forwardX.asInstanceOf[js.Any], forwardY = forwardY.asInstanceOf[js.Any], forwardZ = forwardZ.asInstanceOf[js.Any], positionX = positionX.asInstanceOf[js.Any], positionY = positionY.asInstanceOf[js.Any], positionZ = positionZ.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction6(setOrientation), setPosition = js.Any.fromFunction3(setPosition), upX = upX.asInstanceOf[js.Any], upY = upY.asInstanceOf[js.Any], upZ = upZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListener]
  }
}

