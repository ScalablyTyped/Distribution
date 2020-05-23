package typings.reactHelmetAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetProps extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var base: js.UndefOr[js.Any] = js.undefined
  var bodyAttributes: js.UndefOr[BodyProps] = js.undefined
  var defaultTitle: js.UndefOr[String] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var encodeSpecialCharacters: js.UndefOr[Boolean] = js.undefined
  var htmlAttributes: js.UndefOr[HtmlProps] = js.undefined
  var link: js.UndefOr[js.Array[LinkProps]] = js.undefined
  var meta: js.UndefOr[js.Array[MetaProps]] = js.undefined
  var noscript: js.UndefOr[js.Array[_]] = js.undefined
  var onChangeClientState: js.UndefOr[
    js.Function3[/* newState */ js.Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags, Unit]
  ] = js.undefined
  var script: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Array[_]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleAttributes: js.UndefOr[js.Object] = js.undefined
  var titleTemplate: js.UndefOr[String] = js.undefined
}

object HelmetProps {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    base: js.Any = null,
    bodyAttributes: BodyProps = null,
    defaultTitle: String = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    encodeSpecialCharacters: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: HtmlProps = null,
    link: js.Array[LinkProps] = null,
    meta: js.Array[MetaProps] = null,
    noscript: js.Array[_] = null,
    onChangeClientState: (/* newState */ js.Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Unit = null,
    script: js.Array[_] = null,
    style: js.Array[_] = null,
    title: String = null,
    titleAttributes: js.Object = null,
    titleTemplate: String = null
  ): HelmetProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (bodyAttributes != null) __obj.updateDynamic("bodyAttributes")(bodyAttributes.asInstanceOf[js.Any])
    if (defaultTitle != null) __obj.updateDynamic("defaultTitle")(defaultTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeSpecialCharacters)) __obj.updateDynamic("encodeSpecialCharacters")(encodeSpecialCharacters.get.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (noscript != null) __obj.updateDynamic("noscript")(noscript.asInstanceOf[js.Any])
    if (onChangeClientState != null) __obj.updateDynamic("onChangeClientState")(js.Any.fromFunction3(onChangeClientState))
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAttributes != null) __obj.updateDynamic("titleAttributes")(titleAttributes.asInstanceOf[js.Any])
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelmetProps]
  }
}

