package typings.reactCountup

import typings.countupJs.mod.CountUp
import typings.countupJs.mod.CountUpOptions
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMod {
  
  trait CallbackProps extends StObject {
    
    var onEnd: js.UndefOr[OnEndCallback] = js.undefined
    
    var onPauseResume: js.UndefOr[OnPauseResumeCallback] = js.undefined
    
    var onReset: js.UndefOr[OnResetCallback] = js.undefined
    
    var onStart: js.UndefOr[OnStartCallback] = js.undefined
    
    var onUpdate: js.UndefOr[OnUpdateCallback] = js.undefined
  }
  object CallbackProps {
    
    inline def apply(): CallbackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallbackProps] (val x: Self) extends AnyVal {
      
      inline def setOnEnd(value: /* args */ OnEndArgs => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnPauseResume(value: /* args */ OnPauseResumeArgs => Unit): Self = StObject.set(x, "onPauseResume", js.Any.fromFunction1(value))
      
      inline def setOnPauseResumeUndefined: Self = StObject.set(x, "onPauseResume", js.undefined)
      
      inline def setOnReset(value: /* args */ OnResetArgs => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnStart(value: /* args */ OnStartArgs => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnUpdate(value: /* args */ OnUpdateArgs => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  trait CommonProps
    extends StObject
       with CountUpInstanceProps {
    
    var delay: js.UndefOr[Double | Null] = js.undefined
  }
  object CommonProps {
    
    inline def apply(end: Double): CommonProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayNull: Self = StObject.set(x, "delay", null)
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  trait CountUpApi extends StObject {
    
    var getCountUp: GetCountUpFn
    
    var pauseResume: VoidFn
    
    var reset: VoidFn
    
    var start: VoidFn
    
    var update: UpdateFn
  }
  object CountUpApi {
    
    inline def apply(
      getCountUp: /* recreate */ js.UndefOr[Boolean] => CountUp,
      pauseResume: () => Unit,
      reset: () => Unit,
      start: () => Unit,
      update: /* newEnd */ String | Double => Unit
    ): CountUpApi = {
      val __obj = js.Dynamic.literal(getCountUp = js.Any.fromFunction1(getCountUp), pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[CountUpApi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CountUpApi] (val x: Self) extends AnyVal {
      
      inline def setGetCountUp(value: /* recreate */ js.UndefOr[Boolean] => CountUp): Self = StObject.set(x, "getCountUp", js.Any.fromFunction1(value))
      
      inline def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: /* newEnd */ String | Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait CountUpInstanceProps
    extends StObject
       with CountUpOptions {
    
    var decimals: js.UndefOr[Double] = js.undefined
    
    var end: Double
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object CountUpInstanceProps {
    
    inline def apply(end: Double): CountUpInstanceProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountUpInstanceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CountUpInstanceProps] (val x: Self) extends AnyVal {
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  type GetCountUpFn = js.Function1[/* recreate */ js.UndefOr[Boolean], CountUp]
  
  trait OnEndArgs extends StObject {
    
    var pauseResume: VoidFn
    
    var reset: VoidFn
    
    var start: VoidFn
    
    var update: UpdateFn
  }
  object OnEndArgs {
    
    inline def apply(
      pauseResume: () => Unit,
      reset: () => Unit,
      start: () => Unit,
      update: /* newEnd */ String | Double => Unit
    ): OnEndArgs = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[OnEndArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnEndArgs] (val x: Self) extends AnyVal {
      
      inline def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: /* newEnd */ String | Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  type OnEndCallback = js.Function1[/* args */ OnEndArgs, Unit]
  
  trait OnPauseResumeArgs extends StObject {
    
    var reset: VoidFn
    
    var start: VoidFn
    
    var update: UpdateFn
  }
  object OnPauseResumeArgs {
    
    inline def apply(reset: () => Unit, start: () => Unit, update: /* newEnd */ String | Double => Unit): OnPauseResumeArgs = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[OnPauseResumeArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnPauseResumeArgs] (val x: Self) extends AnyVal {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: /* newEnd */ String | Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  type OnPauseResumeCallback = js.Function1[/* args */ OnPauseResumeArgs, Unit]
  
  trait OnResetArgs extends StObject {
    
    var pauseResume: VoidFn
    
    var start: VoidFn
    
    var update: UpdateFn
  }
  object OnResetArgs {
    
    inline def apply(pauseResume: () => Unit, start: () => Unit, update: /* newEnd */ String | Double => Unit): OnResetArgs = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), start = js.Any.fromFunction0(start), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[OnResetArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnResetArgs] (val x: Self) extends AnyVal {
      
      inline def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: /* newEnd */ String | Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  type OnResetCallback = js.Function1[/* args */ OnResetArgs, Unit]
  
  trait OnStartArgs extends StObject {
    
    var pauseResume: VoidFn
    
    var reset: VoidFn
    
    var update: UpdateFn
  }
  object OnStartArgs {
    
    inline def apply(pauseResume: () => Unit, reset: () => Unit, update: /* newEnd */ String | Double => Unit): OnStartArgs = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[OnStartArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnStartArgs] (val x: Self) extends AnyVal {
      
      inline def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: /* newEnd */ String | Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  type OnStartCallback = js.Function1[/* args */ OnStartArgs, Unit]
  
  trait OnUpdateArgs extends StObject {
    
    var pauseResume: VoidFn
    
    var reset: VoidFn
    
    var start: VoidFn
  }
  object OnUpdateArgs {
    
    inline def apply(pauseResume: () => Unit, reset: () => Unit, start: () => Unit): OnUpdateArgs = {
      val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[OnUpdateArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnUpdateArgs] (val x: Self) extends AnyVal {
      
      inline def setPauseResume(value: () => Unit): Self = StObject.set(x, "pauseResume", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  type OnUpdateCallback = js.Function1[/* args */ OnUpdateArgs, Unit]
  
  trait RenderCounterProps
    extends StObject
       with CountUpApi {
    
    var countUpRef: RefObject[HTMLElement]
  }
  object RenderCounterProps {
    
    inline def apply(
      countUpRef: RefObject[HTMLElement],
      getCountUp: /* recreate */ js.UndefOr[Boolean] => CountUp,
      pauseResume: () => Unit,
      reset: () => Unit,
      start: () => Unit,
      update: /* newEnd */ String | Double => Unit
    ): RenderCounterProps = {
      val __obj = js.Dynamic.literal(countUpRef = countUpRef.asInstanceOf[js.Any], getCountUp = js.Any.fromFunction1(getCountUp), pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[RenderCounterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderCounterProps] (val x: Self) extends AnyVal {
      
      inline def setCountUpRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "countUpRef", value.asInstanceOf[js.Any])
    }
  }
  
  type UpdateFn = js.Function1[/* newEnd */ String | Double, Unit]
  
  type VoidFn = js.Function0[Unit]
}
