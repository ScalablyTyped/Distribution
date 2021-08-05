package typings.reactOffcanvas

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactOffcanvas.reactOffcanvasStrings.left
import typings.reactOffcanvas.reactOffcanvasStrings.overlay
import typings.reactOffcanvas.reactOffcanvasStrings.parallax
import typings.reactOffcanvas.reactOffcanvasStrings.push
import typings.reactOffcanvas.reactOffcanvasStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-offcanvas", "OffCanvas")
  @js.native
  class OffCanvas protected ()
    extends Component[OffCanvasProps, js.Object, js.Any] {
    def this(props: OffCanvasProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OffCanvasProps, context: js.Any) = this()
  }
  
  @JSImport("react-offcanvas", "OffCanvasBody")
  @js.native
  class OffCanvasBody protected ()
    extends Component[OffCanvasBodyProps, js.Object, js.Any] {
    def this(props: OffCanvasBodyProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OffCanvasBodyProps, context: js.Any) = this()
  }
  
  @JSImport("react-offcanvas", "OffCanvasMenu")
  @js.native
  class OffCanvasMenu protected ()
    extends Component[OffCanvasMenuProps, js.Object, js.Any] {
    def this(props: OffCanvasMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OffCanvasMenuProps, context: js.Any) = this()
  }
  
  trait OffCanvasBodyProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var isMenuOpened: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[left | right] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object OffCanvasBodyProps {
    
    inline def apply(): OffCanvasBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffCanvasBodyProps]
    }
    
    extension [Self <: OffCanvasBodyProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsMenuOpened(value: Boolean): Self = StObject.set(x, "isMenuOpened", value.asInstanceOf[js.Any])
      
      inline def setIsMenuOpenedUndefined: Self = StObject.set(x, "isMenuOpened", js.undefined)
      
      inline def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OffCanvasMenuProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var isMenuOpened: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[left | right] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object OffCanvasMenuProps {
    
    inline def apply(): OffCanvasMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffCanvasMenuProps]
    }
    
    extension [Self <: OffCanvasMenuProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsMenuOpened(value: Boolean): Self = StObject.set(x, "isMenuOpened", value.asInstanceOf[js.Any])
      
      inline def setIsMenuOpenedUndefined: Self = StObject.set(x, "isMenuOpened", js.undefined)
      
      inline def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OffCanvasProps extends StObject {
    
    var children: ReactNode
    
    var effect: js.UndefOr[push | overlay | parallax] = js.undefined
    
    var isMenuOpened: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[left | right] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object OffCanvasProps {
    
    inline def apply(): OffCanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffCanvasProps]
    }
    
    extension [Self <: OffCanvasProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEffect(value: push | overlay | parallax): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setIsMenuOpened(value: Boolean): Self = StObject.set(x, "isMenuOpened", value.asInstanceOf[js.Any])
      
      inline def setIsMenuOpenedUndefined: Self = StObject.set(x, "isMenuOpened", js.undefined)
      
      inline def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
