package typings
package rheostatLib.rheostatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Algorithm extends js.Object {
  def getPosition(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double
  def getValue(pos: scala.Double, min: scala.Double, max: scala.Double): scala.Double
}

