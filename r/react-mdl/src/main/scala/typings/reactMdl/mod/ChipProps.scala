package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChipProps
  extends StObject
     with HTMLProps[js.Any] {
  
  @JSName("onClick")
  var onClick_ChipProps: js.UndefOr[MouseEventHandler[Chip]] = js.undefined
  
  var onClose: js.UndefOr[MouseEventHandler[Chip]] = js.undefined
}
object ChipProps {
  
  @scala.inline
  def apply(): ChipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipProps]
  }
  
  @scala.inline
  implicit class ChipPropsMutableBuilder[Self <: ChipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: MouseEvent[Chip, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnClose(value: MouseEvent[Chip, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
  }
}
