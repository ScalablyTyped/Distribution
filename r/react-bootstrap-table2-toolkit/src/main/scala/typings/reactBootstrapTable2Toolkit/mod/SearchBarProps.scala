package typings.reactBootstrapTable2Toolkit.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var searchText: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tableId: js.UndefOr[String] = js.undefined
  def onSearch(searchText: String): Unit
}

object SearchBarProps {
  @scala.inline
  def apply(
    onSearch: String => Unit,
    className: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    placeholder: String = null,
    searchText: String = null,
    style: CSSProperties = null,
    tableId: String = null
  ): SearchBarProps = {
    val __obj = js.Dynamic.literal(onSearch = js.Any.fromFunction1(onSearch))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarProps]
  }
}

