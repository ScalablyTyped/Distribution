package typings
package semanticDashUiDashSearchLib.SemanticUINs.SearchNs.FieldsSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * "view more" object name
    *
    * @default 'action'
    */
  var action: java.lang.String
  /**
    * "view more" text
    *
    * @default 'text'
    */
  var actionText: java.lang.String
  /**
    * "view more" url
    *
    * @default 'url'
    */
  var actionURL: java.lang.String
  /**
    * array of categories (category view)
    *
    * @default 'results'
    */
  var categories: java.lang.String
  /**
    * name of category (category view)
    *
    * @default 'name'
    */
  var categoryName: java.lang.String
  /**
    * array of results (category view)
    *
    * @default 'results'
    */
  var categoryResults: java.lang.String
  /**
    * result description
    *
    * @default 'description'
    */
  var description: java.lang.String
  /**
    * result image
    *
    * @default 'image'
    */
  var image: java.lang.String
  /**
    * result price
    *
    * @default 'price'
    */
  var price: java.lang.String
  /**
    * array of results (standard)
    *
    * @default 'results'
    */
  var results: java.lang.String
  /**
    * result title
    *
    * @default 'title'
    */
  var title: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    action: java.lang.String,
    actionText: java.lang.String,
    actionURL: java.lang.String,
    categories: java.lang.String,
    categoryName: java.lang.String,
    categoryResults: java.lang.String,
    description: java.lang.String,
    image: java.lang.String,
    price: java.lang.String,
    results: java.lang.String,
    title: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal(action = action, actionText = actionText, actionURL = actionURL, categories = categories, categoryName = categoryName, categoryResults = categoryResults, description = description, image = image, price = price, results = results, title = title)
  
    __obj.asInstanceOf[_Impl]
  }
}

