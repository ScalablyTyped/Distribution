package typings.reduxAuthWrapper

import typings.history.mod.Location
import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
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

object redirectMod {
  
  @JSImport("redux-auth-wrapper/history3/redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def connectedReduxRedirect[OwnProps, State](config: ConnectedReduxRedirectConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps & InjectedAuthReduxProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedReduxRedirect")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[OwnProps & InjectedAuthReduxProps]]
  
  @scala.inline
  def connectedRouterRedirect[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps & (InjectedAuthRouterProps[js.Function1[/* repeated */ js.Any, Action[js.Any]]])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedRouterRedirect")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[
    OwnProps & (InjectedAuthRouterProps[js.Function1[/* repeated */ js.Any, Action[js.Any]]])
  ]]
  
  @scala.inline
  def createOnEnter[State](config: CreateOnEnterConfig[State]): js.Function3[
    /* store */ Store[js.Any, AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[/* location */ LocationDescriptorObject[LocationState], Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnEnter")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* store */ Store[js.Any, AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[/* location */ LocationDescriptorObject[LocationState], Unit], 
    Unit
  ]]
  
  type ConnectedReduxRedirectConfig[OwnProps, State] = ConnectedRouterRedirectConfig[OwnProps, State]
  
  trait ConnectedRouterRedirectConfig[OwnProps, State]
    extends StObject
       with AuthBaseConfig[OwnProps, State] {
    
    var allowRedirectBack: js.UndefOr[Boolean | (StateSelector[State, OwnProps, Boolean])] = js.undefined
    
    var redirectAction: js.UndefOr[js.Function1[/* location */ Location[LocationState], Action[js.Any]]] = js.undefined
    
    var redirectPath: String | (StateSelector[State, OwnProps, String])
    
    var redirectQueryParamName: js.UndefOr[String] = js.undefined
  }
  object ConnectedRouterRedirectConfig {
    
    @scala.inline
    def apply[OwnProps, State](
      authenticatedSelector: (State, OwnProps) => Boolean,
      redirectPath: String | (StateSelector[State, OwnProps, String])
    ): ConnectedRouterRedirectConfig[OwnProps, State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectedRouterRedirectConfig[OwnProps, State]]
    }
    
    @scala.inline
    implicit class ConnectedRouterRedirectConfigMutableBuilder[Self <: ConnectedRouterRedirectConfig[?, ?], OwnProps, State] (val x: Self & (ConnectedRouterRedirectConfig[OwnProps, State])) extends AnyVal {
      
      @scala.inline
      def setAllowRedirectBack(value: Boolean | (StateSelector[State, OwnProps, Boolean])): Self = StObject.set(x, "allowRedirectBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRedirectBackFunction2(value: (State, OwnProps) => Boolean): Self = StObject.set(x, "allowRedirectBack", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAllowRedirectBackUndefined: Self = StObject.set(x, "allowRedirectBack", js.undefined)
      
      @scala.inline
      def setRedirectAction(value: /* location */ Location[LocationState] => Action[js.Any]): Self = StObject.set(x, "redirectAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRedirectActionUndefined: Self = StObject.set(x, "redirectAction", js.undefined)
      
      @scala.inline
      def setRedirectPath(value: String | (StateSelector[State, OwnProps, String])): Self = StObject.set(x, "redirectPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectPathFunction2(value: (State, OwnProps) => String): Self = StObject.set(x, "redirectPath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRedirectQueryParamName(value: String): Self = StObject.set(x, "redirectQueryParamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectQueryParamNameUndefined: Self = StObject.set(x, "redirectQueryParamName", js.undefined)
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
    
    @scala.inline
    def apply[State](
      authenticatedSelector: (State, State) => Boolean,
      redirectPath: String | (StateMutateSelector[State, String])
    ): CreateOnEnterConfig[State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOnEnterConfig[State]]
    }
    
    @scala.inline
    implicit class CreateOnEnterConfigMutableBuilder[Self <: CreateOnEnterConfig[?], State] (val x: Self & CreateOnEnterConfig[State]) extends AnyVal {
      
      @scala.inline
      def setAllowRedirectBack(value: Boolean | (StateMutateSelector[State, Boolean])): Self = StObject.set(x, "allowRedirectBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRedirectBackFunction2(value: (State, State) => Boolean): Self = StObject.set(x, "allowRedirectBack", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAllowRedirectBackUndefined: Self = StObject.set(x, "allowRedirectBack", js.undefined)
      
      @scala.inline
      def setAuthenticatedSelector(value: (State, State) => Boolean): Self = StObject.set(x, "authenticatedSelector", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuthenticatingSelector(value: (State, State) => Boolean): Self = StObject.set(x, "authenticatingSelector", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuthenticatingSelectorUndefined: Self = StObject.set(x, "authenticatingSelector", js.undefined)
      
      @scala.inline
      def setRedirectPath(value: String | (StateMutateSelector[State, String])): Self = StObject.set(x, "redirectPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectPathFunction2(value: (State, State) => String): Self = StObject.set(x, "redirectPath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRedirectQueryParamName(value: String): Self = StObject.set(x, "redirectQueryParamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectQueryParamNameUndefined: Self = StObject.set(x, "redirectQueryParamName", js.undefined)
    }
  }
  
  trait InjectedAuthReduxProps
    extends StObject
       with InjectedAuthProps {
    
    var redirectPath: String
  }
  object InjectedAuthReduxProps {
    
    @scala.inline
    def apply(isAuthenticated: Boolean, isAuthenticating: Boolean, redirectPath: String): InjectedAuthReduxProps = {
      val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedAuthReduxProps]
    }
    
    @scala.inline
    implicit class InjectedAuthReduxPropsMutableBuilder[Self <: InjectedAuthReduxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirectPath(value: String): Self = StObject.set(x, "redirectPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait InjectedAuthRouterProps[Redirect]
    extends StObject
       with InjectedAuthReduxProps {
    
    var redirect: Redirect
  }
  object InjectedAuthRouterProps {
    
    @scala.inline
    def apply[Redirect](isAuthenticated: Boolean, isAuthenticating: Boolean, redirect: Redirect, redirectPath: String): InjectedAuthRouterProps[Redirect] = {
      val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedAuthRouterProps[Redirect]]
    }
    
    @scala.inline
    implicit class InjectedAuthRouterPropsMutableBuilder[Self <: InjectedAuthRouterProps[?], Redirect] (val x: Self & InjectedAuthRouterProps[Redirect]) extends AnyVal {
      
      @scala.inline
      def setRedirect(value: Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    }
  }
  
  type StateMutateSelector[State, R] = js.Function2[/* state */ State, /* nextState */ State, R]
}
