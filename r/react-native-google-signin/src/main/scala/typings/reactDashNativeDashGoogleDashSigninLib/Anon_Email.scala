package typings
package reactDashNativeDashGoogleDashSigninLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: java.lang.String | scala.Null
  var familyName: java.lang.String | scala.Null
  var givenName: java.lang.String | scala.Null
  var id: java.lang.String | scala.Null
  var name: java.lang.String | scala.Null
  var photo: java.lang.String | scala.Null
}

object Anon_Email {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    familyName: java.lang.String = null,
    givenName: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    photo: java.lang.String = null
  ): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    __obj.asInstanceOf[Anon_Email]
  }
}

