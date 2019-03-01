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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("resizing")(resizing)
    __obj.updateDynamic("slackH")(slackH)
    __obj.updateDynamic("slackW")(slackW)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ResizableState]
  }
}

