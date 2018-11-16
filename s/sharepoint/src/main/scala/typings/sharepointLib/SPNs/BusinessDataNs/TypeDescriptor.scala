package typings
package sharepointLib.SPNs.BusinessDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.TypeDescriptor")
@js.native
class TypeDescriptor ()
  extends sharepointLib.SPNs.ClientObject {
  def containsLocalizedDisplayName(): sharepointLib.SPNs.BooleanResult = js.native
  def getChildTypeDescriptors(): sharepointLib.SPNs.BusinessDataNs.CollectionsNs.TypeDescriptorCollection = js.native
  def getDefaultDisplayName(): sharepointLib.SPNs.StringResult = js.native
  def getLocalizedDisplayName(): sharepointLib.SPNs.StringResult = js.native
  def getParentTypeDescriptor(): TypeDescriptor = js.native
  def get_containsReadOnly(): scala.Boolean = js.native
  def get_isCollection(): scala.Boolean = js.native
  def get_isReadOnly(): scala.Boolean = js.native
  def get_name(): java.lang.String = js.native
  def get_typeName(): java.lang.String = js.native
  def isLeaf(): sharepointLib.SPNs.BooleanResult = js.native
  def isRoot(): sharepointLib.SPNs.BooleanResult = js.native
}

