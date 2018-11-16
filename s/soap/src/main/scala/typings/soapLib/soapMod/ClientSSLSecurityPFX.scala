package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "ClientSSLSecurityPFX")
@js.native
class ClientSSLSecurityPFX protected () extends ISecurity {
  def this(pfx: java.lang.String) = this()
  def this(pfx: nodeLib.Buffer) = this()
  def this(pfx: java.lang.String, defaults: js.Any) = this()
  def this(pfx: java.lang.String, passphrase: java.lang.String) = this()
  def this(pfx: nodeLib.Buffer, defaults: js.Any) = this()
  def this(pfx: nodeLib.Buffer, passphrase: java.lang.String) = this()
  def this(pfx: java.lang.String, passphrase: java.lang.String, defaults: js.Any) = this()
  def this(pfx: nodeLib.Buffer, passphrase: java.lang.String, defaults: js.Any) = this()
  /* CompleteClass */
  override def addOptions(options: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toXML(): java.lang.String = js.native
}

