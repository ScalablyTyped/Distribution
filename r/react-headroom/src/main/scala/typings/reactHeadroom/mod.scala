package typings.reactHeadroom

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-headroom", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[ReactHeadroomProps, js.Object, Any] {
    def this(props: ReactHeadroomProps) = this()
  }
  
  type Headroom = Component[ReactHeadroomProps, js.Object, Any]
  
  trait ReactHeadroomProps extends StObject {
    
    var calcHeightOnResize: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var downTolerance: js.UndefOr[Double] = js.undefined
    
    var onPin: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onUnfix: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onUnpin: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var parent: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var pinStart: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var upTolerance: js.UndefOr[Double] = js.undefined
    
    var wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object ReactHeadroomProps {
    
    inline def apply(): ReactHeadroomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactHeadroomProps]
    }
    
    extension [Self <: ReactHeadroomProps](x: Self) {
      
      inline def setCalcHeightOnResize(value: Boolean): Self = StObject.set(x, "calcHeightOnResize", value.asInstanceOf[js.Any])
      
      inline def setCalcHeightOnResizeUndefined: Self = StObject.set(x, "calcHeightOnResize", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDownTolerance(value: Double): Self = StObject.set(x, "downTolerance", value.asInstanceOf[js.Any])
      
      inline def setDownToleranceUndefined: Self = StObject.set(x, "downTolerance", js.undefined)
      
      inline def setOnPin(value: () => Unit): Self = StObject.set(x, "onPin", js.Any.fromFunction0(value))
      
      inline def setOnPinUndefined: Self = StObject.set(x, "onPin", js.undefined)
      
      inline def setOnUnfix(value: () => Unit): Self = StObject.set(x, "onUnfix", js.Any.fromFunction0(value))
      
      inline def setOnUnfixUndefined: Self = StObject.set(x, "onUnfix", js.undefined)
      
      inline def setOnUnpin(value: () => Unit): Self = StObject.set(x, "onUnpin", js.Any.fromFunction0(value))
      
      inline def setOnUnpinUndefined: Self = StObject.set(x, "onUnpin", js.undefined)
      
      inline def setParent(value: () => Any): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPinStart(value: Double): Self = StObject.set(x, "pinStart", value.asInstanceOf[js.Any])
      
      inline def setPinStartUndefined: Self = StObject.set(x, "pinStart", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUpTolerance(value: Double): Self = StObject.set(x, "upTolerance", value.asInstanceOf[js.Any])
      
      inline def setUpToleranceUndefined: Self = StObject.set(x, "upTolerance", js.undefined)
      
      inline def setWrapperStyle(value: CSSProperties): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
}
