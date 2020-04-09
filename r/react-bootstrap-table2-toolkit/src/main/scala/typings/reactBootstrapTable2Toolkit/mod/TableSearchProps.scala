package typings.reactBootstrapTable2Toolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableSearchProps[T /* <: js.Object */] extends js.Object {
  var customMatchFunc: js.UndefOr[js.Function1[/* props */ SearchMatchProps[T], Boolean]] = js.undefined
  var defaultSearch: js.UndefOr[String] = js.undefined
  var onColumnMatch: js.UndefOr[js.Function1[/* props */ SearchMatchProps[T], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var searchFormatted: js.UndefOr[Boolean] = js.undefined
}

object TableSearchProps {
  @scala.inline
  def apply[T /* <: js.Object */](
    customMatchFunc: /* props */ SearchMatchProps[T] => Boolean = null,
    defaultSearch: String = null,
    onColumnMatch: /* props */ SearchMatchProps[T] => Unit = null,
    placeholder: String = null,
    searchFormatted: js.UndefOr[Boolean] = js.undefined
  ): TableSearchProps[T] = {
    val __obj = js.Dynamic.literal()
    if (customMatchFunc != null) __obj.updateDynamic("customMatchFunc")(js.Any.fromFunction1(customMatchFunc))
    if (defaultSearch != null) __obj.updateDynamic("defaultSearch")(defaultSearch.asInstanceOf[js.Any])
    if (onColumnMatch != null) __obj.updateDynamic("onColumnMatch")(js.Any.fromFunction1(onColumnMatch))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(searchFormatted)) __obj.updateDynamic("searchFormatted")(searchFormatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSearchProps[T]]
  }
}

