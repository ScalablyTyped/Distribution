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

