package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileContent extends js.Object {
  /**
    * MIME Base64-encoded content from a binary file, or from a text file in its original encoding.
    */
  var binary: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the external file.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * UTF-8-encoded content from a text file.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

