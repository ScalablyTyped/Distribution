package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.AnonCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProvided extends js.Object {
  var currentRefinement: String
  var isFromSearch: Boolean
  var items: js.Array[AnonCount]
  def createURL(args: js.Any*): js.Any
  def refine(args: js.Any*): js.Any
  def searchForItems(args: js.Any*): js.Any
}

object MenuProvided {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: String,
    isFromSearch: Boolean,
    items: js.Array[AnonCount],
    refine: /* repeated */ js.Any => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): MenuProvided = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], isFromSearch = isFromSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[MenuProvided]
  }
}

