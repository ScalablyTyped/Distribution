package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  @JSImport("pusher-js/types/src/core/user", JSImport.Default)
  @js.native
  open class default protected () extends UserFacade {
    def this(pusher: typings.pusherJs.pusherMod.default) = this()
  }
  
  @js.native
  trait UserFacade
    extends typings.pusherJs.dispatcherMod.default {
    
    /* private */ var _cleanup: Any = js.native
    
    /* private */ var _newSigninPromiseIfNeeded: Any = js.native
    
    /* private */ var _onAuthorize: Any = js.native
    
    /* private */ var _onSigninSuccess: Any = js.native
    
    /* private */ var _signin: Any = js.native
    
    /* private */ var _signinDoneResolve: Any = js.native
    
    /* private */ var _subscribeChannels: Any = js.native
    
    var pusher: typings.pusherJs.pusherMod.default = js.native
    
    var serverToUserChannel: typings.pusherJs.channelMod.default = js.native
    
    def signin(): Unit = js.native
    
    var signinDonePromise: js.Promise[Any] = js.native
    
    var signin_requested: Boolean = js.native
    
    var user_data: Any = js.native
  }
}
