package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.always
import typings.rethinkdb.rethinkdbStrings.error
import typings.rethinkdb.rethinkdbStrings.hard
import typings.rethinkdb.rethinkdbStrings.replace
import typings.rethinkdb.rethinkdbStrings.soft
import typings.rethinkdb.rethinkdbStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOptions extends js.Object {
  var conflict: js.UndefOr[
    error | replace | update | (js.Function3[/* id */ String, /* oldDoc */ js.Any, /* newDoc */ js.Any, _])
  ] = js.undefined
  var durability: js.UndefOr[hard | soft] = js.undefined
  var returnChanges: js.UndefOr[Boolean | always] = js.undefined
}

object InsertOptions {
  @scala.inline
  def apply(
    conflict: error | replace | update | (js.Function3[/* id */ String, /* oldDoc */ js.Any, /* newDoc */ js.Any, _]) = null,
    durability: hard | soft = null,
    returnChanges: Boolean | always = null
  ): InsertOptions = {
    val __obj = js.Dynamic.literal()
    if (conflict != null) __obj.updateDynamic("conflict")(conflict.asInstanceOf[js.Any])
    if (durability != null) __obj.updateDynamic("durability")(durability.asInstanceOf[js.Any])
    if (returnChanges != null) __obj.updateDynamic("returnChanges")(returnChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOptions]
  }
}

