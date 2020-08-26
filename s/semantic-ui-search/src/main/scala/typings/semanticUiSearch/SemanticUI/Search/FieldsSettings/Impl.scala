package typings.semanticUiSearch.SemanticUI.Search.FieldsSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * "view more" object name
    *
    * @default 'action'
    */
  var action: String = js.native
  /**
    * "view more" text
    *
    * @default 'text'
    */
  var actionText: String = js.native
  /**
    * "view more" url
    *
    * @default 'url'
    */
  var actionURL: String = js.native
  /**
    * array of categories (category view)
    *
    * @default 'results'
    */
  var categories: String = js.native
  /**
    * name of category (category view)
    *
    * @default 'name'
    */
  var categoryName: String = js.native
  /**
    * array of results (category view)
    *
    * @default 'results'
    */
  var categoryResults: String = js.native
  /**
    * result description
    *
    * @default 'description'
    */
  var description: String = js.native
  /**
    * result image
    *
    * @default 'image'
    */
  var image: String = js.native
  /**
    * result price
    *
    * @default 'price'
    */
  var price: String = js.native
  /**
    * array of results (standard)
    *
    * @default 'results'
    */
  var results: String = js.native
  /**
    * result title
    *
    * @default 'title'
    */
  var title: String = js.native
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
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionText(value: String): Self = this.set("actionText", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionURL(value: String): Self = this.set("actionURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategories(value: String): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryName(value: String): Self = this.set("categoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryResults(value: String): Self = this.set("categoryResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setResults(value: String): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

