package typings.std

import org.scalablytyped.runtime.Instantiable0
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
  override def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit = js.native
  /** @deprecated */
  /* CompleteClass */
  override def setPosition(x: Double, y: Double, z: Double): Unit = js.native
}

@JSGlobal("AudioListener")
@js.native
object AudioListener extends Instantiable0[AudioListener]

