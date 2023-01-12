package typings.reactTether

import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.reactTether.anon.ElementComponent
import typings.reactTether.anon.Left
import typings.reactTether.anon.PartialCSSStyleDeclaratio
import typings.std.Element
import typings.std.HTMLElement
import typings.tether.mod.ITetherOptions
import typings.tether.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tether", JSImport.Default)
  @js.native
  open class default () extends ReactTether
  
  @js.native
  trait ReactTether
    extends Component[ReactTetherProps, js.Object, Any] {
    
    def _addContainerToDOM(): Unit = js.native
    
    def _createContainer(): Unit = js.native
    
    def _createTetherInstance(tetherOptions: ITetherOptions): Unit = js.native
    
    def _destroy(): Unit = js.native
    
    def _destroyTetherInstance(): Unit = js.native
    
    var _elementNode: RefObject[HTMLElement] = js.native
    
    var _elementParentNode: HTMLElement | Null = js.native
    
    def _registerEventListeners(): Unit = js.native
    
    def _removeContainer(): Unit = js.native
    
    def _renderNode: Element | Null = js.native
    
    def _runRenders(): ElementComponent = js.native
    
    var _targetNode: RefObject[HTMLElement] = js.native
    
    var _tetherInstance: ^ | Null = js.native
    
    def _update(): Unit = js.native
    
    def _updateTether(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MReactTether(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactTether(previousProps: ReactTetherProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MReactTether(): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def getTetherInstance(): ^ | Null = js.native
    
    def off(event: TetherEvent, handler: TetherEventHandler): Unit = js.native
    
    def on(event: TetherEvent, handler: TetherEventHandler): Unit = js.native
    def on(event: TetherEvent, handler: TetherEventHandler, ctx: Any): Unit = js.native
    
    def once(event: TetherEvent, handler: TetherEventHandler): Unit = js.native
    def once(event: TetherEvent, handler: TetherEventHandler, ctx: Any): Unit = js.native
    
    def position(): Unit = js.native
  }
  
  trait ReactTetherProps
    extends StObject
       with ITetherOptions {
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onRepositioned: js.UndefOr[TetherEventHandler] = js.undefined
    
    var onUpdate: js.UndefOr[TetherEventHandler] = js.undefined
    
    var renderElement: js.UndefOr[js.Function1[/* ref */ RefObject[Any], Unit]] = js.undefined
    
    var renderElementTag: js.UndefOr[String] = js.undefined
    
    var renderElementTo: js.UndefOr[String | HTMLElement] = js.undefined
    
    def renderTarget(ref: RefObject[Any]): Unit
    
    var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  }
  object ReactTetherProps {
    
    inline def apply(attachment: String, renderTarget: RefObject[Any] => Unit): ReactTetherProps = {
      val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], renderTarget = js.Any.fromFunction1(renderTarget))
      __obj.asInstanceOf[ReactTetherProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactTetherProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnRepositioned(value: /* event */ js.UndefOr[Left] => Unit): Self = StObject.set(x, "onRepositioned", js.Any.fromFunction1(value))
      
      inline def setOnRepositionedUndefined: Self = StObject.set(x, "onRepositioned", js.undefined)
      
      inline def setOnUpdate(value: /* event */ js.UndefOr[Left] => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRenderElement(value: /* ref */ RefObject[Any] => Unit): Self = StObject.set(x, "renderElement", js.Any.fromFunction1(value))
      
      inline def setRenderElementTag(value: String): Self = StObject.set(x, "renderElementTag", value.asInstanceOf[js.Any])
      
      inline def setRenderElementTagUndefined: Self = StObject.set(x, "renderElementTag", js.undefined)
      
      inline def setRenderElementTo(value: String | HTMLElement): Self = StObject.set(x, "renderElementTo", value.asInstanceOf[js.Any])
      
      inline def setRenderElementToUndefined: Self = StObject.set(x, "renderElementTo", js.undefined)
      
      inline def setRenderElementUndefined: Self = StObject.set(x, "renderElement", js.undefined)
      
      inline def setRenderTarget(value: RefObject[Any] => Unit): Self = StObject.set(x, "renderTarget", js.Any.fromFunction1(value))
      
      inline def setStyle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTether.reactTetherStrings.repositioned
    - typings.reactTether.reactTetherStrings.update
  */
  trait TetherEvent extends StObject
  object TetherEvent {
    
    inline def repositioned: typings.reactTether.reactTetherStrings.repositioned = "repositioned".asInstanceOf[typings.reactTether.reactTetherStrings.repositioned]
    
    inline def update: typings.reactTether.reactTetherStrings.update = "update".asInstanceOf[typings.reactTether.reactTetherStrings.update]
  }
  
  type TetherEventHandler = js.Function1[/* event */ js.UndefOr[Left], Unit]
}
