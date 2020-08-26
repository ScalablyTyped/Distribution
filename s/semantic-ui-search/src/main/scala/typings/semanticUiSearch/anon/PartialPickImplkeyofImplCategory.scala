package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplCategory extends js.Object {
  var category: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.native
  var escape: js.UndefOr[js.Function1[/* string */ String, String]] = js.native
  var message: js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]] = js.native
  var standard: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.native
}

object PartialPickImplkeyofImplCategory {
  @scala.inline
  def apply(): PartialPickImplkeyofImplCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplCategory]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplCategoryOps[Self <: PartialPickImplkeyofImplCategory] (val x: Self) extends AnyVal {
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
    def setCategory(value: /* response */ js.Any => String): Self = this.set("category", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setEscape(value: /* string */ String => String): Self = this.set("escape", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    @scala.inline
    def setMessage(value: (/* message */ String, /* type */ String) => String): Self = this.set("message", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setStandard(value: /* response */ js.Any => String): Self = this.set("standard", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStandard: Self = this.set("standard", js.undefined)
  }
  
}

