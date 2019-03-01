package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOptions extends js.Object {
  var conflict: js.UndefOr[
    rethinkdbLib.rethinkdbLibStrings.error | rethinkdbLib.rethinkdbLibStrings.replace | rethinkdbLib.rethinkdbLibStrings.update | (js.Function3[/* id */ java.lang.String, /* oldDoc */ js.Any, /* newDoc */ js.Any, _])
  ] = js.undefined
  var durability: js.UndefOr[rethinkdbLib.rethinkdbLibStrings.hard | rethinkdbLib.rethinkdbLibStrings.soft] = js.undefined
  var returnChanges: js.UndefOr[scala.Boolean | rethinkdbLib.rethinkdbLibStrings.always] = js.undefined
}

object InsertOptions {
  @scala.inline
  def apply(
    conflict: rethinkdbLib.rethinkdbLibStrings.error | rethinkdbLib.rethinkdbLibStrings.replace | rethinkdbLib.rethinkdbLibStrings.update | (js.Function3[/* id */ java.lang.String, /* oldDoc */ js.Any, /* newDoc */ js.Any, _]) = null,
    durability: rethinkdbLib.rethinkdbLibStrings.hard | rethinkdbLib.rethinkdbLibStrings.soft = null,
    returnChanges: scala.Boolean | rethinkdbLib.rethinkdbLibStrings.always = null
  ): InsertOptions = {
    val __obj = js.Dynamic.literal()
    if (conflict != null) __obj.updateDynamic("conflict")(conflict.asInstanceOf[js.Any])
    if (durability != null) __obj.updateDynamic("durability")(durability.asInstanceOf[js.Any])
    if (returnChanges != null) __obj.updateDynamic("returnChanges")(returnChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOptions]
  }
}

