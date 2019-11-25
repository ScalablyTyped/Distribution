package typings.reactDashNativeDashGoogleDashSignin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: String | Null
  var familyName: String | Null
  var givenName: String | Null
  var id: String | Null
  var name: String | Null
  var photo: String | Null
}

object Anon_Email {
  @scala.inline
  def apply(
    email: String = null,
    familyName: String = null,
    givenName: String = null,
    id: String = null,
    name: String = null,
    photo: String = null
  ): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Email]
  }
}

