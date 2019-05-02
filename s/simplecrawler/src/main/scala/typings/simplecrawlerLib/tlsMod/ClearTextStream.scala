package typings
package simplecrawlerLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearTextStream
  extends simplecrawlerLib.streamMod.Duplex {
  var address: simplecrawlerLib.Anon_Address = js.native
  var authorizationError: simplecrawlerLib.Error = js.native
  var authorized: scala.Boolean = js.native
  var getCipher: simplecrawlerLib.Anon_Name = js.native
  var remoteAddress: java.lang.String = js.native
  var remotePort: scala.Double = js.native
  def getPeerCertificate(): js.Any = js.native
}

