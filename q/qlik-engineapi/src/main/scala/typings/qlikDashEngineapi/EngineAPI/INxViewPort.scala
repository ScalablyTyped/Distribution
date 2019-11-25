package typings.qlikDashEngineapi.EngineAPI

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
  var qHeight: Double
  /**
    * Width of the canvas in pixels.
    */
  var qWidth: Double
  /*
    * Zoom level.
    */
  var qZoomLevel: Double
}

object INxViewPort {
  @scala.inline
  def apply(qHeight: Double, qWidth: Double, qZoomLevel: Double): INxViewPort = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qWidth = qWidth.asInstanceOf[js.Any], qZoomLevel = qZoomLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxViewPort]
  }
}

