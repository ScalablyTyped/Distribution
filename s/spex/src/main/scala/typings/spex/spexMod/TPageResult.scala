package typings.spex.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TPageResult extends js.Object {
  var duration: Double
  var pages: Double
  var total: Double
}

object TPageResult {
  @scala.inline
  def apply(duration: Double, pages: Double, total: Double): TPageResult = {
    val __obj = js.Dynamic.literal(duration = duration, pages = pages, total = total)
  
    __obj.asInstanceOf[TPageResult]
  }
}

