package typings.reactAuthKit

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateRouteMod extends Shortcut {
  
  @JSImport("react-auth-kit/dist/PrivateRoute", JSImport.Default)
  @js.native
  val default: FunctionComponent[RequireAuthProps] = js.native
  
  trait RequireAuthProps extends StObject {
    
    var children: Element
    
    var loginPath: String
  }
  object RequireAuthProps {
    
    inline def apply(children: Element, loginPath: String): RequireAuthProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loginPath = loginPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequireAuthProps]
    }
    
    extension [Self <: RequireAuthProps](x: Self) {
      
      inline def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setLoginPath(value: String): Self = StObject.set(x, "loginPath", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[RequireAuthProps]
  
  /* This means you don't have to write `default`, but can instead just say `privateRouteMod.foo` */
  override def _to: FunctionComponent[RequireAuthProps] = default
}
