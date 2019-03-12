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
  var items: js.Array[reactDashInstantsearchDashCoreLib.Anon_End]
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object NumericMenuExposed {
  @scala.inline
  def apply(
    attribute: java.lang.String,
    items: js.Array[reactDashInstantsearchDashCoreLib.Anon_End],
    defaultRefinement: java.lang.String = null,
    id: java.lang.String = null,
    transformItems: /* repeated */ js.Any => _ = null
  ): NumericMenuExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute, items = items)
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement)
    if (id != null) __obj.updateDynamic("id")(id)
    if (transformItems != null) __obj.updateDynamic("transformItems")(js.Any.fromFunction1(transformItems))
    __obj.asInstanceOf[NumericMenuExposed]
  }
}

