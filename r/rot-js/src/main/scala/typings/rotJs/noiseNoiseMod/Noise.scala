package typings.rotJs.noiseNoiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Noise extends js.Object {
  def get(x: Double, y: Double): Double
}

object Noise {
  @scala.inline
  def apply(get: (Double, Double) => Double): Noise = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[Noise]
  }
}

