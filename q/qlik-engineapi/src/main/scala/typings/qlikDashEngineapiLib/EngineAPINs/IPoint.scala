package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qx: scala.Double
  /**
    * y-coordinate in pixels.
    * The origin is the top left of the screen.
    */
  var qy: scala.Double
}

object IPoint {
  @scala.inline
  def apply(qx: scala.Double, qy: scala.Double): IPoint = {
    val __obj = js.Dynamic.literal(qx = qx, qy = qy)
  
    __obj.asInstanceOf[IPoint]
  }
}

