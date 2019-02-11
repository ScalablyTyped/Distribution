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
    * The zero-based offset from the beginning of the file of the first byte in the region.
    */
  var byteOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The length of the region in characters.
    */
  var charLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The zero-based offset from the beginning of the file of the first character in the region.
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
    * The portion of the file contents within the specified region.
    */
  var snippet: js.UndefOr[FileContent] = js.undefined
  /**
    * Specifies the source language, if any, of the portion of the file specified by the region object.
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

