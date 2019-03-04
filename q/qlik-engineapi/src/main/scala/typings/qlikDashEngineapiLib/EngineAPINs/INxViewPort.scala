package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxViewPort...
  */
trait INxViewPort extends js.Object {
  /**
    * Height of the canvas in pixels.
    */
  var qHeight: scala.Double
  /**
    * Width of the canvas in pixels.
    */
  var qWidth: scala.Double
  /*
    * Zoom level.
    */
  var qZoomLevel: scala.Double
}

object INxViewPort {
  @scala.inline
  def apply(qHeight: scala.Double, qWidth: scala.Double, qZoomLevel: scala.Double): INxViewPort = {
    val __obj = js.Dynamic.literal(qHeight = qHeight, qWidth = qWidth, qZoomLevel = qZoomLevel)
  
    __obj.asInstanceOf[INxViewPort]
  }
}

