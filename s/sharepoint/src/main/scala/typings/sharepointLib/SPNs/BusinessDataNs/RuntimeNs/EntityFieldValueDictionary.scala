package typings
package sharepointLib.SPNs.BusinessDataNs.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Runtime.EntityFieldValueDictionary")
@js.native
class EntityFieldValueDictionary ()
  extends sharepointLib.SPNs.ClientObject {
  def createCollectionInstance(fieldDotNotation: java.lang.String, size: scala.Double): scala.Unit = js.native
  def createInstance(fieldInstanceDotNotation: java.lang.String, fieldDotNotation: java.lang.String): scala.Unit = js.native
  def fromXml(xml: java.lang.String): scala.Unit = js.native
  def getCollectionSize(fieldDotNotation: java.lang.String): sharepointLib.SPNs.IntResult = js.native
  def get_fieldValues(): js.Any = js.native
  def get_item(fieldName: java.lang.String): js.Any = js.native
  def set_item(fieldName: java.lang.String, value: js.Any): scala.Unit = js.native
  def toXml(): sharepointLib.SPNs.StringResult = js.native
}

