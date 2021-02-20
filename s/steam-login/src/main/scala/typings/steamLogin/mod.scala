package typings.steamLogin

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.steamLogin.anon.Avatar
import typings.steamLogin.anon.Large
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("steam-login", "authenticate")
  @js.native
  def authenticate(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("steam-login", "enforceLogin")
  @js.native
  def enforceLogin(redirect: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("steam-login", "middleware")
  @js.native
  def middleware(opts: MiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("steam-login", "verify")
  @js.native
  def verify(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait MiddlewareOptions extends StObject {
    
    var apiKey: String = js.native
    
    var realm: String = js.native
    
    var useSession: js.UndefOr[Boolean] = js.native
    
    var verify: String = js.native
  }
  object MiddlewareOptions {
    
    @scala.inline
    def apply(apiKey: String, realm: String, verify: String): MiddlewareOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    @scala.inline
    implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSession(value: Boolean): Self = StObject.set(x, "useSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSessionUndefined: Self = StObject.set(x, "useSession", js.undefined)
      
      @scala.inline
      def setVerify(value: String): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SteamRequest
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    var logout: js.UndefOr[
        js.Function0[
          js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], js.Function0[Unit]]
        ]
      ] = js.native
    
    var user: js.UndefOr[SteamUser] = js.native
  }
  
  @js.native
  trait SteamUser extends StObject {
    
    var _json: Avatar = js.native
    
    var avatar: Large = js.native
    
    var name: String = js.native
    
    var profile: String = js.native
    
    var steamid: String = js.native
    
    var username: String = js.native
  }
  object SteamUser {
    
    @scala.inline
    def apply(_json: Avatar, avatar: Large, name: String, profile: String, steamid: String, username: String): SteamUser = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[SteamUser]
    }
    
    @scala.inline
    implicit class SteamUserMutableBuilder[Self <: SteamUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: Large): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteamid(value: String): Self = StObject.set(x, "steamid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_json(value: Avatar): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
    }
  }
}
