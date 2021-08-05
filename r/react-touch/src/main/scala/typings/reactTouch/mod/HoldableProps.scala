package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoldableProps extends StObject {
  
  /** @see defineHold */
  var config: js.UndefOr[HoldableConfig] = js.undefined
  
  var onHoldComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onHoldProgress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object HoldableProps {
  
  inline def apply(): HoldableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoldableProps]
  }
  
  extension [Self <: HoldableProps](x: Self) {
    
    inline def setConfig(value: HoldableConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setOnHoldComplete(value: () => Unit): Self = StObject.set(x, "onHoldComplete", js.Any.fromFunction0(value))
    
    inline def setOnHoldCompleteUndefined: Self = StObject.set(x, "onHoldComplete", js.undefined)
    
    inline def setOnHoldProgress(value: () => Unit): Self = StObject.set(x, "onHoldProgress", js.Any.fromFunction0(value))
    
    inline def setOnHoldProgressUndefined: Self = StObject.set(x, "onHoldProgress", js.undefined)
    
    inline def setOnMouseDown(value: () => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction0(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnTouchStart(value: () => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction0(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
