package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clone extends js.Object {
  @JSName("clone")
  var clone_FAnon_Clone: js.UndefOr[scala.Boolean] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Clone {
  @scala.inline
  def apply(clone: js.UndefOr[scala.Boolean] = js.undefined, plain: js.UndefOr[scala.Boolean] = js.undefined): Anon_Clone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    __obj.asInstanceOf[Anon_Clone]
  }
}

