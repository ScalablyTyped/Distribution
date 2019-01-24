package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * An array of strings to substitute into the message string.
    */
  var arguments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The resource id for a plain text message string.
    */
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the message.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The resource id for a rich text message string.
    */
  var richMessageId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A rich text message string.
    */
  var richText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A plain text message string.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

