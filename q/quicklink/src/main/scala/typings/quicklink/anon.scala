package typings.quicklink

import typings.quicklink.quicklinkBooleans.`true`
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<quicklink.quicklink.ListenOptions> */
  trait PartialListenOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var el: js.UndefOr[Element] = js.undefined
    
    var hrefFn: js.UndefOr[js.Function1[/* el */ Element, String]] = js.undefined
    
    var ignores: js.UndefOr[
        js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean]) | (js.Array[String | js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean])])
      ] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var origins: js.UndefOr[js.Array[String] | `true`] = js.undefined
    
    var prerender: js.UndefOr[Boolean] = js.undefined
    
    var priority: js.UndefOr[Boolean] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var timeoutFn: js.UndefOr[js.Function2[/* callback */ js.Function0[Unit], /* options */ Timeout, Double]] = js.undefined
  }
  object PartialListenOptions {
    
    inline def apply(): PartialListenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialListenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialListenOptions] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setHrefFn(value: /* el */ Element => String): Self = StObject.set(x, "hrefFn", js.Any.fromFunction1(value))
      
      inline def setHrefFnUndefined: Self = StObject.set(x, "hrefFn", js.undefined)
      
      inline def setIgnores(
        value: js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean]) | (js.Array[String | js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean])])
      ): Self = StObject.set(x, "ignores", value.asInstanceOf[js.Any])
      
      inline def setIgnoresFunction2(value: (/* url */ String, /* el */ Element) => Boolean): Self = StObject.set(x, "ignores", js.Any.fromFunction2(value))
      
      inline def setIgnoresUndefined: Self = StObject.set(x, "ignores", js.undefined)
      
      inline def setIgnoresVarargs(value: (String | js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean]))*): Self = StObject.set(x, "ignores", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOnError(value: /* error */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOrigins(value: js.Array[String] | `true`): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: String*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setPrerender(value: Boolean): Self = StObject.set(x, "prerender", value.asInstanceOf[js.Any])
      
      inline def setPrerenderUndefined: Self = StObject.set(x, "prerender", js.undefined)
      
      inline def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutFn(value: (/* callback */ js.Function0[Unit], /* options */ Timeout) => Double): Self = StObject.set(x, "timeoutFn", js.Any.fromFunction2(value))
      
      inline def setTimeoutFnUndefined: Self = StObject.set(x, "timeoutFn", js.undefined)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Timeout extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Timeout {
    
    inline def apply(): Timeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Timeout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
