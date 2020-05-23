package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  /**
    * The length of the region in bytes.
    */
  var byteLength: js.UndefOr[Double] = js.undefined
  /**
    * The zero-based offset from the beginning of the artifact of the first byte in the region.
    */
  var byteOffset: js.UndefOr[Double] = js.undefined
  /**
    * The length of the region in characters.
    */
  var charLength: js.UndefOr[Double] = js.undefined
  /**
    * The zero-based offset from the beginning of the artifact of the first character in the region.
    */
  var charOffset: js.UndefOr[Double] = js.undefined
  /**
    * The column number of the character following the end of the region.
    */
  var endColumn: js.UndefOr[Double] = js.undefined
  /**
    * The line number of the last character in the region.
    */
  var endLine: js.UndefOr[Double] = js.undefined
  /**
    * A message relevant to the region.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the region.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The portion of the artifact contents within the specified region.
    */
  var snippet: js.UndefOr[ArtifactContent] = js.undefined
  /**
    * Specifies the source language, if any, of the portion of the artifact specified by the region object.
    */
  var sourceLanguage: js.UndefOr[String] = js.undefined
  /**
    * The column number of the first character in the region.
    */
  var startColumn: js.UndefOr[Double] = js.undefined
  /**
    * The line number of the first character in the region.
    */
  var startLine: js.UndefOr[Double] = js.undefined
}

object Region {
  @scala.inline
  def apply(
    byteLength: js.UndefOr[Double] = js.undefined,
    byteOffset: js.UndefOr[Double] = js.undefined,
    charLength: js.UndefOr[Double] = js.undefined,
    charOffset: js.UndefOr[Double] = js.undefined,
    endColumn: js.UndefOr[Double] = js.undefined,
    endLine: js.UndefOr[Double] = js.undefined,
    message: Message = null,
    properties: PropertyBag = null,
    snippet: ArtifactContent = null,
    sourceLanguage: String = null,
    startColumn: js.UndefOr[Double] = js.undefined,
    startLine: js.UndefOr[Double] = js.undefined
  ): Region = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byteLength)) __obj.updateDynamic("byteLength")(byteLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(byteOffset)) __obj.updateDynamic("byteOffset")(byteOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(charLength)) __obj.updateDynamic("charLength")(charLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(charOffset)) __obj.updateDynamic("charOffset")(charOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endColumn)) __obj.updateDynamic("endColumn")(endColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endLine)) __obj.updateDynamic("endLine")(endLine.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (sourceLanguage != null) __obj.updateDynamic("sourceLanguage")(sourceLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(startColumn)) __obj.updateDynamic("startColumn")(startColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startLine)) __obj.updateDynamic("startLine")(startLine.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
}

