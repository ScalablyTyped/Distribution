package typings.smtpServer.mod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMTPServerDataStream extends Transform {
  
  /**
    * number of bytes read from DATA stream
    */
  var byteLength: Double = js.native
  
  /**
    * boolean, if set to true, the message was oversized.
    * When creating the server you can define maximum allowed message size with
    * the size option, see RFC1870 for details.
    */
  var sizeExceeded: Boolean = js.native
}
