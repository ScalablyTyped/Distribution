package typings.quicklink

import typings.quicklink.anon.PartialListenOptions
import typings.quicklink.anon.Timeout
import typings.quicklink.quicklinkBooleans.`true`
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quicklink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listen(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")().asInstanceOf[js.Function0[Unit]]
  inline def listen(options: PartialListenOptions): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def prefetch(urls: MaybeReadonlyArray[String]): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("prefetch")(urls.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def prefetch(urls: MaybeReadonlyArray[String], isPriority: Boolean): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("prefetch")(urls.asInstanceOf[js.Any], isPriority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def prerender(urls: MaybeReadonlyArray[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("prerender")(urls.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait ListenOptions extends StObject {
    
    /**
      * The _amount of time_ each link needs to stay inside the viewport before being prefetched, in milliseconds.
      *
      * Defaults to `0`.
      */
    var delay: Double
    
    /**
      * The DOM element to observe for in-viewport links to prefetch.
      *
      * Defaults to `document.body`.
      */
    var el: Element
    
    /**
      * An optional function to generate the URL to prefetch. It receives an
      * [Element](https://developer.mozilla.org/docs/Web/API/Element) as the argument.
      */
    def hrefFn(el: Element): String
    
    /**
      * Determine if a URL should be prefetched.
      *
      * When a `RegExp` tests positive, a `Function` returns `true`, or an `Array` contains the string, then the URL is _not_ prefetched.
      *
      * **Note:** An `Array` may contain `String`, `RegExp`, or `Function` values.
      *
      * **Important:** This logic is executed _after_ origin matching!
      *
      * Defaults to `[]`.
      */
    var ignores: js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean]) | (js.Array[String | js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean])])
    
    /**
      * The _total_ requests that can be prefetched while observing the `options.el` container.
      *
      * Defaults to `Infinity`.
      */
    var limit: Double
    
    /**
      * An optional error handler that will receive any errors from prefetched requests.
      *
      * By default, these errors are silently ignored.
      */
    def onError(error: Any): Unit
    
    /**
      * A static array of URL hostnames that are allowed to be prefetched.
      *
      * Defaults to the same domain origin, which prevents _any_ cross-origin requests.
      *
      * **Important:** An empty array (`[]`) allows ***all origins*** to be prefetched.
      */
    var origins: js.Array[String] | `true`
    
    /**
      * Whether to switch from the default prefetching mode to the prerendering mode for the links inside the viewport.
      *
      * **Note:** The prerendering mode (when this option is set to `true`) will fallback to the prefetching mode if the
      * browser does not support prerender.
      *
      * Defaults to `false`.
      */
    var prerender: Boolean
    
    /**
      * Whether or not the URLs within the `options.el` container should be treated as high priority.
      *
      * When `true`, quicklink will attempt to use the `fetch()` API if supported (rather than `link[rel=prefetch]`).
      *
      * Defaults to `false`.
      */
    var priority: Boolean
    
    /**
      * The _area percentage_ of each link that must have entered the viewport to be fetched, in its decimal form (e.g.
      * 0.25 = 25%).
      *
      * Defaults to `0`.
      */
    var threshold: Double
    
    /**
      * The _concurrency limit_ for simultaneous requests while observing the `options.el` container.
      *
      * Defaults to `Infinity`.
      */
    var throttle: Double
    
    /**
      * The `requestIdleCallback` timeout, in milliseconds.
      *
      * **Note:** The browser must be idle for the configured duration before prefetching.
      *
      * Defaults to `2000`.
      */
    var timeout: Double
    
    /**
      * A function used for specifying a `timeout` delay.
      *
      * This can be swapped out for a custom function like
      * [networkIdleCallback](https://github.com/pastelsky/network-idle-callback) (see demos).
      *
      * By default, this uses
      * [`requestIdleCallback`](https://developer.mozilla.org/docs/Web/API/Window/requestIdleCallback) or the
      * embedded polyfill.
      */
    def timeoutFn(callback: js.Function0[Unit], options: Timeout): Double
  }
  object ListenOptions {
    
    inline def apply(
      delay: Double,
      el: Element,
      hrefFn: Element => String,
      ignores: js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean]) | (js.Array[String | js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean])]),
      limit: Double,
      onError: Any => Unit,
      origins: js.Array[String] | `true`,
      prerender: Boolean,
      priority: Boolean,
      threshold: Double,
      throttle: Double,
      timeout: Double,
      timeoutFn: (js.Function0[Unit], Timeout) => Double
    ): ListenOptions = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], hrefFn = js.Any.fromFunction1(hrefFn), ignores = ignores.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), origins = origins.asInstanceOf[js.Any], prerender = prerender.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], timeoutFn = js.Any.fromFunction2(timeoutFn))
      __obj.asInstanceOf[ListenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListenOptions] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setHrefFn(value: Element => String): Self = StObject.set(x, "hrefFn", js.Any.fromFunction1(value))
      
      inline def setIgnores(
        value: js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean]) | (js.Array[String | js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean])])
      ): Self = StObject.set(x, "ignores", value.asInstanceOf[js.Any])
      
      inline def setIgnoresFunction2(value: (/* url */ String, /* el */ Element) => Boolean): Self = StObject.set(x, "ignores", js.Any.fromFunction2(value))
      
      inline def setIgnoresVarargs(value: (String | js.RegExp | (js.Function2[/* url */ String, /* el */ Element, Boolean]))*): Self = StObject.set(x, "ignores", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOrigins(value: js.Array[String] | `true`): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsVarargs(value: String*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setPrerender(value: Boolean): Self = StObject.set(x, "prerender", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutFn(value: (js.Function0[Unit], Timeout) => Double): Self = StObject.set(x, "timeoutFn", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * A type union of the passed type and an `ReadonlyArray` of that type.
    */
  type MaybeReadonlyArray[T] = T | js.Array[T]
}
