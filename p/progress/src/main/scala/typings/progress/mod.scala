package typings.progress

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Flexible ascii progress bar.
    */
  @JSImport("progress", JSImport.Namespace)
  @js.native
  class ^ protected () extends ProgressBar {
    def this(format: String, options: ProgressBarOptions) = this()
    /**
      * Initialize a `ProgressBar` with the given `fmt` string and `options` or
      * `total`.
      *
      * Options:
      *   - `total` total number of ticks to complete
      *   - `width` the displayed width of the progress bar defaulting to total
      *   - `stream` the output stream defaulting to stderr
      *   - `complete` completion character defaulting to "="
      *   - `incomplete` incomplete character defaulting to "-"
      *   - `renderThrottle` minimum time between updates in milliseconds defaulting to 16
      *   - `callback` optional function to call when the progress bar completes
      *   - `clear` will clear the progress bar upon termination
      *
      * Tokens:
      *   - `:bar` the progress bar itself
      *   - `:current` current tick number
      *   - `:total` total ticks
      *   - `:elapsed` time elapsed in seconds
      *   - `:percent` completion percentage
      *   - `:eta` eta in seconds
      */
    def this(format: String, total: Double) = this()
  }
  
  /**
    * Flexible ascii progress bar.
    */
  @js.native
  trait ProgressBar extends StObject {
    
    /**
      * Completed status of progress (Boolean)
      */
    var complete: Boolean = js.native
    
    /**
      * Current tick number.
      */
    var curr: Double = js.native
    
    /**
      * "interrupt" the progress bar and write a message above it.
      */
    def interrupt(message: String): Unit = js.native
    
    /**
      * Method to render the progress bar with optional `tokens` to place in the
      * progress bar's `fmt` field.
      */
    def render(): Unit = js.native
    def render(tokens: js.Any): Unit = js.native
    
    /**
      * Terminates a progress bar.
      */
    def terminate(): Unit = js.native
    
    /**
      * "tick" the progress bar with optional `len` and optional `tokens`.
      */
    def tick(): Unit = js.native
    def tick(count: js.UndefOr[scala.Nothing], tokens: js.Any): Unit = js.native
    def tick(count: Double): Unit = js.native
    def tick(count: Double, tokens: js.Any): Unit = js.native
    def tick(tokens: js.Any): Unit = js.native
    
    /**
      * Total number of ticks to complete.
      */
    var total: Double = js.native
    
    /**
      * "update" the progress bar to represent an exact percentage.
      * The ratio (between 0 and 1) specified will be multiplied by `total` and
      * floored, representing the closest available "tick." For example, if a
      * progress bar has a length of 3 and `update(0.5)` is called, the progress
      * will be set to 1.
      *
      * A ratio of 0.5 will attempt to set the progress to halfway.
      *
      * @param ratio The ratio (between 0 and 1 inclusive) to set the
      *   overall completion to.
      */
    def update(ratio: Double): Unit = js.native
    def update(ratio: Double, tokens: js.Any): Unit = js.native
  }
  
  /**
    * These are keys in the options object you can pass to the progress bar along with total as seen in the example above.
    */
  @js.native
  trait ProgressBarOptions extends StObject {
    
    /**
      * Optional function to call when the progress bar completes.
      */
    var callback: js.UndefOr[js.Function] = js.native
    
    /**
      * Option to clear the bar on completion defaulting to false.
      */
    var clear: js.UndefOr[Boolean] = js.native
    
    /**
      * Completion character defaulting to "=".
      */
    var complete: js.UndefOr[String] = js.native
    
    /**
      * current completed index
      */
    var curr: js.UndefOr[Double] = js.native
    
    /**
      * head character defaulting to complete character
      */
    var head: js.UndefOr[String] = js.native
    
    /**
      * Incomplete character defaulting to "-".
      */
    var incomplete: js.UndefOr[String] = js.native
    
    /**
      * minimum time between updates in milliseconds defaulting to 16
      */
    var renderThrottle: js.UndefOr[Double] = js.native
    
    /**
      * The output stream defaulting to stderr.
      */
    var stream: js.UndefOr[WritableStream] = js.native
    
    /**
      * Total number of ticks to complete.
      */
    var total: Double = js.native
    
    /**
      * The displayed width of the progress bar defaulting to total.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ProgressBarOptions {
    
    @scala.inline
    def apply(total: Double): ProgressBarOptions = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressBarOptions]
    }
    
    @scala.inline
    implicit class ProgressBarOptionsMutableBuilder[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setComplete(value: String): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setCurr(value: Double): Self = StObject.set(x, "curr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrUndefined: Self = StObject.set(x, "curr", js.undefined)
      
      @scala.inline
      def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setIncomplete(value: String): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncompleteUndefined: Self = StObject.set(x, "incomplete", js.undefined)
      
      @scala.inline
      def setRenderThrottle(value: Double): Self = StObject.set(x, "renderThrottle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderThrottleUndefined: Self = StObject.set(x, "renderThrottle", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
