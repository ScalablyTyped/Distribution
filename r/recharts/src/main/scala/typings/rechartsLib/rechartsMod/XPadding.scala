package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XPadding extends js.Object {
  var left: scala.Double
  var right: scala.Double
}

object XPadding {
  @scala.inline
  def apply(left: scala.Double, right: scala.Double): XPadding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[XPadding]
  }
}

