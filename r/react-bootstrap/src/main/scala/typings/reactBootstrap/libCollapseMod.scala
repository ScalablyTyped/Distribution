package typings.reactBootstrap

import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.TransitionCallbacks
import typings.reactBootstrap.reactBootstrapStrings.height
import typings.reactBootstrap.reactBootstrapStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCollapseMod {
  
  @JSImport("react-bootstrap/lib/Collapse", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[CollapseProps, js.Object, Any]
  
  type Collapse = Component[CollapseProps, js.Object, Any]
  
  trait CollapseProps
    extends StObject
       with TransitionCallbacks
       with ClassAttributes[Collapse] {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var dimension: js.UndefOr[height | width | js.Function0[String]] = js.undefined
    
    var getDimensionValue: js.UndefOr[js.Function2[/* dimension */ Double, /* element */ ReactElement, Double]] = js.undefined
    
    var in: js.UndefOr[Boolean] = js.undefined
    
    var mountOnEnter: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var transitionAppear: js.UndefOr[Boolean] = js.undefined
    
    var unmountOnExit: js.UndefOr[Boolean] = js.undefined
  }
  object CollapseProps {
    
    inline def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollapseProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDimension(value: height | width | js.Function0[String]): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setDimensionFunction0(value: () => String): Self = StObject.set(x, "dimension", js.Any.fromFunction0(value))
      
      inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      inline def setGetDimensionValue(value: (/* dimension */ Double, /* element */ ReactElement) => Double): Self = StObject.set(x, "getDimensionValue", js.Any.fromFunction2(value))
      
      inline def setGetDimensionValueUndefined: Self = StObject.set(x, "getDimensionValue", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransitionAppear(value: Boolean): Self = StObject.set(x, "transitionAppear", value.asInstanceOf[js.Any])
      
      inline def setTransitionAppearUndefined: Self = StObject.set(x, "transitionAppear", js.undefined)
      
      inline def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
