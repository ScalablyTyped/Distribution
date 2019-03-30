package typings
package reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewProps
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var fadeInDuration: js.UndefOr[scala.Double] = js.undefined
  var fileFrom: js.UndefOr[
    reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.bundle | reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.documentsDirectory
  ] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPageChanged: js.UndefOr[js.Function2[/* page */ scala.Double, /* pageCount */ scala.Double, scala.Unit]] = js.undefined
  var onScrolled: js.UndefOr[js.Function1[/* offset */ scala.Double, scala.Unit]] = js.undefined
  var resource: java.lang.String
  var resourceType: js.UndefOr[
    reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.url | reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.base64 | reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.file
  ] = js.undefined
  var textEncoding: js.UndefOr[
    reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.`utf-8` | reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.`utf-16`
  ] = js.undefined
  var urlProps: js.UndefOr[URLProps] = js.undefined
}

object PDFViewProps {
  @scala.inline
  def apply(
    resource: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    fadeInDuration: scala.Int | scala.Double = null,
    fileFrom: reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.bundle | reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.documentsDirectory = null,
    onError: /* error */ stdLib.Error => scala.Unit = null,
    onLoad: () => scala.Unit = null,
    onPageChanged: (/* page */ scala.Double, /* pageCount */ scala.Double) => scala.Unit = null,
    onScrolled: /* offset */ scala.Double => scala.Unit = null,
    resourceType: reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.url | reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.base64 | reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.file = null,
    textEncoding: reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.`utf-8` | reactDashNativeDashViewDashPdfLib.reactDashNativeDashViewDashPdfLibStrings.`utf-16` = null,
    urlProps: URLProps = null
  ): PDFViewProps = {
    val __obj = js.Dynamic.literal(resource = resource)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fadeInDuration != null) __obj.updateDynamic("fadeInDuration")(fadeInDuration.asInstanceOf[js.Any])
    if (fileFrom != null) __obj.updateDynamic("fileFrom")(fileFrom.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onPageChanged != null) __obj.updateDynamic("onPageChanged")(js.Any.fromFunction2(onPageChanged))
    if (onScrolled != null) __obj.updateDynamic("onScrolled")(js.Any.fromFunction1(onScrolled))
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding.asInstanceOf[js.Any])
    if (urlProps != null) __obj.updateDynamic("urlProps")(urlProps)
    __obj.asInstanceOf[PDFViewProps]
  }
}

