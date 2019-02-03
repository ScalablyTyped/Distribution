package typings
package sharepointLib.SPNs.BusinessDataNs.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Runtime.EntityIdentity")
@js.native
class EntityIdentity protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientRuntimeContext, identifierValues: js.Array[_]) = this()
  def get_fieldValues(): js.Any = js.native
  def get_identifierCount(): scala.Double = js.native
  def get_item(fieldName: java.lang.String): js.Any = js.native
}

/* static members */
@JSGlobal("SP.BusinessData.Runtime.EntityIdentity")
@js.native
object EntityIdentity extends js.Object {
  def newObject(context: sharepointLib.SPNs.ClientRuntimeContext, identifierValues: js.Array[_]): sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityIdentity = js.native
}

