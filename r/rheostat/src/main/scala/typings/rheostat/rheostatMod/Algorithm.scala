package typings.rheostat.rheostatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
  def getPosition(value: Double, min: Double, max: Double): Double
  def getValue(pos: Double, min: Double, max: Double): Double
}

object Algorithm {
  @scala.inline
  def apply(getPosition: (Double, Double, Double) => Double, getValue: (Double, Double, Double) => Double): Algorithm = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction3(getPosition), getValue = js.Any.fromFunction3(getValue))
  
    __obj.asInstanceOf[Algorithm]
  }
}

