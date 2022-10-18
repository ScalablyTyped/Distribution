package typings.reactFloater

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactFloater.libTypesMod.HandlerFunction
import typings.std.Event
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloaterCloseButtonMod {
  
  @JSImport("react-floater/lib/components/Floater/CloseButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasOnClickStyles: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasOnClickStyles.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var onClick: HandlerFunction[HTMLButtonElement]
    
    var styles: CSSProperties
  }
  object Props {
    
    inline def apply(onClick: /* event */ SyntheticEvent[HTMLButtonElement, Event] => Unit, styles: CSSProperties): Props = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnClick(value: /* event */ SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setStyles(value: CSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
