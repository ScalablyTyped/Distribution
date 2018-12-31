package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentRefinementsExposed extends js.Object {
  /** Pass true to also clear the search query */
  var clearsQuery: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function to modify the items being displayed, e.g. for filtering or sorting them.
    * Takes an items as parameter and expects it back in return.
    */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

