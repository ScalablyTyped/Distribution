package typings.reactstrap.libTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var hover: js.UndefOr[Boolean] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var reflow: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var responsiveTag: js.UndefOr[ReactType[_]] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var striped: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    borderless: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cssModule: CSSModule = null,
    hover: js.UndefOr[Boolean] = js.undefined,
    inverse: js.UndefOr[Boolean] = js.undefined,
    reflow: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    responsiveTag: ReactType[_] = null,
    size: String = null,
    striped: js.UndefOr[Boolean] = js.undefined,
    tag: ReactType[_] = null
  ): TableProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (!js.isUndefined(reflow)) __obj.updateDynamic("reflow")(reflow)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (responsiveTag != null) __obj.updateDynamic("responsiveTag")(responsiveTag.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

