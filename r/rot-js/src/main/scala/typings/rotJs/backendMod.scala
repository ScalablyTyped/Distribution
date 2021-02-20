package typings.rotJs

import typings.rotJs.typesMod.DisplayData
import typings.rotJs.typesMod.DisplayOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backendMod {
  
  @JSImport("rot-js/lib/display/backend", JSImport.Default)
  @js.native
  abstract class default () extends Backend
  
  @js.native
  trait Backend extends StObject {
    
    var _options: DisplayOptions = js.native
    
    def clear(): Unit = js.native
    
    def computeFontSize(availWidth: Double, availHeight: Double): Double = js.native
    
    def computeSize(availWidth: Double, availHeight: Double): js.Tuple2[Double, Double] = js.native
    
    def draw(data: DisplayData, clearBefore: Boolean): Unit = js.native
    
    def eventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
    
    def getContainer(): HTMLElement | Null = js.native
    
    def schedule(cb: js.Function0[Unit]): Unit = js.native
    
    def setOptions(options: DisplayOptions): Unit = js.native
  }
  object Backend {
    
    @scala.inline
    def apply(
      _options: DisplayOptions,
      clear: () => Unit,
      computeFontSize: (Double, Double) => Double,
      computeSize: (Double, Double) => js.Tuple2[Double, Double],
      draw: (DisplayData, Boolean) => Unit,
      eventToPosition: (Double, Double) => js.Tuple2[Double, Double],
      getContainer: () => HTMLElement | Null,
      schedule: js.Function0[Unit] => Unit,
      setOptions: DisplayOptions => Unit
    ): Backend = {
      val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), computeFontSize = js.Any.fromFunction2(computeFontSize), computeSize = js.Any.fromFunction2(computeSize), draw = js.Any.fromFunction2(draw), eventToPosition = js.Any.fromFunction2(eventToPosition), getContainer = js.Any.fromFunction0(getContainer), schedule = js.Any.fromFunction1(schedule), setOptions = js.Any.fromFunction1(setOptions))
      __obj.asInstanceOf[Backend]
    }
    
    @scala.inline
    implicit class BackendMutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComputeFontSize(value: (Double, Double) => Double): Self = StObject.set(x, "computeFontSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComputeSize(value: (Double, Double) => js.Tuple2[Double, Double]): Self = StObject.set(x, "computeSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDraw(value: (DisplayData, Boolean) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEventToPosition(value: (Double, Double) => js.Tuple2[Double, Double]): Self = StObject.set(x, "eventToPosition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement | Null): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSchedule(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetOptions(value: DisplayOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_options(value: DisplayOptions): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
}
