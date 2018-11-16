package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "BasicAuthSecurity")
@js.native
class BasicAuthSecurity protected () extends ISecurity {
  def this(username: java.lang.String, password: java.lang.String) = this()
  def this(username: java.lang.String, password: java.lang.String, defaults: js.Any) = this()
  def addHeaders(headers: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def addOptions(options: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toXML(): java.lang.String = js.native
}

