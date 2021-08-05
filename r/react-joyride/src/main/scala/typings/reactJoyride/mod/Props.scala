package typings.reactJoyride.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props
  extends StObject
     with CommonProps {
  
  var callback: js.UndefOr[js.Function1[/* data */ CallBackProps, Unit]] = js.undefined
  
  var continuous: js.UndefOr[Boolean] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var getHelpers: js.UndefOr[js.Function1[/* helpers */ StoreHelpers, js.Any]] = js.undefined
  
  var run: js.UndefOr[Boolean] = js.undefined
  
  var scrollOffset: js.UndefOr[Double] = js.undefined
  
  var scrollToFirstStep: js.UndefOr[Boolean] = js.undefined
  
  var stepIndex: js.UndefOr[Double] = js.undefined
  
  var steps: js.Array[Step]
}
object Props {
  
  inline def apply(steps: js.Array[Step]): Props = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  extension [Self <: Props](x: Self) {
    
    inline def setCallback(value: /* data */ CallBackProps => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setGetHelpers(value: /* helpers */ StoreHelpers => js.Any): Self = StObject.set(x, "getHelpers", js.Any.fromFunction1(value))
    
    inline def setGetHelpersUndefined: Self = StObject.set(x, "getHelpers", js.undefined)
    
    inline def setRun(value: Boolean): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    
    inline def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
    
    inline def setScrollToFirstStep(value: Boolean): Self = StObject.set(x, "scrollToFirstStep", value.asInstanceOf[js.Any])
    
    inline def setScrollToFirstStepUndefined: Self = StObject.set(x, "scrollToFirstStep", js.undefined)
    
    inline def setStepIndex(value: Double): Self = StObject.set(x, "stepIndex", value.asInstanceOf[js.Any])
    
    inline def setStepIndexUndefined: Self = StObject.set(x, "stepIndex", js.undefined)
    
    inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
