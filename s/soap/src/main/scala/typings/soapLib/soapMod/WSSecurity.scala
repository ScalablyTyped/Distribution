package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "WSSecurity")
@js.native
class WSSecurity protected () extends ISecurity {
  def this(username: java.lang.String, password: java.lang.String) = this()
  def this(username: java.lang.String, password: java.lang.String, options: js.Any) = this()
  /* CompleteClass */
  override def addOptions(options: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toXML(): java.lang.String = js.native
}

