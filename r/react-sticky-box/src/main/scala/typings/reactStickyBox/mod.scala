package typings.reactStickyBox

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-sticky-box", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[StickyBoxProps, ComponentState, js.Any] {
    def this(props: StickyBoxProps) = this()
    def this(props: StickyBoxProps, context: js.Any) = this()
  }
  @JSImport("react-sticky-box", JSImport.Default)
  @js.native
  val default: ComponentClass[StickyBoxProps, ComponentState] = js.native
  
  trait StickyBoxInstance extends StObject {
    
    var latestScrollY: Double
    
    var mode: StickyBoxMode
    
    var naturalTop: Double
    
    var node: HTMLElement
    
    var nodeHeight: Double
    
    var offset: Double
    
    var parentHeight: Double
    
    var scrollPane: HTMLElement | Window
    
    var viewportHeight: Double
  }
  object StickyBoxInstance {
    
    inline def apply(
      latestScrollY: Double,
      mode: StickyBoxMode,
      naturalTop: Double,
      node: HTMLElement,
      nodeHeight: Double,
      offset: Double,
      parentHeight: Double,
      scrollPane: HTMLElement | Window,
      viewportHeight: Double
    ): StickyBoxInstance = {
      val __obj = js.Dynamic.literal(latestScrollY = latestScrollY.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], naturalTop = naturalTop.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeHeight = nodeHeight.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentHeight = parentHeight.asInstanceOf[js.Any], scrollPane = scrollPane.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyBoxInstance]
    }
    
    extension [Self <: StickyBoxInstance](x: Self) {
      
      inline def setLatestScrollY(value: Double): Self = StObject.set(x, "latestScrollY", value.asInstanceOf[js.Any])
      
      inline def setMode(value: StickyBoxMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setNaturalTop(value: Double): Self = StObject.set(x, "naturalTop", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeHeight(value: Double): Self = StObject.set(x, "nodeHeight", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setParentHeight(value: Double): Self = StObject.set(x, "parentHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollPane(value: HTMLElement | Window): Self = StObject.set(x, "scrollPane", value.asInstanceOf[js.Any])
      
      inline def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactStickyBox.reactStickyBoxStrings.relative
    - typings.reactStickyBox.reactStickyBoxStrings.stickyBottom
    - typings.reactStickyBox.reactStickyBoxStrings.stickyTop
  */
  trait StickyBoxMode extends StObject
  object StickyBoxMode {
    
    inline def relative: typings.reactStickyBox.reactStickyBoxStrings.relative = "relative".asInstanceOf[typings.reactStickyBox.reactStickyBoxStrings.relative]
    
    inline def stickyBottom: typings.reactStickyBox.reactStickyBoxStrings.stickyBottom = "stickyBottom".asInstanceOf[typings.reactStickyBox.reactStickyBoxStrings.stickyBottom]
    
    inline def stickyTop: typings.reactStickyBox.reactStickyBoxStrings.stickyTop = "stickyTop".asInstanceOf[typings.reactStickyBox.reactStickyBoxStrings.stickyTop]
  }
  
  trait StickyBoxProps extends StObject {
    
    var bottom: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var offsetBottom: js.UndefOr[Double] = js.undefined
    
    var offsetTop: js.UndefOr[Double] = js.undefined
    
    var onChangeMode: js.UndefOr[
        js.Function2[/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode, js.Any]
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StickyBoxProps {
    
    inline def apply(): StickyBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyBoxProps]
    }
    
    extension [Self <: StickyBoxProps](x: Self) {
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      inline def setOnChangeMode(value: (/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode) => js.Any): Self = StObject.set(x, "onChangeMode", js.Any.fromFunction2(value))
      
      inline def setOnChangeModeUndefined: Self = StObject.set(x, "onChangeMode", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ComponentClass[StickyBoxProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[StickyBoxProps, ComponentState] = default
}
