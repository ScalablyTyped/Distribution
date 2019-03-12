package typings
package rheostatLib.rheostatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
  def getPosition(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double
  def getValue(pos: scala.Double, min: scala.Double, max: scala.Double): scala.Double
}

object Algorithm {
  @scala.inline
  def apply(
    getPosition: (scala.Double, scala.Double, scala.Double) => scala.Double,
    getValue: (scala.Double, scala.Double, scala.Double) => scala.Double
  ): Algorithm = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction3(getPosition), getValue = js.Any.fromFunction3(getValue))
  
    __obj.asInstanceOf[Algorithm]
  }
}

