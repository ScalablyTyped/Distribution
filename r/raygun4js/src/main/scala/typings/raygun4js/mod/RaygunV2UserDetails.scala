package typings.raygun4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaygunV2UserDetails extends js.Object {
  
  /**
    * The user's email address.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The user's first or preferred name.
    */
  var firstName: js.UndefOr[String] = js.native
  
  /**
    * The user's full name.
    */
  var fullName: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the user within Raygun.
    */
  var identifier: String = js.native
  
  /**
    * Indicates whether the user is anonymous or has a user account. Even if this is set to true, you should still give the user a unique identifier of some kind.
    */
  var isAnonymous: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifier of the device the app is running on. This could be used to correlate user accounts over multiple machines.
    */
  var uuid: js.UndefOr[String] = js.native
}
object RaygunV2UserDetails {
  
  @scala.inline
  def apply(identifier: String): RaygunV2UserDetails = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunV2UserDetails]
  }
  
  @scala.inline
  implicit class RaygunV2UserDetailsOps[Self <: RaygunV2UserDetails] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    
    @scala.inline
    def setIsAnonymous(value: Boolean): Self = this.set("isAnonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAnonymous: Self = this.set("isAnonymous", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
