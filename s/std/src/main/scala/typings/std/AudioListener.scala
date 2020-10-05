package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute. */
@js.native
trait AudioListener extends js.Object {
  val forwardX: AudioParam = js.native
  val forwardY: AudioParam = js.native
  val forwardZ: AudioParam = js.native
  val positionX: AudioParam = js.native
  val positionY: AudioParam = js.native
  val positionZ: AudioParam = js.native
  val upX: AudioParam = js.native
  val upY: AudioParam = js.native
  val upZ: AudioParam = js.native
  /** @deprecated */
  def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit = js.native
  /** @deprecated */
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
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
  @scala.inline
  implicit class AudioListenerOps[Self <: AudioListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForwardX(value: AudioParam): Self = this.set("forwardX", value.asInstanceOf[js.Any])
    @scala.inline
    def setForwardY(value: AudioParam): Self = this.set("forwardY", value.asInstanceOf[js.Any])
    @scala.inline
    def setForwardZ(value: AudioParam): Self = this.set("forwardZ", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionX(value: AudioParam): Self = this.set("positionX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionY(value: AudioParam): Self = this.set("positionY", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionZ(value: AudioParam): Self = this.set("positionZ", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetOrientation(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = this.set("setOrientation", js.Any.fromFunction6(value))
    @scala.inline
    def setSetPosition(value: (Double, Double, Double) => Unit): Self = this.set("setPosition", js.Any.fromFunction3(value))
    @scala.inline
    def setUpX(value: AudioParam): Self = this.set("upX", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpY(value: AudioParam): Self = this.set("upY", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpZ(value: AudioParam): Self = this.set("upZ", value.asInstanceOf[js.Any])
  }
  
}

