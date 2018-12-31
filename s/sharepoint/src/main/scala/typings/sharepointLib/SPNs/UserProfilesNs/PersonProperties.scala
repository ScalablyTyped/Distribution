package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents user properties. */
@JSGlobal("SP.UserProfiles.PersonProperties")
@js.native
class PersonProperties ()
  extends sharepointLib.SPNs.ClientObject {
  /** Specifies the person's account name */
  def get_accountName(): java.lang.String = js.native
  /** Specifies an array of strings containing the account names of a person's direct reports. */
  def get_directReports(): js.Array[java.lang.String] = js.native
  /** Specifies the person's name. */
  def get_displayName(): java.lang.String = js.native
  /** Specifies the person's email address. */
  def get_email(): java.lang.String = js.native
  /** Specifies an array of strings that specify the account names of a person's managers. */
  def get_extendedManagers(): js.Array[java.lang.String] = js.native
  /** Specifies an array of strings that specify the account names of person's extended reports. */
  def get_extendedReports(): js.Array[java.lang.String] = js.native
  /** Represents whether or not the current user is following this person. */
  def get_isFollowed(): scala.Boolean = js.native
  /** Specifies the person's latest microblog post. */
  def get_latestPost(): java.lang.String = js.native
  /** Specifies an array of strings that specify the account names of person's peers, that is, those who have the same manager. */
  def get_peers(): js.Array[java.lang.String] = js.native
  /** Specifies the absolute URL of the person's personal page. */
  def get_personalUrl(): java.lang.String = js.native
  /** Specifies the URL for the person's profile picture. */
  def get_pictureUrl(): java.lang.String = js.native
  /** Specifies the person's title. */
  def get_title(): java.lang.String = js.native
  /** Represents all user profile properties including custom.
    The privacy settings affect which properties can be retrieved.
    Multiple values are delimited by the vertical bar "|".
    Null values are specified as empty strings. */
  def get_userProfileProperties(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /** Specifies the URL for the person's profile. */
  def get_userUrl(): java.lang.String = js.native
}

