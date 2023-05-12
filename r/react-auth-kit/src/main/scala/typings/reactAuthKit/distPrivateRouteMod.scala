package typings.reactAuthKit

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPrivateRouteMod extends Shortcut {
  
  /**
    * Private Route for Components
    *
    * @remarks
    * This Component is based on {@link https://reactrouter.com/web/api/Route | reactrouter.Route}.
    * So you need to install react-route-dom before use it
    *
    * @param props
    */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequireAuthProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setLoginPath(value: String): Self = StObject.set(x, "loginPath", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[RequireAuthProps]
  
  /* This means you don't have to write `default`, but can instead just say `distPrivateRouteMod.foo` */
  override def _to: FunctionComponent[RequireAuthProps] = default
}
