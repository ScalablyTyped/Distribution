package typings.reactDashInlinesvg.reactDashInlinesvgMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.reactDashInlinesvg.libHelpersMod.InlineSVGError
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps
  extends /* key */ StringDictionary[js.Any] {
  var baseURL: js.UndefOr[String] = js.undefined
  var cacheRequests: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
  var loader: js.UndefOr[ReactNode] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ InlineSVGError | IFetchError, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function2[/* src */ String, /* isCached */ Boolean, Unit]] = js.undefined
  var preProcessor: js.UndefOr[js.Function1[/* code */ String, String]] = js.undefined
  var src: String
  var title: js.UndefOr[String] = js.undefined
  var uniqueHash: js.UndefOr[String] = js.undefined
  var uniquifyIDs: js.UndefOr[Boolean] = js.undefined
}

object IProps {
  @scala.inline
  def apply(
    src: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    baseURL: String = null,
    cacheRequests: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    description: String = null,
    innerRef: Ref[HTMLElement] = null,
    loader: ReactNode = null,
    onError: /* error */ InlineSVGError | IFetchError => Unit = null,
    onLoad: (/* src */ String, /* isCached */ Boolean) => Unit = null,
    preProcessor: /* code */ String => String = null,
    title: String = null,
    uniqueHash: String = null,
    uniquifyIDs: js.UndefOr[Boolean] = js.undefined
  ): IProps = {
    val __obj = js.Dynamic.literal(src = src)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (!js.isUndefined(cacheRequests)) __obj.updateDynamic("cacheRequests")(cacheRequests)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction2(onLoad))
    if (preProcessor != null) __obj.updateDynamic("preProcessor")(js.Any.fromFunction1(preProcessor))
    if (title != null) __obj.updateDynamic("title")(title)
    if (uniqueHash != null) __obj.updateDynamic("uniqueHash")(uniqueHash)
    if (!js.isUndefined(uniquifyIDs)) __obj.updateDynamic("uniquifyIDs")(uniquifyIDs)
    __obj.asInstanceOf[IProps]
  }
}

