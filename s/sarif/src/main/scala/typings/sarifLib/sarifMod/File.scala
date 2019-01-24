package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
    * The contents of the file.
    */
  var contents: js.UndefOr[FileContent] = js.undefined
  /**
    * Specifies the encoding for a file object that refers to a text file.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The location of the file.
    */
  var fileLocation: js.UndefOr[FileLocation] = js.undefined
  /**
    * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value
    * of the file produced by the specified hash function.
    */
  var hashes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the file was most recently modified. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastModifiedTimeUtc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The length of the file in bytes.
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
    * The MIME type (RFC 2045) of the file.
    */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The offset in bytes of the file within its containing file.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Identifies the key of the immediate parent of the file, if this file is nested.
    */
  var parentKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the file.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The role or roles played by the file in the analysis.
    */
  var roles: js.UndefOr[js.Array[sarifLib.sarifMod.FileNs.roles]] = js.undefined
}

