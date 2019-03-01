package typings
package sharedbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Results extends js.Object {
  var results: js.UndefOr[js.Array[sharedbLib.libSharedbMod.Query]] = js.undefined
}

object Anon_Results {
  @scala.inline
  def apply(results: js.Array[sharedbLib.libSharedbMod.Query] = null): Anon_Results = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[Anon_Results]
  }
}

