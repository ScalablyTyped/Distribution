package typings.realm.Realm

import typings.realm.Realm.Auth.EmailPasswordAuth
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A MongoDB Realm App.
  */
@js.native
trait App_[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] extends js.Object {
  
  /**
    * All authenticated users.
    */
  val allUsers: Record[String, User[FunctionsFactoryType, CustomDataType]] = js.native
  
  /**
    * The last user to log in or being switched to.
    */
  val currentUser: (User[FunctionsFactoryType, CustomDataType]) | Null = js.native
  
  /**
    * Perform operations related to the email/password auth provider.
    */
  var emailPasswordAuth: EmailPasswordAuth = js.native
  
  /**
    * The id of this Realm app.
    */
  val id: String = js.native
  
  /**
    * Log in a user using a specific credential
    *
    * @param credentials the credentials to use when logging in
    */
  def logIn(credentials: Credentials[js.Object]): js.Promise[User[FunctionsFactoryType, CustomDataType]] = js.native
  
  /**
    * Logs out and removes a user from the app.
    *
    * @returns A promise that resolves once the user has been logged out and removed from the app.
    */
  def removeUser(user: User[FunctionsFactoryType, CustomDataType]): js.Promise[Unit] = js.native
  
  /**
    * Switch current user, from an instance of `User` or the string id of the user.
    */
  def switchUser(user: User[FunctionsFactoryType, CustomDataType]): Unit = js.native
}
object App_ {
  
  @scala.inline
  def apply[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */](
    allUsers: Record[String, User[FunctionsFactoryType, CustomDataType]],
    emailPasswordAuth: EmailPasswordAuth,
    id: String,
    logIn: Credentials[js.Object] => js.Promise[User[FunctionsFactoryType, CustomDataType]],
    removeUser: User[FunctionsFactoryType, CustomDataType] => js.Promise[Unit],
    switchUser: User[FunctionsFactoryType, CustomDataType] => Unit
  ): App_[FunctionsFactoryType, CustomDataType] = {
    val __obj = js.Dynamic.literal(allUsers = allUsers.asInstanceOf[js.Any], emailPasswordAuth = emailPasswordAuth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logIn = js.Any.fromFunction1(logIn), removeUser = js.Any.fromFunction1(removeUser), switchUser = js.Any.fromFunction1(switchUser))
    __obj.asInstanceOf[App_[FunctionsFactoryType, CustomDataType]]
  }
  
  @scala.inline
  implicit class App_Ops[Self <: App_[_, _], FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] (val x: Self with (App_[FunctionsFactoryType, CustomDataType])) extends AnyVal {
    
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
    def setAllUsers(value: Record[String, User[FunctionsFactoryType, CustomDataType]]): Self = this.set("allUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailPasswordAuth(value: EmailPasswordAuth): Self = this.set("emailPasswordAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogIn(value: Credentials[js.Object] => js.Promise[User[FunctionsFactoryType, CustomDataType]]): Self = this.set("logIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUser(value: User[FunctionsFactoryType, CustomDataType] => js.Promise[Unit]): Self = this.set("removeUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitchUser(value: User[FunctionsFactoryType, CustomDataType] => Unit): Self = this.set("switchUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentUser(value: User[FunctionsFactoryType, CustomDataType]): Self = this.set("currentUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUserNull: Self = this.set("currentUser", null)
  }
}
