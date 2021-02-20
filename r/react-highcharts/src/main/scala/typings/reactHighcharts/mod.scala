package typings.reactHighcharts

import typings.highcharts.mod.Options
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * React interface for highcharts.
    */
  @JSImport("react-highcharts", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactHighchartsProps, js.Object, js.Any]
  object default {
    
    @JSImport("react-highcharts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-highcharts", "default.Highcharts")
    @js.native
    def Highcharts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.Static */ js.Any = js.native
    @scala.inline
    def Highcharts_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.Static */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Highcharts")(x.asInstanceOf[js.Any])
  }
  
  /**
    * React interface for highcharts.
    */
  type ReactHighcharts = Component[ReactHighchartsProps, js.Object, js.Any]
  
  /**
    * Props for ReactHighcharts component.
    */
  @js.native
  trait ReactHighchartsProps extends StObject {
    
    /**
      *
      * @param after-render callback.
      */
    var callback: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ js.Any, 
          Unit
        ]
      ] = js.native
    
    /**
      * Highcharts configuration options.
      */
    var config: Options = js.native
    
    /**
      * Chart will not rerender if the config is referentially equal to previous and this property is true
      */
    var isPureConfig: js.UndefOr[Boolean] = js.native
  }
  object ReactHighchartsProps {
    
    @scala.inline
    def apply(config: Options): ReactHighchartsProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactHighchartsProps]
    }
    
    @scala.inline
    implicit class ReactHighchartsPropsMutableBuilder[Self <: ReactHighchartsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ js.Any => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setConfig(value: Options): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPureConfig(value: Boolean): Self = StObject.set(x, "isPureConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPureConfigUndefined: Self = StObject.set(x, "isPureConfig", js.undefined)
    }
  }
}
