package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends Principal {
  
  def get_email(): String = js.native
  
  def get_groups(): GroupCollection = js.native
  
  def get_isSiteAdmin(): Boolean = js.native
  
  def get_userId(): UserIdInfo = js.native
  
  def set_email(value: String): Unit = js.native
  
  def set_isSiteAdmin(value: Boolean): Unit = js.native
  
  def update(): Unit = js.native
}
