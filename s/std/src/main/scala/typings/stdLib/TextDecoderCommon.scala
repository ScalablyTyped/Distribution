package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoderCommon extends js.Object {
  val encoding: java.lang.String
  val fatal: scala.Boolean
  val ignoreBOM: scala.Boolean
}

object TextDecoderCommon {
  @scala.inline
  def apply(encoding: java.lang.String, fatal: scala.Boolean, ignoreBOM: scala.Boolean): TextDecoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding, fatal = fatal, ignoreBOM = ignoreBOM)
  
    __obj.asInstanceOf[TextDecoderCommon]
  }
}

