package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurableObject extends ClientObject {
  
  def breakRoleInheritance(copyRoleAssignments: Boolean, clearSubscopes: Boolean): Unit = js.native
  
  def get_firstUniqueAncestorSecurableObject(): SecurableObject = js.native
  
  def get_hasUniqueRoleAssignments(): Boolean = js.native
  
  def get_roleAssignments(): RoleAssignmentCollection = js.native
  
  def resetRoleInheritance(): Unit = js.native
}
