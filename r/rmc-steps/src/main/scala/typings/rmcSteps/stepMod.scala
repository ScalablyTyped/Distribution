package typings.rmcSteps

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod {
  
  @JSImport("rmc-steps/lib/Step", JSImport.Default)
  @js.native
  class default () extends Step
  
  trait IStepProps extends StObject {
    
    var adjustMarginRight: js.UndefOr[Double | String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[js.Any] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var iconPrefix: js.UndefOr[String] = js.undefined
    
    var itemWidth: js.UndefOr[Double | String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var progressDot: js.UndefOr[Boolean | js.Function] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var stepNumber: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var title: js.UndefOr[js.Any] = js.undefined
    
    var wrapperStyle: js.UndefOr[js.Any] = js.undefined
  }
  object IStepProps {
    
    inline def apply(): IStepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStepProps]
    }
    
    extension [Self <: IStepProps](x: Self) {
      
      inline def setAdjustMarginRight(value: Double | String): Self = StObject.set(x, "adjustMarginRight", value.asInstanceOf[js.Any])
      
      inline def setAdjustMarginRightUndefined: Self = StObject.set(x, "adjustMarginRight", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDescription(value: js.Any): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      inline def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItemWidth(value: Double | String): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setProgressDot(value: Boolean | js.Function): Self = StObject.set(x, "progressDot", value.asInstanceOf[js.Any])
      
      inline def setProgressDotUndefined: Self = StObject.set(x, "progressDot", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStepNumber(value: Double): Self = StObject.set(x, "stepNumber", value.asInstanceOf[js.Any])
      
      inline def setStepNumberUndefined: Self = StObject.set(x, "stepNumber", js.undefined)
      
      inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWrapperStyle(value: js.Any): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  @js.native
  trait Step
    extends Component[IStepProps, js.Any, js.Any] {
    
    def renderIconNode(): js.Any = js.native
  }
}
