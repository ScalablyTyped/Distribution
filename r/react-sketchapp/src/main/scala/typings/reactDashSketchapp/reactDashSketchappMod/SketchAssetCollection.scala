package typings.reactDashSketchapp.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchAssetCollection extends js.Object {
  def colors(): js.Array[_]
  def gradients(): js.Array[_]
}

object SketchAssetCollection {
  @scala.inline
  def apply(colors: () => js.Array[_], gradients: () => js.Array[_]): SketchAssetCollection = {
    val __obj = js.Dynamic.literal(colors = js.Any.fromFunction0(colors), gradients = js.Any.fromFunction0(gradients))
  
    __obj.asInstanceOf[SketchAssetCollection]
  }
}

