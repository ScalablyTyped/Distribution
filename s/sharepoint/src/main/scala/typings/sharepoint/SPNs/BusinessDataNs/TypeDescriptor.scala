package typings.sharepoint.SPNs.BusinessDataNs

import typings.sharepoint.SPNs.BooleanResult
import typings.sharepoint.SPNs.BusinessDataNs.CollectionsNs.TypeDescriptorCollection
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.TypeDescriptor")
@js.native
class TypeDescriptor () extends ClientObject {
  def containsLocalizedDisplayName(): BooleanResult = js.native
  def getChildTypeDescriptors(): TypeDescriptorCollection = js.native
  def getDefaultDisplayName(): StringResult = js.native
  def getLocalizedDisplayName(): StringResult = js.native
  def getParentTypeDescriptor(): TypeDescriptor = js.native
  def get_containsReadOnly(): Boolean = js.native
  def get_isCollection(): Boolean = js.native
  def get_isReadOnly(): Boolean = js.native
  def get_name(): String = js.native
  def get_typeName(): String = js.native
  def isLeaf(): BooleanResult = js.native
  def isRoot(): BooleanResult = js.native
}

