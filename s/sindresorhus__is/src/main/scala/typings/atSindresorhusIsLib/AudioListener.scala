package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object AudioListener
  extends org.scalablytyped.runtime.Instantiable0[AudioListener]

