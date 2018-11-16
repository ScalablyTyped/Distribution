package typings
package sharepointLib.SPNs.BusinessDataNs.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Runtime.EntityInstance")
@js.native
class EntityInstance ()
  extends sharepointLib.SPNs.ClientObject {
  def createCollectionInstance(fieldDotNotation: java.lang.String, size: scala.Double): scala.Unit = js.native
  def createInstance(fieldInstanceDotNotation: java.lang.String, fieldDotNotation: java.lang.String): scala.Unit = js.native
  def deleteObject(): scala.Unit = js.native
  def fromXml(xml: java.lang.String): scala.Unit = js.native
  def getIdentity(): EntityIdentity = js.native
  def get_fieldValues(): js.Any = js.native
  def get_item(fieldName: java.lang.String): js.Any = js.native
  def set_item(fieldName: java.lang.String, value: js.Any): scala.Unit = js.native
  def toXml(): sharepointLib.SPNs.StringResult = js.native
  def update(): scala.Unit = js.native
}

