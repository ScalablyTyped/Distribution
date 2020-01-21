package typings.soap.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "ClientSSLSecurityPFX")
@js.native
class ClientSSLSecurityPFX protected ()
  extends typings.soap.securityMod.ClientSSLSecurityPFX {
  def this(pfx: String) = this()
  def this(pfx: Buffer) = this()
  def this(pfx: String, defaults: js.Any) = this()
  def this(pfx: Buffer, defaults: js.Any) = this()
}

