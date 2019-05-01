package typings
package reactDashHelmetLib.reactDashHelmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetProps extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var base: js.UndefOr[js.Any] = js.undefined
  var bodyAttributes: js.UndefOr[js.Object] = js.undefined
  var defaultTitle: js.UndefOr[java.lang.String] = js.undefined
  var defer: js.UndefOr[scala.Boolean] = js.undefined
  var encodeSpecialCharacters: js.UndefOr[scala.Boolean] = js.undefined
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  var link: js.UndefOr[js.Array[LinkProps]] = js.undefined
  var meta: js.UndefOr[js.Array[MetaProps]] = js.undefined
  var noscript: js.UndefOr[js.Array[_]] = js.undefined
  var onChangeClientState: js.UndefOr[js.Function1[/* newState */ js.Any, scala.Unit]] = js.undefined
  var script: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Array[_]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleAttributes: js.UndefOr[js.Object] = js.undefined
  var titleTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object HelmetProps {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    base: js.Any = null,
    bodyAttributes: js.Object = null,
    defaultTitle: java.lang.String = null,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    encodeSpecialCharacters: js.UndefOr[scala.Boolean] = js.undefined,
    htmlAttributes: js.Any = null,
    link: js.Array[LinkProps] = null,
    meta: js.Array[MetaProps] = null,
    noscript: js.Array[_] = null,
    onChangeClientState: /* newState */ js.Any => scala.Unit = null,
    script: js.Array[_] = null,
    style: js.Array[_] = null,
    title: java.lang.String = null,
    titleAttributes: js.Object = null,
    titleTemplate: java.lang.String = null
  ): HelmetProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (base != null) __obj.updateDynamic("base")(base)
    if (bodyAttributes != null) __obj.updateDynamic("bodyAttributes")(bodyAttributes)
    if (defaultTitle != null) __obj.updateDynamic("defaultTitle")(defaultTitle)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (!js.isUndefined(encodeSpecialCharacters)) __obj.updateDynamic("encodeSpecialCharacters")(encodeSpecialCharacters)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (link != null) __obj.updateDynamic("link")(link)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (noscript != null) __obj.updateDynamic("noscript")(noscript)
    if (onChangeClientState != null) __obj.updateDynamic("onChangeClientState")(js.Any.fromFunction1(onChangeClientState))
    if (script != null) __obj.updateDynamic("script")(script)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleAttributes != null) __obj.updateDynamic("titleAttributes")(titleAttributes)
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate)
    __obj.asInstanceOf[HelmetProps]
  }
}

