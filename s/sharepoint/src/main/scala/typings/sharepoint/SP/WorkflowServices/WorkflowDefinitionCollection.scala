package typings.sharepoint.SP.WorkflowServices

import typings.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of WorkflowDefinition objects */
@js.native
trait WorkflowDefinitionCollection extends ClientObjectCollection[WorkflowDefinition] {
  
  /** returns SP.WorkflowDefinition class */
  def get_childItemType(): js.Any = js.native
  
  def get_item(index: Double): WorkflowDefinition = js.native
  
  def itemAt(index: Double): WorkflowDefinition = js.native
}
