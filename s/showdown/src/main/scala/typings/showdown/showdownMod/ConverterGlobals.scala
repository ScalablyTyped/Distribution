package typings.showdown.showdownMod

import org.scalablytyped.runtime.StringDictionary
import typings.showdown.Anon_Codeblock
import typings.showdown.Anon_Format
import typings.showdown.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterGlobals extends js.Object {
  var converter: js.UndefOr[Converter] = js.undefined
  var gDimensions: js.UndefOr[Anon_Height] = js.undefined
  var gHtmlBlocks: js.UndefOr[js.Array[String]] = js.undefined
  var gHtmlMdBlocks: js.UndefOr[js.Array[String]] = js.undefined
  var gHtmlSpans: js.UndefOr[js.Array[String]] = js.undefined
  var gListLevel: js.UndefOr[Double] = js.undefined
  var gTitles: js.UndefOr[StringDictionary[String]] = js.undefined
  var gUrls: js.UndefOr[StringDictionary[String]] = js.undefined
  var ghCodeBlocks: js.UndefOr[js.Array[Anon_Codeblock]] = js.undefined
  var hashLinkCounts: js.UndefOr[StringDictionary[Double]] = js.undefined
  var langExtensions: js.UndefOr[js.Array[ShowdownExtension]] = js.undefined
  var metadata: js.UndefOr[Anon_Format] = js.undefined
  var outputModifiers: js.UndefOr[js.Array[ShowdownExtension]] = js.undefined
}

object ConverterGlobals {
  @scala.inline
  def apply(
    converter: Converter = null,
    gDimensions: Anon_Height = null,
    gHtmlBlocks: js.Array[String] = null,
    gHtmlMdBlocks: js.Array[String] = null,
    gHtmlSpans: js.Array[String] = null,
    gListLevel: Int | Double = null,
    gTitles: StringDictionary[String] = null,
    gUrls: StringDictionary[String] = null,
    ghCodeBlocks: js.Array[Anon_Codeblock] = null,
    hashLinkCounts: StringDictionary[Double] = null,
    langExtensions: js.Array[ShowdownExtension] = null,
    metadata: Anon_Format = null,
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

