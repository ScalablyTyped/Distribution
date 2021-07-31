package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleDefinitionBindingCollection
  extends StObject
     with ClientObjectCollection[RoleDefinition] {
  
  def add(roleDefinition: RoleDefinition): Unit = js.native
  
  def get_item(index: Double): RoleDefinition = js.native
  
  def itemAt(index: Double): RoleDefinition = js.native
  
  def remove(roleDefinition: RoleDefinition): Unit = js.native
  
  def removeAll(): Unit = js.native
}
