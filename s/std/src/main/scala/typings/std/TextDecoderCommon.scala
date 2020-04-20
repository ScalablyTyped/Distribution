package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoderCommon extends js.Object {
  /**
    * Returns encoding's name, lowercased.
    */
  val encoding: java.lang.String
  /**
    * Returns true if error mode is "fatal", and false otherwise.
    */
  val fatal: scala.Boolean
  /**
    * Returns true if ignore BOM flag is set, and false otherwise.
    */
  val ignoreBOM: scala.Boolean
}

object TextDecoderCommon {
  @scala.inline
  def apply(encoding: java.lang.String, fatal: scala.Boolean, ignoreBOM: scala.Boolean): TextDecoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderCommon]
  }
}

