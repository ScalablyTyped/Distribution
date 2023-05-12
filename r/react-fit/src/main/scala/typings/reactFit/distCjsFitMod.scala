package typings.reactFit

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactFit.anon.Children
import typings.reactFit.anon.keyinSpacingKeysnumber
import typings.reactFit.reactFitStrings.x
import typings.reactFit.reactFitStrings.y
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsFitMod {
  
  @JSImport("react-fit/dist/cjs/Fit", JSImport.Default)
  @js.native
  open class default () extends Fit
  /* static members */
  object default {
    
    @JSImport("react-fit/dist/cjs/Fit", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fit/dist/cjs/Fit", "default.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Fit
    extends Component[FitProps, js.Object, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MFit(): Unit = js.native
    
    var container: js.UndefOr[HTMLElement | Null] = js.native
    
    var element: js.UndefOr[HTMLElement | Null] = js.native
    
    var elementHeight: js.UndefOr[Double] = js.native
    
    var elementWidth: js.UndefOr[Double] = js.native
    
    def fit(): Unit = js.native
    
    var scrollContainer: js.UndefOr[HTMLElement] = js.native
  }
  
  trait FitProps extends StObject {
    
    var children: ReactNode
    
    var invertAxis: js.UndefOr[Boolean] = js.undefined
    
    var invertSecondaryAxis: js.UndefOr[Boolean] = js.undefined
    
    var mainAxis: js.UndefOr[x | y] = js.undefined
    
    var spacing: js.UndefOr[Double | Spacing] = js.undefined
  }
  object FitProps {
    
    inline def apply(): FitProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FitProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInvertAxis(value: Boolean): Self = StObject.set(x, "invertAxis", value.asInstanceOf[js.Any])
      
      inline def setInvertAxisUndefined: Self = StObject.set(x, "invertAxis", js.undefined)
      
      inline def setInvertSecondaryAxis(value: Boolean): Self = StObject.set(x, "invertSecondaryAxis", value.asInstanceOf[js.Any])
      
      inline def setInvertSecondaryAxisUndefined: Self = StObject.set(x, "invertSecondaryAxis", js.undefined)
      
      inline def setMainAxis(value: typings.reactFit.reactFitStrings.x | y): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
      
      inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
      
      inline def setSpacing(value: Double | Spacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
  
  type Spacing = Double | keyinSpacingKeysnumber
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFit.reactFitStrings.bottom
    - typings.reactFit.reactFitStrings.left
    - typings.reactFit.reactFitStrings.right
    - typings.reactFit.reactFitStrings.top
  */
  trait SpacingKeys extends StObject
  object SpacingKeys {
    
    inline def bottom: typings.reactFit.reactFitStrings.bottom = "bottom".asInstanceOf[typings.reactFit.reactFitStrings.bottom]
    
    inline def left: typings.reactFit.reactFitStrings.left = "left".asInstanceOf[typings.reactFit.reactFitStrings.left]
    
    inline def right: typings.reactFit.reactFitStrings.right = "right".asInstanceOf[typings.reactFit.reactFitStrings.right]
    
    inline def top: typings.reactFit.reactFitStrings.top = "top".asInstanceOf[typings.reactFit.reactFitStrings.top]
  }
}
