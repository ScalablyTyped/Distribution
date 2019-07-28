package typings.sharepoint.SPNs.BusinessDataNs.RuntimeNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientRuntimeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Runtime.EntityIdentity")
@js.native
class EntityIdentity protected () extends ClientObject {
  def this(context: ClientRuntimeContext, identifierValues: js.Array[_]) = this()
  def get_fieldValues(): js.Any = js.native
  def get_identifierCount(): Double = js.native
  def get_item(fieldName: String): js.Any = js.native
}

/* static members */
@JSGlobal("SP.BusinessData.Runtime.EntityIdentity")
@js.native
object EntityIdentity extends js.Object {
  def newObject(context: ClientRuntimeContext, identifierValues: js.Array[_]): EntityIdentity = js.native
}

