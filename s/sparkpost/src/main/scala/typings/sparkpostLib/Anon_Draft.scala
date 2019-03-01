package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Draft extends js.Object {
  var draft: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Draft {
  @scala.inline
  def apply(draft: js.UndefOr[scala.Boolean] = js.undefined): Anon_Draft = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    __obj.asInstanceOf[Anon_Draft]
  }
}

