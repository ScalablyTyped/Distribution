package typings.rcDialog

import org.scalablytyped.runtime.Shortcut
import typings.rcDialog.dialogMod.IDialogChildProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefAttributes
import typings.std.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentMod extends Shortcut {
  
  @JSImport("rc-dialog/es/Dialog/Content", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ContentProps & RefAttributes[ContentRef]] = js.native
  
  trait ContentProps
    extends StObject
       with IDialogChildProps {
    
    var ariaId: String
    
    var motionName: String
    
    var onClick: MouseEventHandler[Element]
    
    def onVisibleChanged(visible: Boolean): Unit
  }
  object ContentProps {
    
    inline def apply(
      ariaId: String,
      getOpenCount: () => Double,
      motionName: String,
      onClick: MouseEvent[Element, NativeMouseEvent] => Unit,
      onVisibleChanged: Boolean => Unit
    ): ContentProps = {
      val __obj = js.Dynamic.literal(ariaId = ariaId.asInstanceOf[js.Any], getOpenCount = js.Any.fromFunction0(getOpenCount), motionName = motionName.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onVisibleChanged = js.Any.fromFunction1(onVisibleChanged))
      __obj.asInstanceOf[ContentProps]
    }
    
    extension [Self <: ContentProps](x: Self) {
      
      inline def setAriaId(value: String): Self = StObject.set(x, "ariaId", value.asInstanceOf[js.Any])
      
      inline def setMotionName(value: String): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChanged(value: Boolean => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1(value))
    }
  }
  
  trait ContentRef extends StObject {
    
    def changeActive(next: Boolean): Unit
    
    def focus(): Unit
    
    def getDOM(): HTMLDivElement
  }
  object ContentRef {
    
    inline def apply(changeActive: Boolean => Unit, focus: () => Unit, getDOM: () => HTMLDivElement): ContentRef = {
      val __obj = js.Dynamic.literal(changeActive = js.Any.fromFunction1(changeActive), focus = js.Any.fromFunction0(focus), getDOM = js.Any.fromFunction0(getDOM))
      __obj.asInstanceOf[ContentRef]
    }
    
    extension [Self <: ContentRef](x: Self) {
      
      inline def setChangeActive(value: Boolean => Unit): Self = StObject.set(x, "changeActive", js.Any.fromFunction1(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetDOM(value: () => HTMLDivElement): Self = StObject.set(x, "getDOM", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[ContentProps & RefAttributes[ContentRef]]
  
  /* This means you don't have to write `default`, but can instead just say `contentMod.foo` */
  override def _to: ForwardRefExoticComponent[ContentProps & RefAttributes[ContentRef]] = default
}
