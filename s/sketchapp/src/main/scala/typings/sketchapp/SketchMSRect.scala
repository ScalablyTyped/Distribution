package typings.sketchapp

import typings.sketchapp.sketchappStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSRect extends js.Object {
  var _class: rect
  var constrainProportions: Boolean
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object SketchMSRect {
  @scala.inline
  def apply(_class: rect, constrainProportions: Boolean, height: Double, width: Double, x: Double, y: Double): SketchMSRect = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSRect]
  }
}

