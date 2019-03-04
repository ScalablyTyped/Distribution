package typings
package reactDashResizableLib.reactDashResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableState extends js.Object {
  var height: scala.Double
  var resizing: scala.Boolean
  var slackH: scala.Double
  var slackW: scala.Double
  var width: scala.Double
}

object ResizableState {
  @scala.inline
  def apply(
    height: scala.Double,
    resizing: scala.Boolean,
    slackH: scala.Double,
    slackW: scala.Double,
    width: scala.Double
  ): ResizableState = {
    val __obj = js.Dynamic.literal(height = height, resizing = resizing, slackH = slackH, slackW = slackW, width = width)
  
    __obj.asInstanceOf[ResizableState]
  }
}

