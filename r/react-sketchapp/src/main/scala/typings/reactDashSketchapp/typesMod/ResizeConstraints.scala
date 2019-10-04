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
    val __obj = js.Dynamic.literal(bottom = bottom, fixedHeight = fixedHeight, fixedWidth = fixedWidth, left = left, right = right, top = top)
  
    __obj.asInstanceOf[ResizeConstraints]
  }
}

