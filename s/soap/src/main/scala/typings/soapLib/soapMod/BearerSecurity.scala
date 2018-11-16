package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "BearerSecurity")
@js.native
class BearerSecurity protected () extends ISecurity {
  def this(token: java.lang.String) = this()
  def this(token: java.lang.String, defaults: js.Any) = this()
  def addHeaders(headers: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def addOptions(options: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toXML(): java.lang.String = js.native
}

