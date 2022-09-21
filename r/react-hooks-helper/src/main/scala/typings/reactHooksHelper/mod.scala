package typings.reactHooksHelper

import typings.react.mod.ChangeEvent
import typings.react.mod.SyntheticEvent
import typings.reactHooksHelper.anon.Checked
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-hooks-helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useForm[T](defaultFormConfig: T): js.Tuple2[T, SetForm] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")(defaultFormConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, SetForm]]
  
  inline def useStep(params: UseStepParams): UseStepResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("useStep")(params.asInstanceOf[js.Any]).asInstanceOf[UseStepResponse]
  
  trait FormTarget extends StObject {
    
    var target: Checked
  }
  object FormTarget {
    
    inline def apply(target: Checked): FormTarget = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormTarget]
    }
    
    extension [Self <: FormTarget](x: Self) {
      
      inline def setTarget(value: Checked): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationProps extends StObject {
    
    var go: js.UndefOr[js.Function1[/* step */ Double | String, Unit]] = js.undefined
    
    def next(): Unit
    
    var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var play: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var previous: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object NavigationProps {
    
    inline def apply(next: () => Unit): NavigationProps = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[NavigationProps]
    }
    
    extension [Self <: NavigationProps](x: Self) {
      
      inline def setGo(value: /* step */ Double | String => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
      
      inline def setGoUndefined: Self = StObject.set(x, "go", js.undefined)
      
      inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  type SetForm = js.Function1[
    /* event */ (SyntheticEvent[HTMLInputElement, Event]) | ChangeEvent[HTMLInputElement] | FormTarget, 
    Unit
  ]
  
  trait Step extends StObject {
    
    var id: String
  }
  object Step {
    
    inline def apply(id: String): Step = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Step]
    }
    
    extension [Self <: Step](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseStepParams extends StObject {
    
    var autoAdvanceDuration: js.UndefOr[Double] = js.undefined
    
    var initialStep: js.UndefOr[Double] = js.undefined
    
    var steps: js.Array[Step] | Double
  }
  object UseStepParams {
    
    inline def apply(steps: js.Array[Step] | Double): UseStepParams = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseStepParams]
    }
    
    extension [Self <: UseStepParams](x: Self) {
      
      inline def setAutoAdvanceDuration(value: Double): Self = StObject.set(x, "autoAdvanceDuration", value.asInstanceOf[js.Any])
      
      inline def setAutoAdvanceDurationUndefined: Self = StObject.set(x, "autoAdvanceDuration", js.undefined)
      
      inline def setInitialStep(value: Double): Self = StObject.set(x, "initialStep", value.asInstanceOf[js.Any])
      
      inline def setInitialStepUndefined: Self = StObject.set(x, "initialStep", js.undefined)
      
      inline def setSteps(value: js.Array[Step] | Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
  
  trait UseStepResponse extends StObject {
    
    var autoAdvanceDuration: Double
    
    var index: Double
    
    var isPaused: Boolean
    
    var navigation: NavigationProps
    
    var step: Step | Double
  }
  object UseStepResponse {
    
    inline def apply(
      autoAdvanceDuration: Double,
      index: Double,
      isPaused: Boolean,
      navigation: NavigationProps,
      step: Step | Double
    ): UseStepResponse = {
      val __obj = js.Dynamic.literal(autoAdvanceDuration = autoAdvanceDuration.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseStepResponse]
    }
    
    extension [Self <: UseStepResponse](x: Self) {
      
      inline def setAutoAdvanceDuration(value: Double): Self = StObject.set(x, "autoAdvanceDuration", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: NavigationProps): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Step | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
