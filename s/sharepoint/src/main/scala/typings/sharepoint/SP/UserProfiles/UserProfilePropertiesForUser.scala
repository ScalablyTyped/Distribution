package typings.sharepoint.SP.UserProfiles

import typings.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of user profile properties for a specified user. */
@js.native
trait UserProfilePropertiesForUser extends ClientObject {
  
  /** Gets an array of strings that specify the user profile property names. */
  def getPropertyNames(): js.Array[String] = js.native
  
  /** Specifies the user account name */
  def get_accountName(): String = js.native
  
  /** Specifies the user account name */
  def set_accountName(value: String): String = js.native
}
