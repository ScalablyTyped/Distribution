package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventReceiverDefinitionCollection extends ClientObjectCollection[EventReceiverDefinition] {
  
  def add(eventReceiverCreationInformation: EventReceiverDefinitionCreationInformation): EventReceiverDefinition = js.native
  
  def getById(eventReceiverId: Guid): EventReceiverDefinition = js.native
  
  def get_item(index: Double): EventReceiverDefinition = js.native
  
  def itemAt(index: Double): EventReceiverDefinition = js.native
}
