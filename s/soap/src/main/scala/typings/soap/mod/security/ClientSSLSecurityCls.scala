package typings.soap.mod.security

import typings.node.Buffer
import typings.soap.securityMod.ClientSSLSecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "security.ClientSSLSecurity")
@js.native
class ClientSSLSecurityCls protected () extends ClientSSLSecurity {
  def this(key: String, cert: String) = this()
  def this(key: String, cert: Buffer) = this()
  def this(key: Buffer, cert: String) = this()
  def this(key: Buffer, cert: Buffer) = this()
  def this(key: String, cert: String, defaults: js.Any) = this()
  def this(key: String, cert: Buffer, defaults: js.Any) = this()
  def this(key: Buffer, cert: String, defaults: js.Any) = this()
  def this(key: Buffer, cert: Buffer, defaults: js.Any) = this()
}

