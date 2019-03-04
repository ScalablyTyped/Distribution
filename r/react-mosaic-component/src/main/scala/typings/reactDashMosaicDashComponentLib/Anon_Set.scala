package typings
package reactDashMosaicDashComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Set extends js.Object {
  @JSName("$set")
  var $set: scala.Double | scala.Null
}

object Anon_Set {
  @scala.inline
  def apply($set: scala.Int | scala.Double = null): Anon_Set = {
    val __obj = js.Dynamic.literal()
    if ($set != null) __obj.updateDynamic("$set")($set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Set]
  }
}

