package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoldableProps extends StObject {
  
  /** @see defineHold */
  var config: js.UndefOr[HoldableConfig] = js.native
  
  var onHoldComplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onHoldProgress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.native
}
object HoldableProps {
  
  @scala.inline
  def apply(): HoldableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoldableProps]
  }
  
  @scala.inline
  implicit class HoldablePropsMutableBuilder[Self <: HoldableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: HoldableConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setOnHoldComplete(value: () => Unit): Self = StObject.set(x, "onHoldComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHoldCompleteUndefined: Self = StObject.set(x, "onHoldComplete", js.undefined)
    
    @scala.inline
    def setOnHoldProgress(value: () => Unit): Self = StObject.set(x, "onHoldProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHoldProgressUndefined: Self = StObject.set(x, "onHoldProgress", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: () => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: () => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
