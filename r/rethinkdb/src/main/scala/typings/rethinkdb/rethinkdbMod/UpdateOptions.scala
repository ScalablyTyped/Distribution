package typings.rethinkdb.rethinkdbMod

import typings.rethinkdb.rethinkdbStrings.hard
import typings.rethinkdb.rethinkdbStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends js.Object {
  var durability: js.UndefOr[hard | soft] = js.undefined
  var nonAtomic: js.UndefOr[Boolean] = js.undefined
  var returnChanges: js.UndefOr[Boolean] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(
    durability: hard | soft = null,
    nonAtomic: js.UndefOr[Boolean] = js.undefined,
    returnChanges: js.UndefOr[Boolean] = js.undefined
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (durability != null) __obj.updateDynamic("durability")(durability.asInstanceOf[js.Any])
    if (!js.isUndefined(nonAtomic)) __obj.updateDynamic("nonAtomic")(nonAtomic)
    if (!js.isUndefined(returnChanges)) __obj.updateDynamic("returnChanges")(returnChanges)
    __obj.asInstanceOf[UpdateOptions]
  }
}

