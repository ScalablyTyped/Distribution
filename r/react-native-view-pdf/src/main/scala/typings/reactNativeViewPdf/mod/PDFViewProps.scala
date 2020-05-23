package typings.reactNativeViewPdf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-16`
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-8`
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.base64
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.bundle
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.documentsDirectory
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.file
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.url
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewProps
  extends /* key */ StringDictionary[js.Any] {
  var fadeInDuration: js.UndefOr[Double] = js.undefined
  var fileFrom: js.UndefOr[bundle | documentsDirectory] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPageChanged: js.UndefOr[js.Function2[/* page */ Double, /* pageCount */ Double, Unit]] = js.undefined
  var onScrolled: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.undefined
  var resource: String
  var resourceType: js.UndefOr[url | base64 | file] = js.undefined
  var textEncoding: js.UndefOr[`utf-8` | `utf-16`] = js.undefined
  var urlProps: js.UndefOr[URLProps] = js.undefined
}

object PDFViewProps {
  @scala.inline
  def apply(
    resource: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    fadeInDuration: js.UndefOr[Double] = js.undefined,
    fileFrom: bundle | documentsDirectory = null,
    onError: /* error */ Error => Unit = null,
    onLoad: () => Unit = null,
    onPageChanged: (/* page */ Double, /* pageCount */ Double) => Unit = null,
    onScrolled: /* offset */ Double => Unit = null,
    resourceType: url | base64 | file = null,
    textEncoding: `utf-8` | `utf-16` = null,
    urlProps: URLProps = null
  ): PDFViewProps = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(fadeInDuration)) __obj.updateDynamic("fadeInDuration")(fadeInDuration.get.asInstanceOf[js.Any])
    if (fileFrom != null) __obj.updateDynamic("fileFrom")(fileFrom.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onPageChanged != null) __obj.updateDynamic("onPageChanged")(js.Any.fromFunction2(onPageChanged))
    if (onScrolled != null) __obj.updateDynamic("onScrolled")(js.Any.fromFunction1(onScrolled))
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding.asInstanceOf[js.Any])
    if (urlProps != null) __obj.updateDynamic("urlProps")(urlProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewProps]
  }
}

