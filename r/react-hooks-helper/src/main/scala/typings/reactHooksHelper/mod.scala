package typings.reactHooksHelper

import typings.react.mod.ChangeEvent
import typings.react.mod.SyntheticEvent
import typings.reactHooksHelper.anon.Checked
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-hooks-helper", "useForm")
  @js.native
  def useForm[T](defaultFormConfig: T): js.Tuple2[T, SetForm] = js.native
  
  @JSImport("react-hooks-helper", "useStep")
  @js.native
  def useStep(params: UseStepParams): UseStepResponse = js.native
  
  @js.native
  trait FormTarget extends StObject {
    
    var target: Checked = js.native
  }
  object FormTarget {
    
    @scala.inline
    def apply(target: Checked): FormTarget = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormTarget]
    }
    
    @scala.inline
    implicit class FormTargetMutableBuilder[Self <: FormTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: Checked): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavigationProps extends StObject {
    
    var go: js.UndefOr[js.Function1[/* step */ Double | String, Unit]] = js.native
    
    def next(): Unit = js.native
    
    var pause: js.UndefOr[js.Function0[Unit]] = js.native
    
    var play: js.UndefOr[js.Function0[Unit]] = js.native
    
    var previous: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object NavigationProps {
    
    @scala.inline
    def apply(next: () => Unit): NavigationProps = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[NavigationProps]
    }
    
    @scala.inline
    implicit class NavigationPropsMutableBuilder[Self <: NavigationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGo(value: /* step */ Double | String => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGoUndefined: Self = StObject.set(x, "go", js.undefined)
      
      @scala.inline
      def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      @scala.inline
      def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  type SetForm = js.Function1[
    /* event */ (SyntheticEvent[HTMLInputElement, Event]) | ChangeEvent[HTMLInputElement] | FormTarget, 
    Unit
  ]
  
  @js.native
  trait UseStepParams extends StObject {
    
    var autoAdvanceDuration: js.UndefOr[Double] = js.native
    
    var initialStep: js.UndefOr[Double] = js.native
    
    var steps: js.Array[String] | Double = js.native
  }
  object UseStepParams {
    
    @scala.inline
    def apply(steps: js.Array[String] | Double): UseStepParams = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseStepParams]
    }
    
    @scala.inline
    implicit class UseStepParamsMutableBuilder[Self <: UseStepParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoAdvanceDuration(value: Double): Self = StObject.set(x, "autoAdvanceDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdvanceDurationUndefined: Self = StObject.set(x, "autoAdvanceDuration", js.undefined)
      
      @scala.inline
      def setInitialStep(value: Double): Self = StObject.set(x, "initialStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStepUndefined: Self = StObject.set(x, "initialStep", js.undefined)
      
      @scala.inline
      def setSteps(value: js.Array[String] | Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: String*): Self = StObject.set(x, "steps", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UseStepResponse extends StObject {
    
    var autoAdvanceDuration: Double = js.native
    
    var index: Double = js.native
    
    var isPaused: Boolean = js.native
    
    var navigation: NavigationProps = js.native
    
    var step: Double = js.native
  }
  object UseStepResponse {
    
    @scala.inline
    def apply(
      autoAdvanceDuration: Double,
      index: Double,
      isPaused: Boolean,
      navigation: NavigationProps,
      step: Double
    ): UseStepResponse = {
      val __obj = js.Dynamic.literal(autoAdvanceDuration = autoAdvanceDuration.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseStepResponse]
    }
    
    @scala.inline
    implicit class UseStepResponseMutableBuilder[Self <: UseStepResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoAdvanceDuration(value: Double): Self = StObject.set(x, "autoAdvanceDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigation(value: NavigationProps): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
