package typings.reactDashResizable.reactDashResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableState extends js.Object {
  var height: Double
  var resizing: Boolean
  var slackH: Double
  var slackW: Double
  var width: Double
}

object ResizableState {
  @scala.inline
  def apply(height: Double, resizing: Boolean, slackH: Double, slackW: Double, width: Double): ResizableState = {
    val __obj = js.Dynamic.literal(height = height, resizing = resizing, slackH = slackH, slackW = slackW, width = width)
  
    __obj.asInstanceOf[ResizableState]
  }
}

