package typings.showdown.mod

import org.scalablytyped.runtime.StringDictionary
import typings.showdown.anon.Codeblock
import typings.showdown.anon.Format
import typings.showdown.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterGlobals extends js.Object {
  var converter: js.UndefOr[Converter] = js.undefined
  var gDimensions: js.UndefOr[Height] = js.undefined
  var gHtmlBlocks: js.UndefOr[js.Array[String]] = js.undefined
  var gHtmlMdBlocks: js.UndefOr[js.Array[String]] = js.undefined
  var gHtmlSpans: js.UndefOr[js.Array[String]] = js.undefined
  var gListLevel: js.UndefOr[Double] = js.undefined
  var gTitles: js.UndefOr[StringDictionary[String]] = js.undefined
  var gUrls: js.UndefOr[StringDictionary[String]] = js.undefined
  var ghCodeBlocks: js.UndefOr[js.Array[Codeblock]] = js.undefined
  var hashLinkCounts: js.UndefOr[StringDictionary[Double]] = js.undefined
  var langExtensions: js.UndefOr[js.Array[ShowdownExtension]] = js.undefined
  var metadata: js.UndefOr[Format] = js.undefined
  var outputModifiers: js.UndefOr[js.Array[ShowdownExtension]] = js.undefined
}

object ConverterGlobals {
  @scala.inline
  def apply(
    converter: Converter = null,
    gDimensions: Height = null,
    gHtmlBlocks: js.Array[String] = null,
    gHtmlMdBlocks: js.Array[String] = null,
    gHtmlSpans: js.Array[String] = null,
    gListLevel: js.UndefOr[Double] = js.undefined,
    gTitles: StringDictionary[String] = null,
    gUrls: StringDictionary[String] = null,
    ghCodeBlocks: js.Array[Codeblock] = null,
    hashLinkCounts: StringDictionary[Double] = null,
    langExtensions: js.Array[ShowdownExtension] = null,
    metadata: Format = null,
    outputModifiers: js.Array[ShowdownExtension] = null
  ): ConverterGlobals = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (gDimensions != null) __obj.updateDynamic("gDimensions")(gDimensions.asInstanceOf[js.Any])
    if (gHtmlBlocks != null) __obj.updateDynamic("gHtmlBlocks")(gHtmlBlocks.asInstanceOf[js.Any])
    if (gHtmlMdBlocks != null) __obj.updateDynamic("gHtmlMdBlocks")(gHtmlMdBlocks.asInstanceOf[js.Any])
    if (gHtmlSpans != null) __obj.updateDynamic("gHtmlSpans")(gHtmlSpans.asInstanceOf[js.Any])
    if (!js.isUndefined(gListLevel)) __obj.updateDynamic("gListLevel")(gListLevel.get.asInstanceOf[js.Any])
    if (gTitles != null) __obj.updateDynamic("gTitles")(gTitles.asInstanceOf[js.Any])
    if (gUrls != null) __obj.updateDynamic("gUrls")(gUrls.asInstanceOf[js.Any])
    if (ghCodeBlocks != null) __obj.updateDynamic("ghCodeBlocks")(ghCodeBlocks.asInstanceOf[js.Any])
    if (hashLinkCounts != null) __obj.updateDynamic("hashLinkCounts")(hashLinkCounts.asInstanceOf[js.Any])
    if (langExtensions != null) __obj.updateDynamic("langExtensions")(langExtensions.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (outputModifiers != null) __obj.updateDynamic("outputModifiers")(outputModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterGlobals]
  }
}

