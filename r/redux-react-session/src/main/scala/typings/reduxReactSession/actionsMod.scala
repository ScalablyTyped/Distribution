package typings.reduxReactSession

import typings.reduxReactSession.mod.ActionTypes
import typings.reduxReactSession.reduxReactSessionStrings.`@@redux-react-sessionSlashGET_SESSION_ERROR`
import typings.reduxReactSession.reduxReactSessionStrings.`@@redux-react-sessionSlashGET_SESSION_SUCCESS`
import typings.reduxReactSession.reduxReactSessionStrings.`@@redux-react-sessionSlashGET_USER_SESSION_ERROR`
import typings.reduxReactSession.reduxReactSessionStrings.`@@redux-react-sessionSlashGET_USER_SESSION_SUCCESS`
import typings.reduxReactSession.reduxReactSessionStrings.`@@redux-react-sessionSlashINVALID_SESSION`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("redux-react-session/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSessionError(): GetSessionErrorAction = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionError")().asInstanceOf[GetSessionErrorAction]
  
  inline def getSessionSuccess(): GetSessionSuccessAction = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionSuccess")().asInstanceOf[GetSessionSuccessAction]
  
  inline def getUserSessionError(): GetUserSessionErrorAction = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserSessionError")().asInstanceOf[GetUserSessionErrorAction]
  
  inline def getUserSessionSuccess[UserType](user: UserType): GetUserSessionSuccessAction[UserType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserSessionSuccess")(user.asInstanceOf[js.Any]).asInstanceOf[GetUserSessionSuccessAction[UserType]]
  
  inline def invalidSession(): InvalidSessionAction = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidSession")().asInstanceOf[InvalidSessionAction]
  
  trait GetSessionErrorAction
    extends StObject
       with ActionTypes[Any] {
    
    var `type`: `@@redux-react-sessionSlashGET_SESSION_ERROR`
  }
  object GetSessionErrorAction {
    
    inline def apply(): GetSessionErrorAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("@@redux-react-session/GET_SESSION_ERROR")
      __obj.asInstanceOf[GetSessionErrorAction]
    }
    
    extension [Self <: GetSessionErrorAction](x: Self) {
      
      inline def setType(value: `@@redux-react-sessionSlashGET_SESSION_ERROR`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetSessionSuccessAction
    extends StObject
       with ActionTypes[Any] {
    
    var `type`: `@@redux-react-sessionSlashGET_SESSION_SUCCESS`
  }
  object GetSessionSuccessAction {
    
    inline def apply(): GetSessionSuccessAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("@@redux-react-session/GET_SESSION_SUCCESS")
      __obj.asInstanceOf[GetSessionSuccessAction]
    }
    
    extension [Self <: GetSessionSuccessAction](x: Self) {
      
      inline def setType(value: `@@redux-react-sessionSlashGET_SESSION_SUCCESS`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetUserSessionErrorAction
    extends StObject
       with ActionTypes[Any] {
    
    var `type`: `@@redux-react-sessionSlashGET_USER_SESSION_ERROR`
  }
  object GetUserSessionErrorAction {
    
    inline def apply(): GetUserSessionErrorAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("@@redux-react-session/GET_USER_SESSION_ERROR")
      __obj.asInstanceOf[GetUserSessionErrorAction]
    }
    
    extension [Self <: GetUserSessionErrorAction](x: Self) {
      
      inline def setType(value: `@@redux-react-sessionSlashGET_USER_SESSION_ERROR`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetUserSessionSuccessAction[UserType]
    extends StObject
       with ActionTypes[UserType] {
    
    var `type`: `@@redux-react-sessionSlashGET_USER_SESSION_SUCCESS`
    
    var user: UserType
  }
  object GetUserSessionSuccessAction {
    
    inline def apply[UserType](user: UserType): GetUserSessionSuccessAction[UserType] = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("@@redux-react-session/GET_USER_SESSION_SUCCESS")
      __obj.asInstanceOf[GetUserSessionSuccessAction[UserType]]
    }
    
    extension [Self <: GetUserSessionSuccessAction[?], UserType](x: Self & GetUserSessionSuccessAction[UserType]) {
      
      inline def setType(value: `@@redux-react-sessionSlashGET_USER_SESSION_SUCCESS`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUser(value: UserType): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidSessionAction
    extends StObject
       with ActionTypes[Any] {
    
    var `type`: `@@redux-react-sessionSlashINVALID_SESSION`
  }
  object InvalidSessionAction {
    
    inline def apply(): InvalidSessionAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("@@redux-react-session/INVALID_SESSION")
      __obj.asInstanceOf[InvalidSessionAction]
    }
    
    extension [Self <: InvalidSessionAction](x: Self) {
      
      inline def setType(value: `@@redux-react-sessionSlashINVALID_SESSION`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
