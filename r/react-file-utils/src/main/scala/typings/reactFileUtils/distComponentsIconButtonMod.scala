package typings.reactFileUtils

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsIconButtonMod {
  
  @JSImport("react-file-utils/dist/components/IconButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def IconButton(param0: PropsWithChildren[IconButtonProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait IconButtonProps extends StObject {
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  }
  object IconButtonProps {
    
    inline def apply(): IconButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconButtonProps] (val x: Self) extends AnyVal {
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
