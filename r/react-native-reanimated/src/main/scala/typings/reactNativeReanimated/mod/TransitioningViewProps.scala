package typings.reactNativeReanimated.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitioningViewProps
  extends StObject
     with ViewProps {
  
  var transition: ReactNode
}
object TransitioningViewProps {
  
  inline def apply(): TransitioningViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitioningViewProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitioningViewProps] (val x: Self) extends AnyVal {
    
    inline def setTransition(value: ReactNode): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
