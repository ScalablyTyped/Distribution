package typings.semanticUiSearch.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl>> */
trait PartialPickImplkeyofImplBeginsWith extends js.Object {
  var beginsWith: js.UndefOr[String] = js.undefined
  var escape: js.UndefOr[RegExp] = js.undefined
}

object PartialPickImplkeyofImplBeginsWith {
  @scala.inline
  def apply(beginsWith: String = null, escape: RegExp = null): PartialPickImplkeyofImplBeginsWith = {
    val __obj = js.Dynamic.literal()
    if (beginsWith != null) __obj.updateDynamic("beginsWith")(beginsWith.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplBeginsWith]
  }
}

