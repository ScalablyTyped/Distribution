package typings
package senecaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actrouter extends js.Object {
  var actrouter: js.UndefOr[senecaLib.senecaMod.UnknownType] = js.undefined
  var clientrouter: js.UndefOr[senecaLib.senecaMod.UnknownType] = js.undefined
  // Close instance on these signals, if true.
  var close_signals: js.UndefOr[Anon_SIGBREAK] = js.undefined
  var subrouter: js.UndefOr[senecaLib.senecaMod.UnknownType] = js.undefined
}

object Anon_Actrouter {
  @scala.inline
  def apply(
    actrouter: senecaLib.senecaMod.UnknownType = null,
    clientrouter: senecaLib.senecaMod.UnknownType = null,
    close_signals: Anon_SIGBREAK = null,
    subrouter: senecaLib.senecaMod.UnknownType = null
  ): Anon_Actrouter = {
    val __obj = js.Dynamic.literal()
    if (actrouter != null) __obj.updateDynamic("actrouter")(actrouter)
    if (clientrouter != null) __obj.updateDynamic("clientrouter")(clientrouter)
    if (close_signals != null) __obj.updateDynamic("close_signals")(close_signals)
    if (subrouter != null) __obj.updateDynamic("subrouter")(subrouter)
    __obj.asInstanceOf[Anon_Actrouter]
  }
}

