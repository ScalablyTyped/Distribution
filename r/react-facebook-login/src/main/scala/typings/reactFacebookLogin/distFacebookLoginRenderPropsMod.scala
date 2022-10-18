package typings.reactFacebookLogin

import typings.react.mod.Component
import typings.react.mod.ReactChild
import typings.reactFacebookLogin.mod.ReactFacebookLoginProps
import typings.reactFacebookLogin.mod.ReactFacebookLoginState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFacebookLoginRenderPropsMod {
  
  @JSImport("react-facebook-login/dist/facebook-login-render-props", JSImport.Default)
  @js.native
  open class default () extends Component[ReactFacebookLoginRenderProps, ReactFacebookLoginState, Any]
  
  type FacebookLoginRender = Component[ReactFacebookLoginRenderProps, ReactFacebookLoginState, Any]
  
  @js.native
  trait ReactFacebookLoginRenderProps
    extends StObject
       with ReactFacebookLoginProps {
    
    var render: js.UndefOr[js.Function1[/* renderProps */ RenderProps, ReactChild]] = js.native
  }
  
  trait RenderProps extends StObject {
    
    var isDisabled: Boolean
    
    var isProcessing: Boolean
    
    var isSdkLoaded: Boolean
    
    def onClick(): Unit
  }
  object RenderProps {
    
    inline def apply(isDisabled: Boolean, isProcessing: Boolean, isSdkLoaded: Boolean, onClick: () => Unit): RenderProps = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isProcessing = isProcessing.asInstanceOf[js.Any], isSdkLoaded = isSdkLoaded.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
      __obj.asInstanceOf[RenderProps]
    }
    
    extension [Self <: RenderProps](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsProcessing(value: Boolean): Self = StObject.set(x, "isProcessing", value.asInstanceOf[js.Any])
      
      inline def setIsSdkLoaded(value: Boolean): Self = StObject.set(x, "isSdkLoaded", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    }
  }
}
