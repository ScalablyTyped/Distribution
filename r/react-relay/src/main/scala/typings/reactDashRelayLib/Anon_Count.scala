package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: scala.Double
  var cursor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(count: scala.Double, cursor: java.lang.String = null): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    __obj.asInstanceOf[Anon_Count]
  }
}

