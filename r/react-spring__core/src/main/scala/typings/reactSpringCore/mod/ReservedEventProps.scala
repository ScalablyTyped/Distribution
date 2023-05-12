package typings.reactSpringCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedEventProps extends StObject {
  
  var onChange: js.UndefOr[scala.Any] = js.undefined
  
  var onDestroyed: js.UndefOr[scala.Any] = js.undefined
  
  var onPause: js.UndefOr[scala.Any] = js.undefined
  
  var onProps: js.UndefOr[scala.Any] = js.undefined
  
  var onResolve: js.UndefOr[scala.Any] = js.undefined
  
  var onRest: js.UndefOr[scala.Any] = js.undefined
  
  var onResume: js.UndefOr[scala.Any] = js.undefined
  
  var onStart: js.UndefOr[scala.Any] = js.undefined
}
object ReservedEventProps {
  
  inline def apply(): ReservedEventProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedEventProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservedEventProps] (val x: Self) extends AnyVal {
    
    inline def setOnChange(value: scala.Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnDestroyed(value: scala.Any): Self = StObject.set(x, "onDestroyed", value.asInstanceOf[js.Any])
    
    inline def setOnDestroyedUndefined: Self = StObject.set(x, "onDestroyed", js.undefined)
    
    inline def setOnPause(value: scala.Any): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnProps(value: scala.Any): Self = StObject.set(x, "onProps", value.asInstanceOf[js.Any])
    
    inline def setOnPropsUndefined: Self = StObject.set(x, "onProps", js.undefined)
    
    inline def setOnResolve(value: scala.Any): Self = StObject.set(x, "onResolve", value.asInstanceOf[js.Any])
    
    inline def setOnResolveUndefined: Self = StObject.set(x, "onResolve", js.undefined)
    
    inline def setOnRest(value: scala.Any): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
    
    inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
    
    inline def setOnResume(value: scala.Any): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
    
    inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
    
    inline def setOnStart(value: scala.Any): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
  }
}
