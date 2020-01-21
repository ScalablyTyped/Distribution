package typings.rotJs.simplexMod

import typings.rotJs.noiseNoiseMod.Noise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Simplex extends Noise {
  var _gradients: js.Array[js.Array[Double]]
  var _indexes: js.Array[Double]
  var _perms: js.Array[Double]
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
}

