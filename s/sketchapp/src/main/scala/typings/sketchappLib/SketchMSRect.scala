package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSRect extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.rect
  var constrainProportions: scala.Boolean
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object SketchMSRect {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.rect,
    constrainProportions: scala.Boolean,
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSRect = {
    val __obj = js.Dynamic.literal(_class = _class, constrainProportions = constrainProportions, height = height, width = width, x = x, y = y)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSRect]
  }
}

