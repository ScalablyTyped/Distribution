package typings.semanticUiSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl>> */
trait PartialPickImplkeyofImplCategory extends js.Object {
  var category: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.undefined
  var escape: js.UndefOr[js.Function1[/* string */ String, String]] = js.undefined
  var message: js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]] = js.undefined
  var standard: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.undefined
}

object PartialPickImplkeyofImplCategory {
  @scala.inline
  def apply(
    category: /* response */ js.Any => String = null,
    escape: /* string */ String => String = null,
    message: (/* message */ String, /* type */ String) => String = null,
    standard: /* response */ js.Any => String = null
  ): PartialPickImplkeyofImplCategory = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(js.Any.fromFunction1(category))
    if (escape != null) __obj.updateDynamic("escape")(js.Any.fromFunction1(escape))
    if (message != null) __obj.updateDynamic("message")(js.Any.fromFunction2(message))
    if (standard != null) __obj.updateDynamic("standard")(js.Any.fromFunction1(standard))
    __obj.asInstanceOf[PartialPickImplkeyofImplCategory]
  }
}

