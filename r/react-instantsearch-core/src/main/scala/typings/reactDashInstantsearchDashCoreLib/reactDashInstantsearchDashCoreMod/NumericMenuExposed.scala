package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericMenuExposed extends js.Object {
  /** the name of the attribute in the records */
  var attribute: java.lang.String
  /** the value of the item selected by default, follow the shape of a string with a pattern of '{start}:{end}'. */
  var defaultRefinement: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** List of options. With a text label, and upper and lower bounds. */
  var items: js.Array[reactDashInstantsearchDashCoreLib.Anon_LabelStart]
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

