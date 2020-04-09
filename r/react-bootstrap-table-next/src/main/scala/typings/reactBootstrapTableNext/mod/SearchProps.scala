package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProps[T] extends js.Object {
  var defaultSearch: js.UndefOr[String] = js.undefined
  /* custom search method, return true if matched and false if not */
  var onColumnMatch: js.UndefOr[js.Function1[/* searchProps */ AnonColumn[T], Boolean]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var searchText: js.UndefOr[String] = js.undefined
}

object SearchProps {
  @scala.inline
  def apply[T](
    defaultSearch: String = null,
    onColumnMatch: /* searchProps */ AnonColumn[T] => Boolean = null,
    placeholder: String = null,
    searchText: String = null
  ): SearchProps[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultSearch != null) __obj.updateDynamic("defaultSearch")(defaultSearch.asInstanceOf[js.Any])
    if (onColumnMatch != null) __obj.updateDynamic("onColumnMatch")(js.Any.fromFunction1(onColumnMatch))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProps[T]]
  }
}

