package typings.rotJs.simplexMod

import typings.rotJs.noiseNoiseMod.Noise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Simplex extends Noise {
  var _gradients: js.Array[js.Array[Double]] = js.native
  var _indexes: js.Array[Double] = js.native
  var _perms: js.Array[Double] = js.native
}

object Simplex {
  @scala.inline
  def apply(
    _gradients: js.Array[js.Array[Double]],
    _indexes: js.Array[Double],
    _perms: js.Array[Double],
    get: (Double, Double) => Double
  ): Simplex = {
    val __obj = js.Dynamic.literal(_gradients = _gradients.asInstanceOf[js.Any], _indexes = _indexes.asInstanceOf[js.Any], _perms = _perms.asInstanceOf[js.Any], get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Simplex]
  }
  @scala.inline
  implicit class SimplexOps[Self <: Simplex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_gradientsVarargs(value: js.Array[Double]*): Self = this.set("_gradients", js.Array(value :_*))
    @scala.inline
    def set_gradients(value: js.Array[js.Array[Double]]): Self = this.set("_gradients", value.asInstanceOf[js.Any])
    @scala.inline
    def set_indexesVarargs(value: Double*): Self = this.set("_indexes", js.Array(value :_*))
    @scala.inline
    def set_indexes(value: js.Array[Double]): Self = this.set("_indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def set_permsVarargs(value: Double*): Self = this.set("_perms", js.Array(value :_*))
    @scala.inline
    def set_perms(value: js.Array[Double]): Self = this.set("_perms", value.asInstanceOf[js.Any])
  }
  
}

