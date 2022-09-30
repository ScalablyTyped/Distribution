package typings.reduxAuthWrapper

import typings.react.mod.ElementType
import typings.reduxAuthWrapper.mod.AuthConfig
import typings.reduxAuthWrapper.mod.AuthWrapperDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authWrapperMod {
  
  @JSImport("redux-auth-wrapper/authWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[OwnProps](config: AuthWrapperConfig): AuthWrapperDecorator[OwnProps & InjectedAuthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[OwnProps & InjectedAuthProps]]
  
  trait AuthWrapperConfig
    extends StObject
       with AuthConfig {
    
    var FailureComponent: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object AuthWrapperConfig {
    
    inline def apply(): AuthWrapperConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthWrapperConfig]
    }
    
    extension [Self <: AuthWrapperConfig](x: Self) {
      
      inline def setFailureComponent(value: ElementType[Any]): Self = StObject.set(x, "FailureComponent", value.asInstanceOf[js.Any])
      
      inline def setFailureComponentUndefined: Self = StObject.set(x, "FailureComponent", js.undefined)
    }
  }
  
  trait InjectedAuthProps extends StObject {
    
    var isAuthenticated: Boolean
    
    var isAuthenticating: Boolean
  }
  object InjectedAuthProps {
    
    inline def apply(isAuthenticated: Boolean, isAuthenticating: Boolean): InjectedAuthProps = {
      val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedAuthProps]
    }
    
    extension [Self <: InjectedAuthProps](x: Self) {
      
      inline def setIsAuthenticated(value: Boolean): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
      
      inline def setIsAuthenticating(value: Boolean): Self = StObject.set(x, "isAuthenticating", value.asInstanceOf[js.Any])
    }
  }
}
