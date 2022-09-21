package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayProfilerMod {
  
  object RelayProfiler {
    
    @JSImport("relay-runtime/lib/util/RelayProfiler", "RelayProfiler")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def attachAggregateHandler(name: String, handler: Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachAggregateHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Attaches a handler to profiles with the supplied name. You can also
      * attach to the special name '*' which is a catch all.
      */
    inline def attachProfileHandler(name: String, handler: ProfileHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachProfileHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Detaches a handler attached via `attachAggregateHandler`.
      */
    inline def detachAggregateHandler(name: String, handler: Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachAggregateHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Detaches a handler attached via `attachProfileHandler`.
      */
    inline def detachProfileHandler(name: String, handler: ProfileHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachProfileHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def instrument[T /* <: js.Function0[Unit] */](name: String, originalFunction: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(name.asInstanceOf[js.Any], originalFunction.asInstanceOf[js.Any])).asInstanceOf[T]
    
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
    inline def instrumentMethods(`object`: js.Function0[Unit | js.Object], names: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instrumentMethods")(`object`.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def profile(name: String): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(name.asInstanceOf[js.Any]).asInstanceOf[Stop]
    inline def profile(name: String, state: Any): Stop = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(name.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Stop]
  }
  
  type Handler = js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]
  
  type ProfileHandler = js.Function2[
    /* name */ String, 
    /* state */ js.UndefOr[Any], 
    js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ]
}
