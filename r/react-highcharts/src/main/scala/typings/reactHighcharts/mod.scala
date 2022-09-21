package typings.reactHighcharts

import typings.highcharts.mod.Options
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * React interface for highcharts.
    */
  @JSImport("react-highcharts", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReactHighchartsProps, js.Object, Any]
  object default {
    
    @JSImport("react-highcharts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-highcharts", "default.Highcharts")
    @js.native
    def Highcharts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.Static */ Any = js.native
    inline def Highcharts_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.Static */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Highcharts")(x.asInstanceOf[js.Any])
  }
  
  /**
    * React interface for highcharts.
    */
  type ReactHighcharts = Component[ReactHighchartsProps, js.Object, Any]
  
  /**
    * Props for ReactHighcharts component.
    */
  trait ReactHighchartsProps extends StObject {
    
    /**
      *
      * @param after-render callback.
      */
    var callback: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ Any, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Highcharts configuration options.
      */
    var config: Options
    
    /**
      * Chart will not rerender if the config is referentially equal to previous and this property is true
      */
    var isPureConfig: js.UndefOr[Boolean] = js.undefined
  }
  object ReactHighchartsProps {
    
    inline def apply(config: Options): ReactHighchartsProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactHighchartsProps]
    }
    
    extension [Self <: ReactHighchartsProps](x: Self) {
      
      inline def setCallback(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ Any => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setConfig(value: Options): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setIsPureConfig(value: Boolean): Self = StObject.set(x, "isPureConfig", value.asInstanceOf[js.Any])
      
      inline def setIsPureConfigUndefined: Self = StObject.set(x, "isPureConfig", js.undefined)
    }
  }
}
