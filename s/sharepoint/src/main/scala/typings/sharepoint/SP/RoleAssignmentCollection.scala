package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleAssignmentCollection
  extends StObject
     with ClientObjectCollection[RoleAssignment] {
  
  def add(principal: Principal, roleBindings: RoleDefinitionBindingCollection): RoleAssignment = js.native
  
  def getByPrincipal(principalToFind: Principal): RoleAssignment = js.native
  
  def getByPrincipalId(principalId: Double): RoleAssignment = js.native
  
  def get_groups(): GroupCollection = js.native
  
  def get_item(index: Double): RoleAssignment = js.native
  
  def itemAt(index: Double): RoleAssignment = js.native
}
