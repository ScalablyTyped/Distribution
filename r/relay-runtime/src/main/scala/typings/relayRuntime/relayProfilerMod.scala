package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.Stop
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/util/RelayProfiler", JSImport.Namespace)
@js.native
object relayProfilerMod extends js.Object {
  
  @js.native
  object RelayProfiler extends js.Object {
    
    /**
      * Attaches a handler to all methods instrumented with the supplied name.
      *
      *   function createRenderer() {
      *     return RelayProfiler.instrument('render', function() {...});
      *   }
      *   const renderA = createRenderer();
      *   const renderB = createRenderer();
      *
      *   // Only profiles `renderA`.
      *   renderA.attachHandler(...);
      *
      *   // Profiles both `renderA` and `renderB`.
      *   RelayProfiler.attachAggregateHandler('render', ...);
      *
      */
    def attachAggregateHandler(name: String, handler: Handler): Unit = js.native
    
    /**
      * Attaches a handler to profiles with the supplied name. You can also
      * attach to the special name '*' which is a catch all.
      */
    def attachProfileHandler(name: String, handler: ProfileHandler): Unit = js.native
    
    /**
      * Detaches a handler attached via `attachAggregateHandler`.
      */
    def detachAggregateHandler(name: String, handler: Handler): Unit = js.native
    
    /**
      * Detaches a handler attached via `attachProfileHandler`.
      */
    def detachProfileHandler(name: String, handler: ProfileHandler): Unit = js.native
    
    /**
      * Wraps the supplied function with one that provides the `attachHandler` and
      * `detachHandler` methods. Example usage:
      *
      *   const printRelayQuery =
      *     RelayProfiler.instrument('printRelayQuery', printRelayQuery);
      *
      *   printRelayQuery.attachHandler(...);
      *
      * NOTE: The instrumentation assumes that no handlers are attached or detached
      * in the course of executing another handler.
      */
    def instrument[T /* <: js.Function0[Unit] */](name: String, originalFunction: T): T = js.native
    
    /**
      * Instruments methods on a class or object. This re-assigns the method in
      * order to preserve function names in stack traces (which are detected by
      * modern debuggers via heuristics). Example usage:
      *
      *   const RelayStore = { primeCache: function() {...} };
      *   RelayProfiler.instrumentMethods(RelayStore, {
      *     primeCache: 'RelayStore.primeCache'
      *   });
      *
      *   RelayStore.primeCache.attachHandler(...);
      *
      * As a result, the methods will be replaced by wrappers that provide the
      * `attachHandler` and `detachHandler` methods.
      */
    def instrumentMethods(`object`: js.Function0[Unit | js.Object], names: StringDictionary[String]): Unit = js.native
    
    /**
      * Instruments profiling for arbitrarily asynchronous code by a name.
      *
      *   const timerProfiler = RelayProfiler.profile('timeout');
      *   setTimeout(function() {
      *     timerProfiler.stop();
      *   }, 1000);
      *
      *   RelayProfiler.attachProfileHandler('timeout', ...);
      *
      * Arbitrary state can also be passed into `profile` as a second argument. The
      * attached profile handlers will receive this as the second argument.
      */
    def profile(name: String): Stop = js.native
    def profile(name: String, state: js.Any): Stop = js.native
  }
  
  type Handler = js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]
  
  type ProfileHandler = js.Function2[
    /* name */ String, 
    /* state */ js.UndefOr[js.Any], 
    js.Function1[/* error */ js.UndefOr[Error], Unit]
  ]
}
