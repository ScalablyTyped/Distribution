package typings.protonNative.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Called when the quit menu item is called, right before the entire app quits.
    */
  var onShouldQuit: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object AppProps {
  
  inline def apply(): AppProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnShouldQuit(value: () => Unit): Self = StObject.set(x, "onShouldQuit", js.Any.fromFunction0(value))
    
    inline def setOnShouldQuitUndefined: Self = StObject.set(x, "onShouldQuit", js.undefined)
  }
}
