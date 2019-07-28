package typings.sharepoint.SPNs.BusinessDataNs

import typings.sharepoint.SPNs.BusinessDataNs.CollectionsNs.EntityFieldCollection
import typings.sharepoint.SPNs.BusinessDataNs.RuntimeNs.EntityFieldValueDictionary
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.EntityView")
@js.native
class EntityView () extends ClientObject {
  def getDefaultValues(): EntityFieldValueDictionary = js.native
  def getType(fieldDotNotation: String): StringResult = js.native
  def getTypeDescriptor(fieldDotNotation: String): TypeDescriptor = js.native
  def getXmlSchema(): StringResult = js.native
  def get_fields(): EntityFieldCollection = js.native
  def get_name(): String = js.native
  def get_relatedSpecificFinderName(): String = js.native
}

