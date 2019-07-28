package typings.sketchapp

import typings.sketchapp.sketchappStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSRect extends js.Object {
  var _class: rect
  var constrainProportions: Boolean
  var do_objectID: js.UndefOr[String] = js.undefined
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object SketchMSRect {
  @scala.inline
  def apply(
    _class: rect,
    constrainProportions: Boolean,
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    do_objectID: String = null
  ): SketchMSRect = {
    val __obj = js.Dynamic.literal(_class = _class, constrainProportions = constrainProportions, height = height, width = width, x = x, y = y)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSRect]
  }
}

