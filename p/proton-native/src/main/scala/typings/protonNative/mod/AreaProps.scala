package typings.protonNative.mod

import typings.protonNative.anon.Buttons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaProps
  extends StObject
     with AreaBaseProps {
  
  /**
    * Called when releasing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.undefined
  
  /**
    * Called when pressing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.undefined
  
  /**
    * Whether the area can be seen.
    */
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  
  /**
    * Called when the mouse enters the area.
    */
  var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the mouse leaves the area.
    */
  var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the mouse is moved over the area
    */
  var onMouseMove: js.UndefOr[js.Function1[/* event */ Buttons, Unit]] = js.undefined
  
  /**
    * **Not working at the moment.**
    *
    * Called when releasing a mouse button over the area.
    */
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  
  /**
    * Whether the area can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object AreaProps {
  
  @scala.inline
  def apply(): AreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaProps]
  }
  
  @scala.inline
  implicit class AreaPropsMutableBuilder[Self <: AreaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnKeyDown(value: /* event */ KeyboardEvent => Boolean): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: /* event */ KeyboardEvent => Boolean): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* event */ Buttons => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
