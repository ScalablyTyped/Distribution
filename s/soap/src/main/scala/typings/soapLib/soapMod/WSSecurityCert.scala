package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "WSSecurityCert")
@js.native
class WSSecurityCert protected () extends ISecurity {
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
  def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: js.Any) = this()
  /* CompleteClass */
  override def addOptions(options: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toXML(): java.lang.String = js.native
}

