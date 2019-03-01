package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  var qHeight: scala.Double
  var qLeft: scala.Double
  var qTop: scala.Double
  var qWdith: scala.Double
}

object Rect {
  @scala.inline
  def apply(qHeight: scala.Double, qLeft: scala.Double, qTop: scala.Double, qWdith: scala.Double): Rect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qHeight")(qHeight)
    __obj.updateDynamic("qLeft")(qLeft)
    __obj.updateDynamic("qTop")(qTop)
    __obj.updateDynamic("qWdith")(qWdith)
    __obj.asInstanceOf[Rect]
  }
}

