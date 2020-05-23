package typings.reactNativeGoogleSignin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: String | Null
  var familyName: String | Null
  var givenName: String | Null
  var id: String | Null
  var name: String | Null
  var photo: String | Null
}

object Email {
  @scala.inline
  def apply(
    email: String = null,
    familyName: String = null,
    givenName: String = null,
    id: String = null,
    name: String = null,
    photo: String = null
  ): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

