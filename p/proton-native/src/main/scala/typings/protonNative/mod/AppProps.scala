package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppProps extends StObject {
  
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
  
  extension [Self <: AppProps](x: Self) {
    
    inline def setOnShouldQuit(value: () => Unit): Self = StObject.set(x, "onShouldQuit", js.Any.fromFunction0(value))
    
    inline def setOnShouldQuitUndefined: Self = StObject.set(x, "onShouldQuit", js.undefined)
  }
}
