package typings.reactNativeGoogleSignin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  var email: String | Null = js.native
  var familyName: String | Null = js.native
  var givenName: String | Null = js.native
  var id: String | Null = js.native
  var name: String | Null = js.native
  var photo: String | Null = js.native
}

object Email {
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamilyNameNull: Self = this.set("familyName", null)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGivenNameNull: Self = this.set("givenName", null)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setPhoto(value: String): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotoNull: Self = this.set("photo", null)
  }
  
}

