package typings
package reactstrapLib.libProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var bar: js.UndefOr[scala.Boolean] = js.undefined
  var barClassName: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var max: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var striped: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ProgressProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    bar: js.UndefOr[scala.Boolean] = js.undefined,
    barClassName: java.lang.String = null,
    className: java.lang.String = null,
    color: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    max: java.lang.String | scala.Double = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined,
    striped: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    value: java.lang.String | scala.Double = null
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

