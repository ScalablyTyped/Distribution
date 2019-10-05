package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Guid")
@js.native
class Guid protected () extends js.Object {
  def this(guidText: String) = this()
  def ToSerialized(): String = js.native
  def equals(uuid: Guid): Boolean = js.native
  def toString(format: String): String = js.native
}

/* static members */
@JSGlobal("SP.Guid")
@js.native
object Guid extends js.Object {
  def get_empty(): Guid = js.native
  def isValid(uuid: String): Boolean = js.native
  def newGuid(): Guid = js.native
}

