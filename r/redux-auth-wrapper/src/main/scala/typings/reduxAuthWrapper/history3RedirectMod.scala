package typings.reduxAuthWrapper

import typings.history.mod.Location
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.reduxAuthWrapper.authWrapperMod.InjectedAuthProps
import typings.reduxAuthWrapper.mod.AuthBaseConfig
import typings.reduxAuthWrapper.mod.AuthConfig
import typings.reduxAuthWrapper.mod.AuthWrapperDecorator
import typings.reduxAuthWrapper.mod.StateSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object history3RedirectMod {
  
  @JSImport("redux-auth-wrapper/history3/redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectedReduxRedirect[OwnProps, State](config: ConnectedReduxRedirectConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps & InjectedAuthReduxProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedReduxRedirect")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[OwnProps & InjectedAuthReduxProps]]
  
  inline def connectedRouterRedirect[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps & (InjectedAuthRouterProps[js.Function1[/* repeated */ Any, Action[Any]]])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedRouterRedirect")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[
    OwnProps & (InjectedAuthRouterProps[js.Function1[/* repeated */ Any, Action[Any]]])
  ]]
  
  inline def createOnEnter[State](config: CreateOnEnterConfig[State]): js.Function3[
    /* store */ Store[Any, AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ /* location */ Any, 
      Unit
    ], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnEnter")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* store */ Store[Any, AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ /* location */ Any, 
      Unit
    ], 
    Unit
  ]]
  
  type ConnectedReduxRedirectConfig[OwnProps, State] = ConnectedRouterRedirectConfig[OwnProps, State]
  
  trait ConnectedRouterRedirectConfig[OwnProps, State]
    extends StObject
       with AuthBaseConfig[OwnProps, State] {
    
    var allowRedirectBack: js.UndefOr[Boolean | (StateSelector[State, OwnProps, Boolean])] = js.undefined
    
    var redirectAction: js.UndefOr[js.Function1[/* location */ Location, Action[Any]]] = js.undefined
    
    var redirectPath: String | (StateSelector[State, OwnProps, String])
    
    var redirectQueryParamName: js.UndefOr[String] = js.undefined
  }
  object ConnectedRouterRedirectConfig {
    
    inline def apply[OwnProps, State](
      authenticatedSelector: (State, OwnProps) => Boolean,
      redirectPath: String | (StateSelector[State, OwnProps, String])
    ): ConnectedRouterRedirectConfig[OwnProps, State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectedRouterRedirectConfig[OwnProps, State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectedRouterRedirectConfig[?, ?], OwnProps, State] (val x: Self & (ConnectedRouterRedirectConfig[OwnProps, State])) extends AnyVal {
      
      inline def setAllowRedirectBack(value: Boolean | (StateSelector[State, OwnProps, Boolean])): Self = StObject.set(x, "allowRedirectBack", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectBackFunction2(value: (State, OwnProps) => Boolean): Self = StObject.set(x, "allowRedirectBack", js.Any.fromFunction2(value))
      
      inline def setAllowRedirectBackUndefined: Self = StObject.set(x, "allowRedirectBack", js.undefined)
      
      inline def setRedirectAction(value: /* location */ Location => Action[Any]): Self = StObject.set(x, "redirectAction", js.Any.fromFunction1(value))
      
      inline def setRedirectActionUndefined: Self = StObject.set(x, "redirectAction", js.undefined)
      
      inline def setRedirectPath(value: String | (StateSelector[State, OwnProps, String])): Self = StObject.set(x, "redirectPath", value.asInstanceOf[js.Any])
      
      inline def setRedirectPathFunction2(value: (State, OwnProps) => String): Self = StObject.set(x, "redirectPath", js.Any.fromFunction2(value))
      
      inline def setRedirectQueryParamName(value: String): Self = StObject.set(x, "redirectQueryParamName", value.asInstanceOf[js.Any])
      
      inline def setRedirectQueryParamNameUndefined: Self = StObject.set(x, "redirectQueryParamName", js.undefined)
    }
  }
  
  trait CreateOnEnterConfig[State]
    extends StObject
       with AuthConfig {
    
    var allowRedirectBack: js.UndefOr[Boolean | (StateMutateSelector[State, Boolean])] = js.undefined
    
    var authenticatedSelector: StateMutateSelector[State, Boolean]
    
    var authenticatingSelector: js.UndefOr[StateMutateSelector[State, Boolean]] = js.undefined
    
    var redirectPath: String | (StateMutateSelector[State, String])
    
    var redirectQueryParamName: js.UndefOr[String] = js.undefined
  }
  object CreateOnEnterConfig {
    
    inline def apply[State](
      authenticatedSelector: (State, State) => Boolean,
      redirectPath: String | (StateMutateSelector[State, String])
    ): CreateOnEnterConfig[State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOnEnterConfig[State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateOnEnterConfig[?], State] (val x: Self & CreateOnEnterConfig[State]) extends AnyVal {
      
      inline def setAllowRedirectBack(value: Boolean | (StateMutateSelector[State, Boolean])): Self = StObject.set(x, "allowRedirectBack", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectBackFunction2(value: (State, State) => Boolean): Self = StObject.set(x, "allowRedirectBack", js.Any.fromFunction2(value))
      
      inline def setAllowRedirectBackUndefined: Self = StObject.set(x, "allowRedirectBack", js.undefined)
      
      inline def setAuthenticatedSelector(value: (State, State) => Boolean): Self = StObject.set(x, "authenticatedSelector", js.Any.fromFunction2(value))
      
      inline def setAuthenticatingSelector(value: (State, State) => Boolean): Self = StObject.set(x, "authenticatingSelector", js.Any.fromFunction2(value))
      
      inline def setAuthenticatingSelectorUndefined: Self = StObject.set(x, "authenticatingSelector", js.undefined)
      
      inline def setRedirectPath(value: String | (StateMutateSelector[State, String])): Self = StObject.set(x, "redirectPath", value.asInstanceOf[js.Any])
      
      inline def setRedirectPathFunction2(value: (State, State) => String): Self = StObject.set(x, "redirectPath", js.Any.fromFunction2(value))
      
      inline def setRedirectQueryParamName(value: String): Self = StObject.set(x, "redirectQueryParamName", value.asInstanceOf[js.Any])
      
      inline def setRedirectQueryParamNameUndefined: Self = StObject.set(x, "redirectQueryParamName", js.undefined)
    }
  }
  
  trait InjectedAuthReduxProps
    extends StObject
       with InjectedAuthProps {
    
    var redirectPath: String
  }
  object InjectedAuthReduxProps {
    
    inline def apply(isAuthenticated: Boolean, isAuthenticating: Boolean, redirectPath: String): InjectedAuthReduxProps = {
      val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedAuthReduxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectedAuthReduxProps] (val x: Self) extends AnyVal {
      
      inline def setRedirectPath(value: String): Self = StObject.set(x, "redirectPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait InjectedAuthRouterProps[Redirect]
    extends StObject
       with InjectedAuthReduxProps {
    
    var redirect: Redirect
  }
  object InjectedAuthRouterProps {
    
    inline def apply[Redirect](isAuthenticated: Boolean, isAuthenticating: Boolean, redirect: Redirect, redirectPath: String): InjectedAuthRouterProps[Redirect] = {
      val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedAuthRouterProps[Redirect]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectedAuthRouterProps[?], Redirect] (val x: Self & InjectedAuthRouterProps[Redirect]) extends AnyVal {
      
      inline def setRedirect(value: Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    }
  }
  
  type StateMutateSelector[State, R] = js.Function2[/* state */ State, /* nextState */ State, R]
}
