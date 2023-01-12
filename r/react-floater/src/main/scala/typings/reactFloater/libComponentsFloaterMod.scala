package typings.reactFloater

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactFloater.libTypesMod.HandlerFunction
import typings.reactFloater.libTypesMod.RenderProps
import typings.reactFloater.libTypesMod.Statuses
import typings.reactFloater.libTypesMod.Styles
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloaterMod extends Shortcut {
  
  @JSImport("react-floater/lib/components/Floater", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]] = js.native
  
  trait Props extends StObject {
    
    var arrowRef: Ref[HTMLSpanElement]
    
    var component: js.UndefOr[FunctionComponent[RenderProps] | ReactElement] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var floaterRef: Ref[HTMLDivElement]
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var hideArrow: Boolean
    
    var id: String
    
    var onClick: HandlerFunction[HTMLElement]
    
    var placement: String
    
    var positionWrapper: Boolean
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var status: Statuses
    
    var styles: Styles
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object Props {
    
    inline def apply(
      hideArrow: Boolean,
      id: String,
      onClick: /* event */ SyntheticEvent[HTMLElement, Event] => Unit,
      placement: String,
      positionWrapper: Boolean,
      status: Statuses,
      styles: Styles
    ): Props = {
      val __obj = js.Dynamic.literal(hideArrow = hideArrow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), placement = placement.asInstanceOf[js.Any], positionWrapper = positionWrapper.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], arrowRef = null, floaterRef = null)
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setArrowRef(value: Ref[HTMLSpanElement]): Self = StObject.set(x, "arrowRef", value.asInstanceOf[js.Any])
      
      inline def setArrowRefFunction1(value: /* instance */ HTMLSpanElement | Null => Unit): Self = StObject.set(x, "arrowRef", js.Any.fromFunction1(value))
      
      inline def setArrowRefNull: Self = StObject.set(x, "arrowRef", null)
      
      inline def setComponent(value: FunctionComponent[RenderProps] | ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFloaterRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "floaterRef", value.asInstanceOf[js.Any])
      
      inline def setFloaterRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "floaterRef", js.Any.fromFunction1(value))
      
      inline def setFloaterRefNull: Self = StObject.set(x, "floaterRef", null)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHideArrow(value: Boolean): Self = StObject.set(x, "hideArrow", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPositionWrapper(value: Boolean): Self = StObject.set(x, "positionWrapper", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setStatus(value: Statuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsFloaterMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]] = default
}
