package typings
package scrollerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PageX extends js.Object {
  var pageX: scala.Double
  var pageY: scala.Double
}

object Anon_PageX {
  @scala.inline
  def apply(pageX: scala.Double, pageY: scala.Double): Anon_PageX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.asInstanceOf[Anon_PageX]
  }
}

