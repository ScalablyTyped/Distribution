package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppProps extends StObject {
  
  /**
    * Called when the quit menu item is called, right before the entire app quits.
    */
  var onShouldQuit: js.UndefOr[js.Function0[Unit]] = js.native
}
object AppProps {
  
  @scala.inline
  def apply(): AppProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppProps]
  }
  
  @scala.inline
  implicit class AppPropsMutableBuilder[Self <: AppProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnShouldQuit(value: () => Unit): Self = StObject.set(x, "onShouldQuit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShouldQuitUndefined: Self = StObject.set(x, "onShouldQuit", js.undefined)
  }
}
