package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An extended profile with detailed information about the user.
  */
@js.native
trait UserProfile extends js.Object {
  
   // TODO: Determine if this is free-text or actually an enum type.
  /**
    * The users birthday.
    */
  var birthday: js.UndefOr[String] = js.native
  
  /**
    * The users email address.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The users first name.
    */
  var firstName: js.UndefOr[String] = js.native
  
  /**
    * The users gender.
    */
  var gender: js.UndefOr[String] = js.native
  
  /**
    * The users last name.
    */
  var lastName: js.UndefOr[String] = js.native
  
  /**
    * The maximal age of the user.
    */
  var maxAge: js.UndefOr[String] = js.native
  
   // TODO: Determine the format.
  /**
    * The minimal age of the user.
    */
  var minAge: js.UndefOr[String] = js.native
  
  /**
    * The commonly displayed name of the user.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A URL referencing a picture associated with the user.
    */
  var pictureUrl: js.UndefOr[String] = js.native
  
  /**
    * The type of user
    * // TODO: Determine the meaning of the different possibilities.
    */
  var `type`: UserType = js.native
}
object UserProfile {
  
  @scala.inline
  def apply(`type`: UserType): UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfile]
  }
  
  @scala.inline
  implicit class UserProfileOps[Self <: UserProfile] (val x: Self) extends AnyVal {
    
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
    def setType(value: UserType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthday(value: String): Self = this.set("birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirthday: Self = this.set("birthday", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    
    @scala.inline
    def setMaxAge(value: String): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setMinAge(value: String): Self = this.set("minAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAge: Self = this.set("minAge", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPictureUrl(value: String): Self = this.set("pictureUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePictureUrl: Self = this.set("pictureUrl", js.undefined)
  }
}
