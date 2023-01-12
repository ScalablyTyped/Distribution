package typings.reduxReactSession

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.reduxReactSession.reducerMod.SessionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-react-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sessionReducer(state: SessionState, action: Action[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sessionReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("redux-react-session", "sessionService")
  @js.native
  open class sessionService protected () extends StObject {
    def this(store: Store[Any, AnyAction]) = this()
    def this(store: Store[Any, AnyAction], options: SessionServiceOptions) = this()
  }
  /* static members */
  object sessionService {
    
    @JSImport("redux-react-session", "sessionService")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attemptLoadUser(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("attemptLoadUser")().asInstanceOf[js.Promise[Any]]
    
    inline def checkAuth(nextState: Any, replace: Any, next: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAuth")(nextState.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def deleteSession(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteSession")().asInstanceOf[js.Promise[Any]]
    
    inline def deleteUser(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteUser")().asInstanceOf[js.Promise[Any]]
    
    inline def initSessionService(store: Store[Any, AnyAction]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("initSessionService")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def initSessionService(store: Store[Any, AnyAction], options: SessionServiceOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("initSessionService")(store.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def invalidateSession(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateSession")().asInstanceOf[Unit]
    
    inline def loadSession(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSession")().asInstanceOf[js.Promise[Any]]
    
    inline def loadUser(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadUser")().asInstanceOf[js.Promise[Any]]
    
    inline def refreshFromLocalStorage(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshFromLocalStorage")().asInstanceOf[js.Promise[Any]]
    
    inline def saveFromClient(cookies: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("saveFromClient")(cookies.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def saveSession(session: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveSession")(session.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def saveUser(user: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveUser")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def setOptions(store: Store[Any, AnyAction]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setOptions(store: Store[Any, AnyAction], options: SessionServiceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(store.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reduxReactSession.actionsMod.GetSessionSuccessAction
    - typings.reduxReactSession.actionsMod.GetSessionErrorAction
    - typings.reduxReactSession.actionsMod.GetUserSessionSuccessAction[UserType]
    - typings.reduxReactSession.actionsMod.GetUserSessionErrorAction
    - typings.reduxReactSession.actionsMod.InvalidSessionAction
  */
  trait ActionTypes[UserType] extends StObject
  object ActionTypes {
    
    inline def GetSessionErrorAction(): typings.reduxReactSession.actionsMod.GetSessionErrorAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("@@redux-react-session/GET_SESSION_ERROR")
      __obj.asInstanceOf[typings.reduxReactSession.actionsMod.GetSessionErrorAction]
    }
    
    inline def GetSessionSuccessAction(): typings.reduxReactSession.actionsMod.GetSessionSuccessAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("@@redux-react-session/GET_SESSION_SUCCESS")
      __obj.asInstanceOf[typings.reduxReactSession.actionsMod.GetSessionSuccessAction]
    }
    
    inline def GetUserSessionErrorAction(): typings.reduxReactSession.actionsMod.GetUserSessionErrorAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("@@redux-react-session/GET_USER_SESSION_ERROR")
      __obj.asInstanceOf[typings.reduxReactSession.actionsMod.GetUserSessionErrorAction]
    }
    
    inline def GetUserSessionSuccessAction[UserType](user: UserType): typings.reduxReactSession.actionsMod.GetUserSessionSuccessAction[UserType] = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("@@redux-react-session/GET_USER_SESSION_SUCCESS")
      __obj.asInstanceOf[typings.reduxReactSession.actionsMod.GetUserSessionSuccessAction[UserType]]
    }
    
    inline def InvalidSessionAction(): typings.reduxReactSession.actionsMod.InvalidSessionAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("@@redux-react-session/INVALID_SESSION")
      __obj.asInstanceOf[typings.reduxReactSession.actionsMod.InvalidSessionAction]
    }
  }
  
  trait SessionServiceOptions extends StObject {
    
    var driver: Any
    
    var expires: Double
    
    var refreshOnCheckAuth: Boolean
    
    def validateSession(session: Any): Boolean | js.Promise[Boolean]
  }
  object SessionServiceOptions {
    
    inline def apply(
      driver: Any,
      expires: Double,
      refreshOnCheckAuth: Boolean,
      validateSession: Any => Boolean | js.Promise[Boolean]
    ): SessionServiceOptions = {
      val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], refreshOnCheckAuth = refreshOnCheckAuth.asInstanceOf[js.Any], validateSession = js.Any.fromFunction1(validateSession))
      __obj.asInstanceOf[SessionServiceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SessionServiceOptions] (val x: Self) extends AnyVal {
      
      inline def setDriver(value: Any): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setRefreshOnCheckAuth(value: Boolean): Self = StObject.set(x, "refreshOnCheckAuth", value.asInstanceOf[js.Any])
      
      inline def setValidateSession(value: Any => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "validateSession", js.Any.fromFunction1(value))
    }
  }
}
