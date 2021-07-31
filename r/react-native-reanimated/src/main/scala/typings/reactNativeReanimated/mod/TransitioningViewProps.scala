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
  
  @scala.inline
  def apply(): TransitioningViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitioningViewProps]
  }
  
  @scala.inline
  implicit class TransitioningViewPropsMutableBuilder[Self <: TransitioningViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransition(value: ReactNode): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
