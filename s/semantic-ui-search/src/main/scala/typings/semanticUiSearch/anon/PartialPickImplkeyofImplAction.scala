package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplAction extends js.Object {
  var action: js.UndefOr[String] = js.native
  var actionText: js.UndefOr[String] = js.native
  var actionURL: js.UndefOr[String] = js.native
  var categories: js.UndefOr[String] = js.native
  var categoryName: js.UndefOr[String] = js.native
  var categoryResults: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  var price: js.UndefOr[String] = js.native
  var results: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplAction {
  @scala.inline
  def apply(): PartialPickImplkeyofImplAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplAction]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplActionOps[Self <: PartialPickImplkeyofImplAction] (val x: Self) extends AnyVal {
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
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setActionText(value: String): Self = this.set("actionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionText: Self = this.set("actionText", js.undefined)
    @scala.inline
    def setActionURL(value: String): Self = this.set("actionURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionURL: Self = this.set("actionURL", js.undefined)
    @scala.inline
    def setCategories(value: String): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setCategoryName(value: String): Self = this.set("categoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryName: Self = this.set("categoryName", js.undefined)
    @scala.inline
    def setCategoryResults(value: String): Self = this.set("categoryResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryResults: Self = this.set("categoryResults", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setResults(value: String): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

