package typings.reactHeadroom

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-headroom", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ReactHeadroomProps, js.Object, js.Any] {
    def this(props: ReactHeadroomProps) = this()
  }
  
  type Headroom = Component[ReactHeadroomProps, js.Object, js.Any]
  
  @js.native
  trait ReactHeadroomProps extends StObject {
    
    var calcHeightOnResize: js.UndefOr[Boolean] = js.native
    
    var children: ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disable: js.UndefOr[Boolean] = js.native
    
    var disableInlineStyles: js.UndefOr[Boolean] = js.native
    
    var downTolerance: js.UndefOr[Double] = js.native
    
    var onPin: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onUnfix: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onUnpin: js.UndefOr[js.Function0[Unit]] = js.native
    
    var parent: js.UndefOr[js.Function0[_]] = js.native
    
    var pinStart: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var upTolerance: js.UndefOr[Double] = js.native
    
    var wrapperStyle: js.UndefOr[CSSProperties] = js.native
  }
  object ReactHeadroomProps {
    
    @scala.inline
    def apply(): ReactHeadroomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactHeadroomProps]
    }
    
    @scala.inline
    implicit class ReactHeadroomPropsMutableBuilder[Self <: ReactHeadroomProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalcHeightOnResize(value: Boolean): Self = StObject.set(x, "calcHeightOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalcHeightOnResizeUndefined: Self = StObject.set(x, "calcHeightOnResize", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setDownTolerance(value: Double): Self = StObject.set(x, "downTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownToleranceUndefined: Self = StObject.set(x, "downTolerance", js.undefined)
      
      @scala.inline
      def setOnPin(value: () => Unit): Self = StObject.set(x, "onPin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPinUndefined: Self = StObject.set(x, "onPin", js.undefined)
      
      @scala.inline
      def setOnUnfix(value: () => Unit): Self = StObject.set(x, "onUnfix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnfixUndefined: Self = StObject.set(x, "onUnfix", js.undefined)
      
      @scala.inline
      def setOnUnpin(value: () => Unit): Self = StObject.set(x, "onUnpin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnpinUndefined: Self = StObject.set(x, "onUnpin", js.undefined)
      
      @scala.inline
      def setParent(value: () => _): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPinStart(value: Double): Self = StObject.set(x, "pinStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinStartUndefined: Self = StObject.set(x, "pinStart", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUpTolerance(value: Double): Self = StObject.set(x, "upTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpToleranceUndefined: Self = StObject.set(x, "upTolerance", js.undefined)
      
      @scala.inline
      def setWrapperStyle(value: CSSProperties): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
}
