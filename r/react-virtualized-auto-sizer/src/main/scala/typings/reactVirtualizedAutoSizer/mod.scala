package typings.reactVirtualizedAutoSizer

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-virtualized-auto-sizer", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[AutoSizerProps, js.Object, js.Any] {
    def this(props: AutoSizerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoSizerProps, context: js.Any) = this()
  }
  
  trait AutoSizerProps extends StObject {
    
    /** Function responsible for rendering children. */
    def children(size: Size): ReactNode
    
    /** Optional custom CSS class name to attach to root AutoSizer element.    */
    var className: js.UndefOr[String] = js.undefined
    
    /** Default height to use for initial render; useful for SSR */
    var defaultHeight: js.UndefOr[Double] = js.undefined
    
    /** Default width to use for initial render; useful for SSR */
    var defaultWidth: js.UndefOr[Double] = js.undefined
    
    /** Disable dynamic :height property */
    var disableHeight: js.UndefOr[Boolean] = js.undefined
    
    /** Disable dynamic :width property */
    var disableWidth: js.UndefOr[Boolean] = js.undefined
    
    /** Nonce of the inlined stylesheet for Content Security Policy */
    var nonce: js.UndefOr[String] = js.undefined
    
    /** Callback to be invoked on-resize */
    var onResize: js.UndefOr[js.Function1[/* size */ Size, Unit]] = js.undefined
    
    /** Optional inline style */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AutoSizerProps {
    
    @scala.inline
    def apply(children: Size => ReactNode): AutoSizerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[AutoSizerProps]
    }
    
    @scala.inline
    implicit class AutoSizerPropsMutableBuilder[Self <: AutoSizerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Size => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
      
      @scala.inline
      def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
      
      @scala.inline
      def setDisableHeight(value: Boolean): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHeightUndefined: Self = StObject.set(x, "disableHeight", js.undefined)
      
      @scala.inline
      def setDisableWidth(value: Boolean): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableWidthUndefined: Self = StObject.set(x, "disableWidth", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* size */ Size => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Size extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Size {
    
    @scala.inline
    def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
