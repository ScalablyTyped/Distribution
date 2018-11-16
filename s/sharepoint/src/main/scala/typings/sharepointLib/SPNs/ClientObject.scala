package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientObject")
@js.native
class ClientObject protected () extends js.Object {
  def this(context: ClientRuntimeContext, objectPath: ObjectPath) = this()
  def checkUninitializedProperty(propName: java.lang.String): scala.Unit = js.native
  def customFromJson(initValue: js.Any): scala.Boolean = js.native
  def fromJson(initValue: js.Any): scala.Unit = js.native
  def get_context(): ClientRuntimeContext = js.native
  def get_objectVersion(): java.lang.String = js.native
  def get_path(): ObjectPath = js.native
  def get_serverObjectIsNull(): scala.Boolean = js.native
  def get_typedObject(): ClientObject = js.native
  def initPropertiesFromJson(initValue: js.Any): scala.Unit = js.native
  def isObjectPropertyInstantiated(propertyName: java.lang.String): scala.Boolean = js.native
  def isPropertyAvailable(propertyName: java.lang.String): scala.Boolean = js.native
  def refreshLoad(): scala.Unit = js.native
  def retrieve(): scala.Unit = js.native
  def retrieve(propertyNames: js.Array[java.lang.String]): scala.Unit = js.native
  def set_objectVersion(value: java.lang.String): scala.Unit = js.native
}

