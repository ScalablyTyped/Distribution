package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Guid")
@js.native
class Guid protected () extends js.Object {
  def this(guidText: java.lang.String) = this()
  def ToSerialized(): java.lang.String = js.native
  def equals(uuid: Guid): scala.Boolean = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
}

@JSGlobal("SP.Guid")
@js.native
object Guid extends js.Object {
  def get_empty(): sharepointLib.SPNs.Guid = js.native
  def isValid(uuid: java.lang.String): scala.Boolean = js.native
  def newGuid(): sharepointLib.SPNs.Guid = js.native
}

