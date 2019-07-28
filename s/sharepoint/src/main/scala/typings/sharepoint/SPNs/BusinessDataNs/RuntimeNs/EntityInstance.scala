package typings.sharepoint.SPNs.BusinessDataNs.RuntimeNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Runtime.EntityInstance")
@js.native
class EntityInstance () extends ClientObject {
  def createCollectionInstance(fieldDotNotation: String, size: Double): Unit = js.native
  def createInstance(fieldInstanceDotNotation: String, fieldDotNotation: String): Unit = js.native
  def deleteObject(): Unit = js.native
  def fromXml(xml: String): Unit = js.native
  def getIdentity(): EntityIdentity = js.native
  def get_fieldValues(): js.Any = js.native
  def get_item(fieldName: String): js.Any = js.native
  def set_item(fieldName: String, value: js.Any): Unit = js.native
  def toXml(): StringResult = js.native
  def update(): Unit = js.native
}

