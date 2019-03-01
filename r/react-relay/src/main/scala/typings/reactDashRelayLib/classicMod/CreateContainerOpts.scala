package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerOpts extends js.Object {
  var fragments: Fragments
  var initialVariables: js.UndefOr[js.Any] = js.undefined
  var prepareVariables: js.UndefOr[js.Function1[/* prevVariables */ RelayVariables, RelayVariables]] = js.undefined
}

object CreateContainerOpts {
  @scala.inline
  def apply(
    fragments: Fragments,
    initialVariables: js.Any = null,
    prepareVariables: js.Function1[/* prevVariables */ RelayVariables, RelayVariables] = null
  ): CreateContainerOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fragments")(fragments)
    if (initialVariables != null) __obj.updateDynamic("initialVariables")(initialVariables)
    if (prepareVariables != null) __obj.updateDynamic("prepareVariables")(prepareVariables)
    __obj.asInstanceOf[CreateContainerOpts]
  }
}

