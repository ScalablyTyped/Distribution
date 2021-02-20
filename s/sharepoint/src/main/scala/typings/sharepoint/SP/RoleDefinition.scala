package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleDefinition extends ClientObject {
  
  def deleteObject(): Unit = js.native
  
  def get_basePermissions(): BasePermissions = js.native
  
  def get_description(): String = js.native
  
  def get_hidden(): Boolean = js.native
  
  def get_id(): Double = js.native
  
  def get_name(): String = js.native
  
  def get_order(): Double = js.native
  
  def get_roleTypeKind(): RoleType = js.native
  
  def set_basePermissions(value: BasePermissions): Unit = js.native
  
  def set_description(value: String): Unit = js.native
  
  def set_name(value: String): Unit = js.native
  
  def set_order(value: Double): Unit = js.native
  
  def update(): Unit = js.native
}
