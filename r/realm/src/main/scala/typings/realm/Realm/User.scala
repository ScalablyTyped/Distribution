package typings.realm.Realm

import typings.realm.Realm.Auth.ApiKeyAuth
import typings.realm.Realm.Services.MongoDB
import typings.realm.Realm.Services.Push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of an authenticated user of an app.
  */
@js.native
trait User[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] extends js.Object {
  
  /**
    * The access token used when requesting a new access token.
    */
  val accessToken: String | Null = js.native
  
  /**
    * Perform operations related to the API-key auth provider.
    */
  val apiKeys: ApiKeyAuth = js.native
  
  /**
    * Call a remote MongoDB Realm function by its name.
    * Note: Consider using `functions[name]()` instead of calling this method.
    *
    * @example
    * // These are all equivalent:
    * await user.callFunction("doThing", [a1, a2, a3]);
    * await user.functions.doThing(a1, a2, a3);
    * await user.functions["doThing"](a1, a2, a3);
    *
    * @example
    * // The methods returned from the functions object are bound, which is why it's okay to store the function in a variable before calling it:
    * const doThing = user.functions.doThing;
    * await doThing(a1);
    * await doThing(a2);
    *
    * @param name Name of the function.
    * @param args Arguments passed to the function.
    */
  def callFunction(name: String, args: js.Any*): js.Promise[_] = js.native
  
  /**
    * You can store arbitrary data about your application users in a MongoDB collection and configure MongoDB Realm to automatically expose each user’s data in a field of their user object.
    * For example, you might store a user’s preferred language, date of birth, or their local timezone.
    *
    * If this value has not been configured, it will be empty.
    */
  val customData: CustomDataType = js.native
  
  /**
    * The id of the device.
    */
  val deviceId: String | Null = js.native
  
  /**
    * Use this to call functions defined by the MongoDB Realm app, as this user.
    */
  val functions: FunctionsFactoryType with BaseFunctionsFactory = js.native
  
  /**
    * The automatically-generated internal ID of the user.
    */
  val id: String = js.native
  
  /**
    * The identities of the user at any of the app's authentication providers.
    */
  val identities: js.Array[UserIdentity] = js.native
  
  /**
    * The logged in state of the user.
    */
  val isLoggedIn: Boolean = js.native
  
  /**
    * Link the user with an identity represented by another set of credentials.
    *
    * @param credentials The credentials to use when linking.
    */
  def linkCredentials(credentials: Credentials[js.Object]): js.Promise[Unit] = js.native
  
  /**
    * Log out the user.
    *
    * @returns A promise that resolves once the user has been logged out of the app.
    */
  def logOut(): js.Promise[Unit] = js.native
  
  /**
    * Returns a connection to the MongoDB service.
    *
    * @example
    * let blueWidgets = user.mongoClient('myClusterName')
    *                       .db('myDb')
    *                       .collection('widgets')
    *                       .find({color: 'blue'});
    */
  def mongoClient(serviceName: String): MongoDB = js.native
  
  /**
    * A profile containing additional information about the user.
    */
  val profile: UserProfile = js.native
  
  /**
    * The provider type for the user.
    */
  val providerType: String = js.native
  
  /**
    * Use the Push service to enable sending push messages to this user via Firebase Cloud Messaging (FCM).
    *
    * @returns An service client with methods to register and deregister the device on the user.
    */
  def push(serviceName: String): Push = js.native
  
  /**
    * Refresh the access token and derive custom data from it.
    *
    * @returns The newly fetched custom data.
    */
  def refreshCustomData(): js.Promise[CustomDataType] = js.native
  
  /**
    * The refresh token used when requesting a new access token.
    */
  val refreshToken: String | Null = js.native
  
  /**
    * The state of the user.
    */
  val state: UserState = js.native
}
object User {
  
  @scala.inline
  def apply[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */](
    apiKeys: ApiKeyAuth,
    callFunction: (String, /* repeated */ js.Any) => js.Promise[_],
    customData: CustomDataType,
    functions: FunctionsFactoryType with BaseFunctionsFactory,
    id: String,
    identities: js.Array[UserIdentity],
    isLoggedIn: Boolean,
    linkCredentials: Credentials[js.Object] => js.Promise[Unit],
    logOut: () => js.Promise[Unit],
    mongoClient: String => MongoDB,
    profile: UserProfile,
    providerType: String,
    push: String => Push,
    refreshCustomData: () => js.Promise[CustomDataType],
    state: UserState
  ): User[FunctionsFactoryType, CustomDataType] = {
    val __obj = js.Dynamic.literal(apiKeys = apiKeys.asInstanceOf[js.Any], callFunction = js.Any.fromFunction2(callFunction), customData = customData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], isLoggedIn = isLoggedIn.asInstanceOf[js.Any], linkCredentials = js.Any.fromFunction1(linkCredentials), logOut = js.Any.fromFunction0(logOut), mongoClient = js.Any.fromFunction1(mongoClient), profile = profile.asInstanceOf[js.Any], providerType = providerType.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), refreshCustomData = js.Any.fromFunction0(refreshCustomData), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[User[FunctionsFactoryType, CustomDataType]]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User[_, _], FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] (val x: Self with (User[FunctionsFactoryType, CustomDataType])) extends AnyVal {
    
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
    def setApiKeys(value: ApiKeyAuth): Self = this.set("apiKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallFunction(value: (String, /* repeated */ js.Any) => js.Promise[_]): Self = this.set("callFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCustomData(value: CustomDataType): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctions(value: FunctionsFactoryType with BaseFunctionsFactory): Self = this.set("functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesVarargs(value: UserIdentity*): Self = this.set("identities", js.Array(value :_*))
    
    @scala.inline
    def setIdentities(value: js.Array[UserIdentity]): Self = this.set("identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoggedIn(value: Boolean): Self = this.set("isLoggedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkCredentials(value: Credentials[js.Object] => js.Promise[Unit]): Self = this.set("linkCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogOut(value: () => js.Promise[Unit]): Self = this.set("logOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMongoClient(value: String => MongoDB): Self = this.set("mongoClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProfile(value: UserProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderType(value: String): Self = this.set("providerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: String => Push): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefreshCustomData(value: () => js.Promise[CustomDataType]): Self = this.set("refreshCustomData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: UserState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenNull: Self = this.set("accessToken", null)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdNull: Self = this.set("deviceId", null)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenNull: Self = this.set("refreshToken", null)
  }
}
