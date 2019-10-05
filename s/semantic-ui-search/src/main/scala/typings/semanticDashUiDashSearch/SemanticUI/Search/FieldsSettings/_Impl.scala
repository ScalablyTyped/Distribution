package typings.semanticDashUiDashSearch.SemanticUI.Search.FieldsSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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

object _Impl {
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
  ): _Impl = {
    val __obj = js.Dynamic.literal(action = action, actionText = actionText, actionURL = actionURL, categories = categories, categoryName = categoryName, categoryResults = categoryResults, description = description, image = image, price = price, results = results, title = title)
  
    __obj.asInstanceOf[_Impl]
  }
}

