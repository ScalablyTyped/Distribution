package typings.sharepoint.SP.UserProfiles

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of user profile properties for a specified user. */
@JSGlobal("SP.UserProfiles.UserProfilePropertiesForUser")
@js.native
class UserProfilePropertiesForUser protected () extends ClientObject {
  /** Creates new UserProfilePropertiesForUser object
    @param context Specifies the client context to use.
    @param accountName Specifies the user by account name.
    @param propertyNames Specifies an array of strings that specify the properties to retrieve. */
  def this(context: ClientContext, accountName: String, propertyNames: js.Array[String]) = this()
  /** Gets an array of strings that specify the user profile property names. */
  def getPropertyNames(): js.Array[String] = js.native
  /** Specifies the user account name */
  def get_accountName(): String = js.native
  /** Specifies the user account name */
  def set_accountName(value: String): String = js.native
}

