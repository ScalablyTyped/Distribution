package typings.sharepoint.SP.BusinessData

import typings.sharepoint.SP.BusinessData.Runtime.EntityInstance
import typings.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Collections")
@js.native
object Collections extends js.Object {
  @js.native
  trait EntityFieldCollection extends ClientObjectCollection[EntityField] {
    def get_item(index: Double): EntityField = js.native
    def itemAt(index: Double): EntityField = js.native
  }
  
  @js.native
  trait EntityIdentifierCollection extends ClientObjectCollection[EntityIdentifier] {
    def get_item(index: Double): EntityIdentifier = js.native
    def itemAt(index: Double): EntityIdentifier = js.native
  }
  
  @js.native
  trait EntityInstanceCollection extends ClientObjectCollection[EntityInstance] {
    def get_item(index: Double): EntityInstance = js.native
    def itemAt(index: Double): EntityInstance = js.native
  }
  
  @js.native
  trait FilterCollection extends ClientObjectCollection[Filter] {
    def get_item(index: Double): Filter = js.native
    def itemAt(index: Double): Filter = js.native
    def setFilterValue(inputFilterName: String, valueIndex: Double, value: js.Any): Unit = js.native
  }
  
  @js.native
  trait LobSystemInstanceCollection extends ClientObjectCollection[LobSystemInstance] {
    def get_item(index: Double): LobSystemInstance = js.native
    def itemAt(index: Double): LobSystemInstance = js.native
  }
  
  @js.native
  trait TypeDescriptorCollection extends ClientObjectCollection[TypeDescriptor] {
    def get_item(index: Double): TypeDescriptor = js.native
    def itemAt(index: Double): TypeDescriptor = js.native
  }
  
}

