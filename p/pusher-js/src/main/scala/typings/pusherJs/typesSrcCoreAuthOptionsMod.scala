package typings.pusherJs

import typings.pusherJs.pusherJsStrings.ajax
import typings.pusherJs.pusherJsStrings.jsonp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreAuthOptionsMod {
  
  @js.native
  sealed trait AuthRequestType extends StObject
  @JSImport("pusher-js/types/src/core/auth/options", "AuthRequestType")
  @js.native
  object AuthRequestType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AuthRequestType & String] = js.native
    
    @js.native
    sealed trait ChannelAuthorization
      extends StObject
         with AuthRequestType
    /* "channel-authorization" */ val ChannelAuthorization: typings.pusherJs.typesSrcCoreAuthOptionsMod.AuthRequestType.ChannelAuthorization & String = js.native
    
    @js.native
    sealed trait UserAuthentication
      extends StObject
         with AuthRequestType
    /* "user-authentication" */ val UserAuthentication: typings.pusherJs.typesSrcCoreAuthOptionsMod.AuthRequestType.UserAuthentication & String = js.native
  }
  
  trait AuthOptionsT[AuthHandler] extends StObject {
    
    var customHandler: js.UndefOr[AuthHandler] = js.undefined
    
    var endpoint: String
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var transport: ajax | jsonp
  }
  object AuthOptionsT {
    
    inline def apply[AuthHandler](endpoint: String, transport: ajax | jsonp): AuthOptionsT[AuthHandler] = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthOptionsT[AuthHandler]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthOptionsT[?], AuthHandler] (val x: Self & AuthOptionsT[AuthHandler]) extends AnyVal {
      
      inline def setCustomHandler(value: AuthHandler): Self = StObject.set(x, "customHandler", value.asInstanceOf[js.Any])
      
      inline def setCustomHandlerUndefined: Self = StObject.set(x, "customHandler", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setTransport(value: ajax | jsonp): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  type AuthTransportCallback = ChannelAuthorizationCallback | UserAuthenticationCallback
  
  type ChannelAuthorizationCallback = js.Function2[/* error */ js.Error | Null, /* authData */ ChannelAuthorizationData | Null, Unit]
  
  trait ChannelAuthorizationData extends StObject {
    
    var auth: String
    
    var channel_data: js.UndefOr[String] = js.undefined
    
    var shared_secret: js.UndefOr[String] = js.undefined
  }
  object ChannelAuthorizationData {
    
    inline def apply(auth: String): ChannelAuthorizationData = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelAuthorizationData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelAuthorizationData] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setChannel_data(value: String): Self = StObject.set(x, "channel_data", value.asInstanceOf[js.Any])
      
      inline def setChannel_dataUndefined: Self = StObject.set(x, "channel_data", js.undefined)
      
      inline def setShared_secret(value: String): Self = StObject.set(x, "shared_secret", value.asInstanceOf[js.Any])
      
      inline def setShared_secretUndefined: Self = StObject.set(x, "shared_secret", js.undefined)
    }
  }
  
  type ChannelAuthorizationHandler = js.Function2[
    /* params */ ChannelAuthorizationRequestParams, 
    /* callback */ ChannelAuthorizationCallback, 
    Unit
  ]
  
  type ChannelAuthorizationOptions = AuthOptionsT[ChannelAuthorizationHandler]
  
  trait ChannelAuthorizationRequestParams extends StObject {
    
    var channelName: String
    
    var socketId: String
  }
  object ChannelAuthorizationRequestParams {
    
    inline def apply(channelName: String, socketId: String): ChannelAuthorizationRequestParams = {
      val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelAuthorizationRequestParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelAuthorizationRequestParams] (val x: Self) extends AnyVal {
      
      inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      inline def setSocketId(value: String): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalAuthOptions extends StObject {
    
    var endpoint: String
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var transport: ajax | jsonp
  }
  object InternalAuthOptions {
    
    inline def apply(endpoint: String, transport: ajax | jsonp): InternalAuthOptions = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalAuthOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalAuthOptions] (val x: Self) extends AnyVal {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setTransport(value: ajax | jsonp): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  type UserAuthenticationCallback = js.Function2[/* error */ js.Error | Null, /* authData */ UserAuthenticationData | Null, Unit]
  
  trait UserAuthenticationData extends StObject {
    
    var auth: String
    
    var user_data: String
  }
  object UserAuthenticationData {
    
    inline def apply(auth: String, user_data: String): UserAuthenticationData = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], user_data = user_data.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAuthenticationData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserAuthenticationData] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setUser_data(value: String): Self = StObject.set(x, "user_data", value.asInstanceOf[js.Any])
    }
  }
  
  type UserAuthenticationHandler = js.Function2[
    /* params */ UserAuthenticationRequestParams, 
    /* callback */ UserAuthenticationCallback, 
    Unit
  ]
  
  type UserAuthenticationOptions = AuthOptionsT[UserAuthenticationHandler]
  
  trait UserAuthenticationRequestParams extends StObject {
    
    var socketId: String
  }
  object UserAuthenticationRequestParams {
    
    inline def apply(socketId: String): UserAuthenticationRequestParams = {
      val __obj = js.Dynamic.literal(socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAuthenticationRequestParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserAuthenticationRequestParams] (val x: Self) extends AnyVal {
      
      inline def setSocketId(value: String): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
}
