package typings
package spexLib.spexMod

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
    val __obj = js.Dynamic.literal(duration = duration, pages = pages, total = total)
  
    __obj.asInstanceOf[TPageResult]
  }
}

