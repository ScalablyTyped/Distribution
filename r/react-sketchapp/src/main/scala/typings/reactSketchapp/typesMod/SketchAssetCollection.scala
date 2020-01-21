package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchAssetCollection extends js.Object {
  def colors(): js.Array[MSColor]
  def gradients(): js.Array[MSGradient]
}

object SketchAssetCollection {
  @scala.inline
  def apply(colors: () => js.Array[MSColor], gradients: () => js.Array[MSGradient]): SketchAssetCollection = {
    val __obj = js.Dynamic.literal(colors = js.Any.fromFunction0(colors), gradients = js.Any.fromFunction0(gradients))
  
    __obj.asInstanceOf[SketchAssetCollection]
  }
}

