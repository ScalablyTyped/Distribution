package typings.reduxAuthWrapper

import typings.react.mod.ReactType
import typings.reduxAuthWrapper.mod.AuthConfig
import typings.reduxAuthWrapper.mod.AuthWrapperDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authWrapperMod {
  
  @JSImport("redux-auth-wrapper/authWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[OwnProps](config: AuthWrapperConfig): AuthWrapperDecorator[OwnProps & InjectedAuthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[OwnProps & InjectedAuthProps]]
  
  trait AuthWrapperConfig
    extends StObject
       with AuthConfig {
    
    var FailureComponent: js.UndefOr[ReactType[js.Any]] = js.undefined
  }
  object AuthWrapperConfig {
    
    @scala.inline
    def apply(): AuthWrapperConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthWrapperConfig]
    }
    
    @scala.inline
    implicit class AuthWrapperConfigMutableBuilder[Self <: AuthWrapperConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailureComponent(value: ReactType[js.Any]): Self = StObject.set(x, "FailureComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureComponentUndefined: Self = StObject.set(x, "FailureComponent", js.undefined)
    }
  }
  
  trait InjectedAuthProps extends StObject {
    
    var isAuthenticated: Boolean
    
    var isAuthenticating: Boolean
  }
  object InjectedAuthProps {
    
    @scala.inline
    def apply(isAuthenticated: Boolean, isAuthenticating: Boolean): InjectedAuthProps = {
      val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedAuthProps]
    }
    
    @scala.inline
    implicit class InjectedAuthPropsMutableBuilder[Self <: InjectedAuthProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAuthenticated(value: Boolean): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAuthenticating(value: Boolean): Self = StObject.set(x, "isAuthenticating", value.asInstanceOf[js.Any])
    }
  }
}
