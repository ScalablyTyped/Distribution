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

