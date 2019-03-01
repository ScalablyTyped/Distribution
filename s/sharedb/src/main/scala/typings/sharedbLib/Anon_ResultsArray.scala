package typings
package sharedbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResultsArray extends js.Object {
  var results: js.UndefOr[js.Array[sharedbLib.libClientMod.Query]] = js.undefined
}

object Anon_ResultsArray {
  @scala.inline
  def apply(results: js.Array[sharedbLib.libClientMod.Query] = null): Anon_ResultsArray = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[Anon_ResultsArray]
  }
}

