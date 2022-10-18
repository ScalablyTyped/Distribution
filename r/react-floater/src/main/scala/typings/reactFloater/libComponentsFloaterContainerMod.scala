package typings.reactFloater

import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactFloater.libTypesMod.HandlerFunction
import typings.reactFloater.libTypesMod.Styles
import typings.std.Event
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloaterContainerMod {
  
  @JSImport("react-floater/lib/components/Floater/Container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var content: ReactNode
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: HandlerFunction[HTMLButtonElement]
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var positionWrapper: Boolean
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var styles: Styles
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object Props {
    
    inline def apply(
      onClick: /* event */ SyntheticEvent[HTMLButtonElement, Event] => Unit,
      positionWrapper: Boolean,
      styles: Styles
    ): Props = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), positionWrapper = positionWrapper.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setOnClick(value: /* event */ SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPositionWrapper(value: Boolean): Self = StObject.set(x, "positionWrapper", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
