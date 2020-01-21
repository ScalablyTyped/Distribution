package typings.reactResizable.mod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], slackH = slackH.asInstanceOf[js.Any], slackW = slackW.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResizableState]
  }
}

