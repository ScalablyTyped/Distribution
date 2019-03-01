package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  /**
    * The length of the region in bytes.
    */
  var byteLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The zero-based offset from the beginning of the artifact of the first byte in the region.
    */
  var byteOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The length of the region in characters.
    */
  var charLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The zero-based offset from the beginning of the artifact of the first character in the region.
    */
  var charOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The column number of the character following the end of the region.
    */
  var endColumn: js.UndefOr[scala.Double] = js.undefined
  /**
    * The line number of the last character in the region.
    */
  var endLine: js.UndefOr[scala.Double] = js.undefined
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
  var sourceLanguage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The column number of the first character in the region.
    */
  var startColumn: js.UndefOr[scala.Double] = js.undefined
  /**
    * The line number of the first character in the region.
    */
  var startLine: js.UndefOr[scala.Double] = js.undefined
}

object Region {
  @scala.inline
  def apply(
    byteLength: scala.Int | scala.Double = null,
    byteOffset: scala.Int | scala.Double = null,
    charLength: scala.Int | scala.Double = null,
    charOffset: scala.Int | scala.Double = null,
    endColumn: scala.Int | scala.Double = null,
    endLine: scala.Int | scala.Double = null,
    message: Message = null,
    properties: PropertyBag = null,
    snippet: ArtifactContent = null,
    sourceLanguage: java.lang.String = null,
    startColumn: scala.Int | scala.Double = null,
    startLine: scala.Int | scala.Double = null
  ): Region = {
    val __obj = js.Dynamic.literal()
    if (byteLength != null) __obj.updateDynamic("byteLength")(byteLength.asInstanceOf[js.Any])
    if (byteOffset != null) __obj.updateDynamic("byteOffset")(byteOffset.asInstanceOf[js.Any])
    if (charLength != null) __obj.updateDynamic("charLength")(charLength.asInstanceOf[js.Any])
    if (charOffset != null) __obj.updateDynamic("charOffset")(charOffset.asInstanceOf[js.Any])
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endLine != null) __obj.updateDynamic("endLine")(endLine.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (sourceLanguage != null) __obj.updateDynamic("sourceLanguage")(sourceLanguage)
    if (startColumn != null) __obj.updateDynamic("startColumn")(startColumn.asInstanceOf[js.Any])
    if (startLine != null) __obj.updateDynamic("startLine")(startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
}

