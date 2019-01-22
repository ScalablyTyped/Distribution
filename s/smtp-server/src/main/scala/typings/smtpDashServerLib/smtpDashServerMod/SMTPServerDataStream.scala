package typings
package smtpDashServerLib.smtpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPServerDataStream
  extends nodeLib.streamMod.PassThrough {
  /**
    * number of bytes read from DATA stream
    */
  var byteLength: scala.Double = js.native
  /**
    * boolean, if set to true, the message was oversized.
    * When creating the server you can define maximum allowed message size with
    * the size option, see RFC1870 for details.
    */
  var sizeExceeded: scala.Boolean = js.native
}

