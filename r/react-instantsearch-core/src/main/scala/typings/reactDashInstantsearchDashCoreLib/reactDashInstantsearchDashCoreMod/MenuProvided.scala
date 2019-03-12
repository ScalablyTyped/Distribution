package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProvided extends js.Object {
  var currentRefinement: java.lang.String
  var isFromSearch: scala.Boolean
  var items: js.Array[reactDashInstantsearchDashCoreLib.Anon_Count]
  def createURL(args: js.Any*): js.Any
  def refine(args: js.Any*): js.Any
  def searchForItems(args: js.Any*): js.Any
}

object MenuProvided {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: java.lang.String,
    isFromSearch: scala.Boolean,
    items: js.Array[reactDashInstantsearchDashCoreLib.Anon_Count],
    refine: /* repeated */ js.Any => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): MenuProvided = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement, isFromSearch = isFromSearch, items = items, refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
  
    __obj.asInstanceOf[MenuProvided]
  }
}

