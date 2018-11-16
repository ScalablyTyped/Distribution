package typings
package sharepointLib.SPNs.BusinessDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.EntityView")
@js.native
class EntityView ()
  extends sharepointLib.SPNs.ClientObject {
  def getDefaultValues(): sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityFieldValueDictionary = js.native
  def getType(fieldDotNotation: java.lang.String): sharepointLib.SPNs.StringResult = js.native
  def getTypeDescriptor(fieldDotNotation: java.lang.String): TypeDescriptor = js.native
  def getXmlSchema(): sharepointLib.SPNs.StringResult = js.native
  def get_fields(): sharepointLib.SPNs.BusinessDataNs.CollectionsNs.EntityFieldCollection = js.native
  def get_name(): java.lang.String = js.native
  def get_relatedSpecificFinderName(): java.lang.String = js.native
}

