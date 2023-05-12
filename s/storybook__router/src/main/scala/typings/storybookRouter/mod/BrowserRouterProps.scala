package typings.storybookRouter.mod

import typings.react.mod.ReactNode
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserRouterProps extends StObject {
  
  var basename: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var window: js.UndefOr[Window] = js.undefined
}
object BrowserRouterProps {
  
  inline def apply(): BrowserRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserRouterProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserRouterProps] (val x: Self) extends AnyVal {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
