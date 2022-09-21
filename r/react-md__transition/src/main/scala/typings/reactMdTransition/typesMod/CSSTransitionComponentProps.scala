package typings.reactMdTransition.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSTransitionComponentProps
  extends StObject
     with TransitionCallbacks {
  
  /** {@inheritDoc CSSTransitionClassNames} */
  var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
  
  /** {@inheritDoc CSSTransitionHookOptions.temporary} */
  var temporary: js.UndefOr[Boolean] = js.undefined
  
  /** {@inheritDoc TransitionTimeout} */
  var timeout: js.UndefOr[TransitionTimeout] = js.undefined
}
object CSSTransitionComponentProps {
  
  inline def apply(): CSSTransitionComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSTransitionComponentProps]
  }
  
  extension [Self <: CSSTransitionComponentProps](x: Self) {
    
    inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
    
    inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    
    inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
