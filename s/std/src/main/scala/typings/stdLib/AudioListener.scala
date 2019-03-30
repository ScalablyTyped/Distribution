package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The AudioListener interface represents the position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute. */
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
  def setOrientation(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    xUp: scala.Double,
    yUp: scala.Double,
    zUp: scala.Double
  ): scala.Unit
  /** @deprecated */
  def setPosition(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit
}

@JSGlobal("AudioListener")
@js.native
class AudioListenerCls () extends AudioListener {
  /* CompleteClass */
  override val forwardX: AudioParam = js.native
  /* CompleteClass */
  override val forwardY: AudioParam = js.native
  /* CompleteClass */
  override val forwardZ: AudioParam = js.native
  /* CompleteClass */
  override val positionX: AudioParam = js.native
  /* CompleteClass */
  override val positionY: AudioParam = js.native
  /* CompleteClass */
  override val positionZ: AudioParam = js.native
  /* CompleteClass */
  override val upX: AudioParam = js.native
  /* CompleteClass */
  override val upY: AudioParam = js.native
  /* CompleteClass */
  override val upZ: AudioParam = js.native
  /** @deprecated */
  /* CompleteClass */
  override def setOrientation(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    xUp: scala.Double,
    yUp: scala.Double,
    zUp: scala.Double
  ): scala.Unit = js.native
  /** @deprecated */
  /* CompleteClass */
  override def setPosition(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
}

@JSGlobal("AudioListener")
@js.native
object AudioListener
  extends org.scalablytyped.runtime.Instantiable0[AudioListener]

