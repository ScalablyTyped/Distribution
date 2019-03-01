package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YPadding extends js.Object {
  var bottom: scala.Double
  var top: scala.Double
}

object YPadding {
  @scala.inline
  def apply(bottom: scala.Double, top: scala.Double): YPadding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[YPadding]
  }
}

