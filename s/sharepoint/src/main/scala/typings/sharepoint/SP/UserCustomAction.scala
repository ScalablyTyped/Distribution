package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCustomAction
  extends StObject
     with ClientObject {
  
  def deleteObject(): Unit = js.native
  
  def get_commandUIExtension(): String = js.native
  
  def get_description(): String = js.native
  
  def get_group(): String = js.native
  
  def get_id(): Guid = js.native
  
  def get_imageUrl(): String = js.native
  
  def get_location(): String = js.native
  
  def get_name(): String = js.native
  
  def get_registrationId(): String = js.native
  
  def get_registrationType(): UserCustomActionRegistrationType = js.native
  
  def get_rights(): BasePermissions = js.native
  
  def get_scope(): UserCustomActionScope = js.native
  
  def get_scriptBlock(): String = js.native
  
  def get_scriptSrc(): String = js.native
  
  def get_sequence(): Double = js.native
  
  def get_title(): String = js.native
  
  def get_url(): String = js.native
  
  def get_versionOfUserCustomAction(): String = js.native
  
  def set_commandUIExtension(value: String): Unit = js.native
  
  def set_description(value: String): Unit = js.native
  
  def set_group(value: String): Unit = js.native
  
  def set_imageUrl(value: String): Unit = js.native
  
  def set_location(value: String): Unit = js.native
  
  def set_name(value: String): Unit = js.native
  
  def set_registrationId(value: String): Unit = js.native
  
  def set_registrationType(value: UserCustomActionRegistrationType): Unit = js.native
  
  def set_rights(value: BasePermissions): Unit = js.native
  
  def set_scriptBlock(value: String): Unit = js.native
  
  def set_scriptSrc(value: String): Unit = js.native
  
  def set_sequence(value: Double): Unit = js.native
  
  def set_title(value: String): Unit = js.native
  
  def set_url(value: String): Unit = js.native
  
  def update(): Unit = js.native
}
