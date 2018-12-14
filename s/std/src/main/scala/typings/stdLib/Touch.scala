package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Touch extends js.Object {
  val altitudeAngle: scala.Double
  val azimuthAngle: scala.Double
  val clientX: scala.Double
  val clientY: scala.Double
  val force: scala.Double
  val identifier: scala.Double
  val pageX: scala.Double
  val pageY: scala.Double
  val radiusX: scala.Double
  val radiusY: scala.Double
  val rotationAngle: scala.Double
  val screenX: scala.Double
  val screenY: scala.Double
  val target: EventTarget
  val touchType: TouchType
}

@JSGlobal("Touch")
@js.native
object Touch
  extends org.scalablytyped.runtime.Instantiable1[/* touchInitDict */ TouchInit, Touch]

