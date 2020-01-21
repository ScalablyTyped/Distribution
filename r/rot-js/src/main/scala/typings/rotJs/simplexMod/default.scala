package typings.rotJs.simplexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/noise/simplex", JSImport.Default)
@js.native
/**
  * @param gradients Random gradients
  */
class default () extends Simplex {
  def this(gradients: Double) = this()
  /* CompleteClass */
  override var _gradients: js.Array[js.Array[Double]] = js.native
  /* CompleteClass */
  override var _indexes: js.Array[Double] = js.native
  /* CompleteClass */
  override var _perms: js.Array[Double] = js.native
  /* CompleteClass */
  override def get(x: Double, y: Double): Double = js.native
}

