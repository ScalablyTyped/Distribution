package typings.semanticUiSearch.SemanticUI.Search.FieldsSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * "view more" object name
    *
    * @default 'action'
    */
  var action: String
  /**
    * "view more" text
    *
    * @default 'text'
    */
  var actionText: String
  /**
    * "view more" url
    *
    * @default 'url'
    */
  var actionURL: String
  /**
    * array of categories (category view)
    *
    * @default 'results'
    */
  var categories: String
  /**
    * name of category (category view)
    *
    * @default 'name'
    */
  var categoryName: String
  /**
    * array of results (category view)
    *
    * @default 'results'
    */
  var categoryResults: String
  /**
    * result description
    *
    * @default 'description'
    */
  var description: String
  /**
    * result image
    *
    * @default 'image'
    */
  var image: String
  /**
    * result price
    *
    * @default 'price'
    */
  var price: String
  /**
    * array of results (standard)
    *
    * @default 'results'
    */
  var results: String
  /**
    * result title
    *
    * @default 'title'
    */
  var title: String
}

object Impl {
  @scala.inline
  def apply(
    action: String,
    actionText: String,
    actionURL: String,
    categories: String,
    categoryName: String,
    categoryResults: String,
    description: String,
    image: String,
    price: String,
    results: String,
    title: String
  ): Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actionText = actionText.asInstanceOf[js.Any], actionURL = actionURL.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], categoryName = categoryName.asInstanceOf[js.Any], categoryResults = categoryResults.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

