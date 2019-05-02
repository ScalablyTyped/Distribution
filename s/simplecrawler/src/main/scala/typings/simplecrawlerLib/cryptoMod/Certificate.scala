package typings
package simplecrawlerLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  def exportChallenge(spkac: java.lang.String): simplecrawlerLib.Buffer = js.native
  def exportChallenge(spkac: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def exportPublicKey(spkac: java.lang.String): simplecrawlerLib.Buffer = js.native
  def exportPublicKey(spkac: simplecrawlerLib.Buffer): simplecrawlerLib.Buffer = js.native
  def verifySpkac(spkac: simplecrawlerLib.Buffer): scala.Boolean = js.native
}

@JSImport("crypto", "Certificate")
@js.native
class CertificateCls () extends Certificate

@JSImport("crypto", "Certificate")
@js.native
object Certificate
  extends org.scalablytyped.runtime.Instantiable0[Certificate] {
  def apply(): simplecrawlerLib.cryptoMod.Certificate = js.native
}

