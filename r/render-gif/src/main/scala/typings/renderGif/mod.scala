package typings.renderGif

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Render a gif and provide frames to draw.
  @param data The gif data. Can be anything array-like such as a Buffer, Array or Uint8Array.
  @param callback The callback to provide each rendered frame to.
  @param options Options.
  @example
  ```
  const fs = require("fs");
  const logUpdate = require("log-update");
  const renderGif = require("render-gif");
  renderGif(fs.readFileSync("unicorn.gif"), logUpdate);
  ```
  */
  @scala.inline
  def apply(
    data: ArrayLike[Double],
    callback: js.Function1[/* data */ ArrayLike[Double], Unit],
    options: Options
  ): ReturnValue = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  
  @JSImport("render-gif", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /** The maximum framerate to render the gif at. */
    var maximumFrameRate: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaximumFrameRate(value: Double): Self = StObject.set(x, "maximumFrameRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumFrameRateUndefined: Self = StObject.set(x, "maximumFrameRate", js.undefined)
    }
  }
  
  trait ReturnValue extends StObject {
    
    /** Whether the animation should be rendered and provided to the callback. */
    var isPlaying: Boolean
  }
  object ReturnValue {
    
    @scala.inline
    def apply(isPlaying: Boolean): ReturnValue = {
      val __obj = js.Dynamic.literal(isPlaying = isPlaying.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
    }
  }
}
