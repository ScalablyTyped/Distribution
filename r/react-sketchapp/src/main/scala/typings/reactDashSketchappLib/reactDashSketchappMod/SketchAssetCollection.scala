package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchAssetCollection extends js.Object {
  def colors(): js.Array[_]
  def gradients(): js.Array[_]
}

object SketchAssetCollection {
  @scala.inline
  def apply(colors: js.Function0[js.Array[_]], gradients: js.Function0[js.Array[_]]): SketchAssetCollection = {
    val __obj = js.Dynamic.literal(colors = colors, gradients = gradients)
  
    __obj.asInstanceOf[SketchAssetCollection]
  }
}

