package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TPageResult extends js.Object {
  var duration: scala.Double
  var pages: scala.Double
  var total: scala.Double
}

object TPageResult {
  @scala.inline
  def apply(duration: scala.Double, pages: scala.Double, total: scala.Double): TPageResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("pages")(pages)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[TPageResult]
  }
}

