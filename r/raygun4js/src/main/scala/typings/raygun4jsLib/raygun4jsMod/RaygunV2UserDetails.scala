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

