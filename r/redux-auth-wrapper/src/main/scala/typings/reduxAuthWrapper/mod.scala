package typings.reduxAuthWrapper

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait AuthBaseConfig[OwnProps, State]
    extends StObject
       with AuthConfig {
    
    var authenticatedSelector: StateSelector[State, OwnProps, Boolean]
    
    var authenticatingSelector: js.UndefOr[StateSelector[State, OwnProps, Boolean]] = js.undefined
  }
  object AuthBaseConfig {
    
    inline def apply[OwnProps, State](authenticatedSelector: (State, OwnProps) => Boolean): AuthBaseConfig[OwnProps, State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector))
      __obj.asInstanceOf[AuthBaseConfig[OwnProps, State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthBaseConfig[?, ?], OwnProps, State] (val x: Self & (AuthBaseConfig[OwnProps, State])) extends AnyVal {
      
      inline def setAuthenticatedSelector(value: (State, OwnProps) => Boolean): Self = StObject.set(x, "authenticatedSelector", js.Any.fromFunction2(value))
      
      inline def setAuthenticatingSelector(value: (State, OwnProps) => Boolean): Self = StObject.set(x, "authenticatingSelector", js.Any.fromFunction2(value))
      
      inline def setAuthenticatingSelectorUndefined: Self = StObject.set(x, "authenticatingSelector", js.undefined)
    }
  }
  
  trait AuthConfig extends StObject {
    
    var AuthenticatingComponent: js.UndefOr[ElementType[Any]] = js.undefined
    
    var wrapperDisplayName: js.UndefOr[String] = js.undefined
  }
  object AuthConfig {
    
    inline def apply(): AuthConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthConfig] (val x: Self) extends AnyVal {
      
      inline def setAuthenticatingComponent(value: ElementType[Any]): Self = StObject.set(x, "AuthenticatingComponent", value.asInstanceOf[js.Any])
      
      inline def setAuthenticatingComponentUndefined: Self = StObject.set(x, "AuthenticatingComponent", js.undefined)
      
      inline def setWrapperDisplayName(value: String): Self = StObject.set(x, "wrapperDisplayName", value.asInstanceOf[js.Any])
      
      inline def setWrapperDisplayNameUndefined: Self = StObject.set(x, "wrapperDisplayName", js.undefined)
    }
  }
  
  type AuthWrapperDecorator[Props] = js.Function1[/* component */ ComponentType[Props], ComponentClass[Props, ComponentState]]
  
  type StateSelector[State, OwnProps, R] = js.Function2[/* state */ State, /* props */ OwnProps, R]
}
