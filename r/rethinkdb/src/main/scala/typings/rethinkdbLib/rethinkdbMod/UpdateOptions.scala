package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends js.Object {
  var durability: js.UndefOr[rethinkdbLib.rethinkdbLibStrings.hard | rethinkdbLib.rethinkdbLibStrings.soft] = js.undefined
  var nonAtomic: js.UndefOr[scala.Boolean] = js.undefined
  var returnChanges: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(
    durability: rethinkdbLib.rethinkdbLibStrings.hard | rethinkdbLib.rethinkdbLibStrings.soft = null,
    nonAtomic: js.UndefOr[scala.Boolean] = js.undefined,
    returnChanges: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (durability != null) __obj.updateDynamic("durability")(durability.asInstanceOf[js.Any])
    if (!js.isUndefined(nonAtomic)) __obj.updateDynamic("nonAtomic")(nonAtomic)
    if (!js.isUndefined(returnChanges)) __obj.updateDynamic("returnChanges")(returnChanges)
    __obj.asInstanceOf[UpdateOptions]
  }
}

