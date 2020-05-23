package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Guid")
@js.native
class Guid protected ()
  extends typings.sharepoint.SP.Guid {
  def this(guidText: String) = this()
}

/* static members */
@JSGlobal("SP.Guid")
@js.native
object Guid extends js.Object {
  def get_empty(): typings.sharepoint.SP.Guid = js.native
  def isValid(uuid: String): Boolean = js.native
  def newGuid(): typings.sharepoint.SP.Guid = js.native
}

