package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of user profile properties for a specified user. */
@JSGlobal("SP.UserProfiles.UserProfilePropertiesForUser")
@js.native
class UserProfilePropertiesForUser protected ()
  extends sharepointLib.SPNs.ClientObject {
  /** Creates new UserProfilePropertiesForUser object
                  @param context Specifies the client context to use.
                  @param accountName Specifies the user by account name.
                  @param propertyNames Specifies an array of strings that specify the properties to retrieve. */
  def this(context: sharepointLib.SPNs.ClientContext, accountName: java.lang.String, propertyNames: js.Array[java.lang.String]) = this()
  /** Gets an array of strings that specify the user profile property names. */
  def getPropertyNames(): js.Array[java.lang.String] = js.native
  /** Specifies the user account name */
  def get_accountName(): java.lang.String = js.native
  /** Specifies the user account name */
  def set_accountName(value: java.lang.String): java.lang.String = js.native
}

