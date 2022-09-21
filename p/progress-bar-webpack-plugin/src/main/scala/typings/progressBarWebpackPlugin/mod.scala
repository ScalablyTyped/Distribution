package typings.progressBarWebpackPlugin

import typings.progress.mod.ProgressBarOptions
import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A progress bar plugin for Webpack.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("progress-bar-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: Options) = this()
  }
  
  trait Options
    extends StObject
       with ProgressBarOptions {
    
    /**
      * optional function to call when the progress bar completes
      */
    @JSName("callback")
    var callback_Options: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * function to display a custom summary
      * (passed build time)
      */
    var customSummary: js.UndefOr[js.Function1[/* summary */ String, Unit]] = js.undefined
    
    /**
      * the format of the progress bar
      * @default ':bar'
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * option to show summary of time taken
      * @default true
      */
    var summary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * custom summary message if summary option is false
      */
    var summaryContent: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(total: Double): Options = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCustomSummary(value: /* summary */ String => Unit): Self = StObject.set(x, "customSummary", js.Any.fromFunction1(value))
      
      inline def setCustomSummaryUndefined: Self = StObject.set(x, "customSummary", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setSummary(value: Boolean): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryContent(value: Boolean): Self = StObject.set(x, "summaryContent", value.asInstanceOf[js.Any])
      
      inline def setSummaryContentUndefined: Self = StObject.set(x, "summaryContent", js.undefined)
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  /**
    * A progress bar plugin for Webpack.
    */
  type ProgressBarPlugin = Plugin
}
