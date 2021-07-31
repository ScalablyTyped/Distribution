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
    
    @scala.inline
    def apply(): OffCanvasBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffCanvasBodyProps]
    }
    
    @scala.inline
    implicit class OffCanvasBodyPropsMutableBuilder[Self <: OffCanvasBodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsMenuOpened(value: Boolean): Self = StObject.set(x, "isMenuOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMenuOpenedUndefined: Self = StObject.set(x, "isMenuOpened", js.undefined)
      
      @scala.inline
      def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    @scala.inline
    def apply(): OffCanvasMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffCanvasMenuProps]
    }
    
    @scala.inline
    implicit class OffCanvasMenuPropsMutableBuilder[Self <: OffCanvasMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsMenuOpened(value: Boolean): Self = StObject.set(x, "isMenuOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMenuOpenedUndefined: Self = StObject.set(x, "isMenuOpened", js.undefined)
      
      @scala.inline
      def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    @scala.inline
    def apply(): OffCanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffCanvasProps]
    }
    
    @scala.inline
    implicit class OffCanvasPropsMutableBuilder[Self <: OffCanvasProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setEffect(value: push | overlay | parallax): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setIsMenuOpened(value: Boolean): Self = StObject.set(x, "isMenuOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMenuOpenedUndefined: Self = StObject.set(x, "isMenuOpened", js.undefined)
      
      @scala.inline
      def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
