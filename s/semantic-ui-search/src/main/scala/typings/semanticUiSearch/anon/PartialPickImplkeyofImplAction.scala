package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl>> */
trait PartialPickImplkeyofImplAction extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var actionText: js.UndefOr[String] = js.undefined
  var actionURL: js.UndefOr[String] = js.undefined
  var categories: js.UndefOr[String] = js.undefined
  var categoryName: js.UndefOr[String] = js.undefined
  var categoryResults: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplAction {
  @scala.inline
  def apply(
    action: String = null,
    actionText: String = null,
    actionURL: String = null,
    categories: String = null,
    categoryName: String = null,
    categoryResults: String = null,
    description: String = null,
    image: String = null,
    price: String = null,
    results: String = null,
    title: String = null
  ): PartialPickImplkeyofImplAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actionText != null) __obj.updateDynamic("actionText")(actionText.asInstanceOf[js.Any])
    if (actionURL != null) __obj.updateDynamic("actionURL")(actionURL.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (categoryName != null) __obj.updateDynamic("categoryName")(categoryName.asInstanceOf[js.Any])
    if (categoryResults != null) __obj.updateDynamic("categoryResults")(categoryResults.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplAction]
  }
}

