package typings.pusherJs

import typings.pusherJs.pusherJsStrings.ajax
import typings.pusherJs.pusherJsStrings.jsonp
import typings.pusherJs.typesSrcCoreAuthOptionsMod.ChannelAuthorizationCallback
import typings.pusherJs.typesSrcCoreAuthOptionsMod.ChannelAuthorizationHandler
import typings.pusherJs.typesSrcCoreAuthOptionsMod.InternalAuthOptions
import typings.pusherJs.typesSrcCoreChannelsChannelMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreAuthDeprecatedChannelAuthorizerMod {
  
  @JSImport("pusher-js/types/src/core/auth/deprecated_channel_authorizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ChannelAuthorizerProxy(
    pusher: Any,
    authOptions: InternalAuthOptions,
    channelAuthorizerGenerator: ChannelAuthorizerGenerator
  ): ChannelAuthorizationHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("ChannelAuthorizerProxy")(pusher.asInstanceOf[js.Any], authOptions.asInstanceOf[js.Any], channelAuthorizerGenerator.asInstanceOf[js.Any])).asInstanceOf[ChannelAuthorizationHandler]
  
  type ChannelAuthorizerGenerator = js.Function2[
    /* channel */ default, 
    /* options */ DeprecatedAuthorizerOptions, 
    DeprecatedChannelAuthorizer
  ]
  
  trait DeprecatedAuthOptions extends StObject {
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
  }
  object DeprecatedAuthOptions {
    
    inline def apply(): DeprecatedAuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecatedAuthOptions]
    }
    
    extension [Self <: DeprecatedAuthOptions](x: Self) {
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait DeprecatedAuthorizerOptions extends StObject {
    
    var auth: js.UndefOr[DeprecatedAuthOptions] = js.undefined
    
    var authEndpoint: String
    
    var authTransport: ajax | jsonp
  }
  object DeprecatedAuthorizerOptions {
    
    inline def apply(authEndpoint: String, authTransport: ajax | jsonp): DeprecatedAuthorizerOptions = {
      val __obj = js.Dynamic.literal(authEndpoint = authEndpoint.asInstanceOf[js.Any], authTransport = authTransport.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecatedAuthorizerOptions]
    }
    
    extension [Self <: DeprecatedAuthorizerOptions](x: Self) {
      
      inline def setAuth(value: DeprecatedAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthEndpoint(value: String): Self = StObject.set(x, "authEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAuthTransport(value: ajax | jsonp): Self = StObject.set(x, "authTransport", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    }
  }
  
  trait DeprecatedChannelAuthorizer extends StObject {
    
    def authorize(socketId: String, callback: ChannelAuthorizationCallback): Unit
  }
  object DeprecatedChannelAuthorizer {
    
    inline def apply(authorize: (String, ChannelAuthorizationCallback) => Unit): DeprecatedChannelAuthorizer = {
      val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize))
      __obj.asInstanceOf[DeprecatedChannelAuthorizer]
    }
    
    extension [Self <: DeprecatedChannelAuthorizer](x: Self) {
      
      inline def setAuthorize(value: (String, ChannelAuthorizationCallback) => Unit): Self = StObject.set(x, "authorize", js.Any.fromFunction2(value))
    }
  }
}
