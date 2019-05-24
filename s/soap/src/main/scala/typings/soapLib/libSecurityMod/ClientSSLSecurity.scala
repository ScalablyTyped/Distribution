package typings
package soapLib.libSecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security", "ClientSSLSecurity")
@js.native
class ClientSSLSecurity protected ()
  extends soapLib.libSecurityClientSSLSecurityMod.ClientSSLSecurity {
  def this(key: java.lang.String, cert: java.lang.String) = this()
  def this(key: java.lang.String, cert: nodeLib.Buffer) = this()
  def this(key: nodeLib.Buffer, cert: java.lang.String) = this()
  def this(key: nodeLib.Buffer, cert: nodeLib.Buffer) = this()
  def this(key: java.lang.String, cert: java.lang.String, defaults: js.Any) = this()
  def this(key: java.lang.String, cert: nodeLib.Buffer, defaults: js.Any) = this()
  def this(key: nodeLib.Buffer, cert: java.lang.String, defaults: js.Any) = this()
  def this(key: nodeLib.Buffer, cert: nodeLib.Buffer, defaults: js.Any) = this()
}

