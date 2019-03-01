package typings
package raygun4jsLib.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunV2UserDetails extends js.Object {
  /**
    * The user's email address.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user's first or preferred name.
    */
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user's full name.
    */
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Uniquely identifies the user within Raygun.
    */
  var identifier: java.lang.String
  /**
    * Indicates whether the user is anonymous or has a user account. Even if this is set to true, you should still give the user a unique identifier of some kind.
    */
  var isAnonymous: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Identifier of the device the app is running on. This could be used to correlate user accounts over multiple machines.
    */
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

object RaygunV2UserDetails {
  @scala.inline
  def apply(
    identifier: java.lang.String,
    email: java.lang.String = null,
    firstName: java.lang.String = null,
    fullName: java.lang.String = null,
    isAnonymous: js.UndefOr[scala.Boolean] = js.undefined,
    uuid: java.lang.String = null
  ): RaygunV2UserDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identifier")(identifier)
    if (email != null) __obj.updateDynamic("email")(email)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (!js.isUndefined(isAnonymous)) __obj.updateDynamic("isAnonymous")(isAnonymous)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[RaygunV2UserDetails]
  }
}

