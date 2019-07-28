package typings.reactstrap.libProgressMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var animated: js.UndefOr[Boolean] = js.undefined
  var bar: js.UndefOr[Boolean] = js.undefined
  var barClassName: js.UndefOr[String] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var max: js.UndefOr[String | Double] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var striped: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object ProgressProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    bar: js.UndefOr[Boolean] = js.undefined,
    barClassName: String = null,
    className: String = null,
    color: String = null,
    cssModule: CSSModule = null,
    max: String | Double = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    value: String | Double = null
  ): ProgressProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(bar)) __obj.updateDynamic("bar")(bar)
    if (barClassName != null) __obj.updateDynamic("barClassName")(barClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressProps]
  }
}

