package typings.soap.libSecurityMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security", "ClientSSLSecurityPFX")
@js.native
class ClientSSLSecurityPFX protected ()
  extends typings.soap.libSecurityClientSSLSecurityPFXMod.ClientSSLSecurityPFX {
  def this(pfx: String) = this()
  def this(pfx: Buffer) = this()
  def this(pfx: String, defaults: js.Any) = this()
  def this(pfx: Buffer, defaults: js.Any) = this()
}

