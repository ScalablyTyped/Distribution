package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * ISO-8601 date
    * @type {string}
    * @memberof User
    */
  var created_at: js.UndefOr[String] = js.undefined
  
  /**
    * user email
    * @type {string}
    * @memberof User
    */
  var email: String
  
  /**
    * user first name
    * @type {string}
    * @memberof User
    */
  var first_name: js.UndefOr[String] = js.undefined
  
  /**
    * user last name
    * @type {string}
    * @memberof User
    */
  var last_name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * @type {string}
    * @memberof User
    */
  @JSName("org")
  var org_ : js.UndefOr[String] = js.undefined
  
  /**
    *
    * @type {Array<Organization>}
    * @memberof User
    */
  var orgs: js.UndefOr[js.Array[Organization]] = js.undefined
  
  /**
    * List of roles for a given user
    * @type {Array<string>}
    * @memberof User
    */
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * state of user - NEW / ACTIVE
    * @type {string}
    * @memberof User
    */
  var state: js.UndefOr[String] = js.undefined
}
object User {
  
  inline def apply(email: String): User = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    inline def setOrgs(value: js.Array[Organization]): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
    
    inline def setOrgsUndefined: Self = StObject.set(x, "orgs", js.undefined)
    
    inline def setOrgsVarargs(value: Organization*): Self = StObject.set(x, "orgs", js.Array(value*))
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
