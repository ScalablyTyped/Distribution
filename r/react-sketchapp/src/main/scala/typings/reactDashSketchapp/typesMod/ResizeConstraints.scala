package typings.reactDashSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeConstraints extends js.Object {
  var bottom: Boolean
  var fixedHeight: Boolean
  var fixedWidth: Boolean
  var left: Boolean
  var right: Boolean
  var top: Boolean
}

object ResizeConstraints {
  @scala.inline
  def apply(
    bottom: Boolean,
    fixedHeight: Boolean,
    fixedWidth: Boolean,
    left: Boolean,
    right: Boolean,
    top: Boolean
  ): ResizeConstraints = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fixedHeight = fixedHeight.asInstanceOf[js.Any], fixedWidth = fixedWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResizeConstraints]
  }
}

