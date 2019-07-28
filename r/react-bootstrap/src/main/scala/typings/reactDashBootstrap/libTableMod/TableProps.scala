package typings.reactDashBootstrap.libTableMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends HTMLProps[Table] {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var condensed: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var hover: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var striped: js.UndefOr[Boolean] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[Table] = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null,
    condensed: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    hover: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined
  ): TableProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (!js.isUndefined(condensed)) __obj.updateDynamic("condensed")(condensed)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    __obj.asInstanceOf[TableProps]
  }
}

