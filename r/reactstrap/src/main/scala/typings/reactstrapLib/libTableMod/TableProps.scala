package typings
package reactstrapLib.libTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  var borderless: js.UndefOr[scala.Boolean] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var hover: js.UndefOr[scala.Boolean] = js.undefined
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  var reflow: js.UndefOr[scala.Boolean] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var responsiveTag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var striped: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    borderless: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    hover: js.UndefOr[scala.Boolean] = js.undefined,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    reflow: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    responsiveTag: reactLib.reactMod.ReactType[_] = null,
    size: java.lang.String = null,
    striped: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactType[_] = null
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

