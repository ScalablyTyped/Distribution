package typings
package rollupDashPluginutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var resolve: js.UndefOr[
    java.lang.String | rollupDashPluginutilsLib.rollupDashPluginutilsLibNumbers.`false` | scala.Null
  ] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(
    resolve: java.lang.String | rollupDashPluginutilsLib.rollupDashPluginutilsLibNumbers.`false` = null
  ): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

