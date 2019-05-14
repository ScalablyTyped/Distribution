package typings
package showdownLib.showdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterGlobals extends js.Object {
  var converter: js.UndefOr[Converter] = js.undefined
  var gDimensions: js.UndefOr[showdownLib.Anon_Height] = js.undefined
  var gHtmlBlocks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var gHtmlMdBlocks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var gHtmlSpans: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var gListLevel: js.UndefOr[scala.Double] = js.undefined
  var gTitles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var gUrls: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var ghCodeBlocks: js.UndefOr[js.Array[showdownLib.Anon_Codeblock]] = js.undefined
  var hashLinkCounts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  var langExtensions: js.UndefOr[js.Array[ShowdownExtension]] = js.undefined
  var metadata: js.UndefOr[showdownLib.Anon_Format] = js.undefined
  var outputModifiers: js.UndefOr[js.Array[ShowdownExtension]] = js.undefined
}

object ConverterGlobals {
  @scala.inline
  def apply(
    converter: Converter = null,
    gDimensions: showdownLib.Anon_Height = null,
    gHtmlBlocks: js.Array[java.lang.String] = null,
    gHtmlMdBlocks: js.Array[java.lang.String] = null,
    gHtmlSpans: js.Array[java.lang.String] = null,
    gListLevel: scala.Int | scala.Double = null,
    gTitles: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    gUrls: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    ghCodeBlocks: js.Array[showdownLib.Anon_Codeblock] = null,
    hashLinkCounts: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    langExtensions: js.Array[ShowdownExtension] = null,
    metadata: showdownLib.Anon_Format = null,
    outputModifiers: js.Array[ShowdownExtension] = null
  ): ConverterGlobals = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter)
    if (gDimensions != null) __obj.updateDynamic("gDimensions")(gDimensions)
    if (gHtmlBlocks != null) __obj.updateDynamic("gHtmlBlocks")(gHtmlBlocks)
    if (gHtmlMdBlocks != null) __obj.updateDynamic("gHtmlMdBlocks")(gHtmlMdBlocks)
    if (gHtmlSpans != null) __obj.updateDynamic("gHtmlSpans")(gHtmlSpans)
    if (gListLevel != null) __obj.updateDynamic("gListLevel")(gListLevel.asInstanceOf[js.Any])
    if (gTitles != null) __obj.updateDynamic("gTitles")(gTitles)
    if (gUrls != null) __obj.updateDynamic("gUrls")(gUrls)
    if (ghCodeBlocks != null) __obj.updateDynamic("ghCodeBlocks")(ghCodeBlocks)
    if (hashLinkCounts != null) __obj.updateDynamic("hashLinkCounts")(hashLinkCounts)
    if (langExtensions != null) __obj.updateDynamic("langExtensions")(langExtensions)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (outputModifiers != null) __obj.updateDynamic("outputModifiers")(outputModifiers)
    __obj.asInstanceOf[ConverterGlobals]
  }
}

