package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Point...
  */
trait IPoint extends js.Object {
  /**
    * x-coordinate in pixels.
    * The origin is the top left of the screen.
    */
  var qx: Double
  /**
    * y-coordinate in pixels.
    * The origin is the top left of the screen.
    */
  var qy: Double
}

object IPoint {
  @scala.inline
  def apply(qx: Double, qy: Double): IPoint = {
    val __obj = js.Dynamic.literal(qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPoint]
  }
}

