package typings.rxjs

import org.scalablytyped.runtime.StringDictionary
import typings.rxjs.anon.Fn0
import typings.rxjs.anon.FnCallMarblesValuesError
import typings.rxjs.anon.FnCallObservableSubscriptionMarbles
import typings.rxjs.anon.ToBe
import typings.rxjs.anon.ToBeSubscriptionLogsToBeFn
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler
import typings.rxjs.distTypesInternalTestingColdObservableMod.ColdObservable
import typings.rxjs.distTypesInternalTestingHotObservableMod.HotObservable
import typings.rxjs.distTypesInternalTestingSubscriptionLogMod.SubscriptionLog
import typings.rxjs.distTypesInternalTestingTestMessageMod.TestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalTestingTestSchedulerMod {
  
  @JSImport("rxjs/dist/types/internal/testing/TestScheduler", "TestScheduler")
  @js.native
  open class TestScheduler protected () extends VirtualTimeScheduler {
    /**
      *
      * @param assertDeepEqual A function to set up your assertion for your test harness
      */
    def this(assertDeepEqual: js.Function2[/* actual */ Any, /* expected */ Any, Boolean | Unit]) = this()
    
    def assertDeepEqual(actual: Any, expected: Any): Boolean | Unit = js.native
    
    /**
      * @deprecated Internal implementation detail, do not use directly. Will be made internal in v8.
      */
    val coldObservables: js.Array[ColdObservable[Any]] = js.native
    
    /* private */ var createAnimator: Any = js.native
    
    /**
      * @param marbles A diagram in the marble DSL. Letters map to keys in `values` if provided.
      * @param values Values to use for the letters in `marbles`. If omitted, the letters themselves are used.
      * @param error The error to use for the `#` marble (if present).
      */
    def createColdObservable[T](marbles: String): ColdObservable[T] = js.native
    def createColdObservable[T](marbles: String, values: StringDictionary[T]): ColdObservable[T] = js.native
    def createColdObservable[T](marbles: String, values: StringDictionary[T], error: Any): ColdObservable[T] = js.native
    def createColdObservable[T](marbles: String, values: Unit, error: Any): ColdObservable[T] = js.native
    
    /* private */ var createDelegates: Any = js.native
    
    /**
      * @param marbles A diagram in the marble DSL. Letters map to keys in `values` if provided.
      * @param values Values to use for the letters in `marbles`. If omitted, the letters themselves are used.
      * @param error The error to use for the `#` marble (if present).
      */
    def createHotObservable[T](marbles: String): HotObservable[T] = js.native
    def createHotObservable[T](marbles: String, values: StringDictionary[T]): HotObservable[T] = js.native
    def createHotObservable[T](marbles: String, values: StringDictionary[T], error: Any): HotObservable[T] = js.native
    def createHotObservable[T](marbles: String, values: Unit, error: Any): HotObservable[T] = js.native
    
    def createTime(marbles: String): Double = js.native
    
    def expectObservable[T](observable: Observable[T]): ToBe[T] = js.native
    def expectObservable[T](observable: Observable[T], subscriptionMarbles: String): ToBe[T] = js.native
    
    def expectSubscriptions(actualSubscriptionLogs: js.Array[SubscriptionLog]): ToBeSubscriptionLogsToBeFn = js.native
    
    /**
      * Test meta data to be processed during `flush()`
      */
    /* private */ var flushTests: Any = js.native
    
    /**
      * @deprecated Internal implementation detail, do not use directly. Will be made internal in v8.
      */
    val hotObservables: js.Array[HotObservable[Any]] = js.native
    
    /* private */ var materializeInnerObservable: Any = js.native
    
    /**
      * The `run` method performs the test in 'run mode' - in which schedulers
      * used within the test automatically delegate to the `TestScheduler`. That
      * is, in 'run mode' there is no need to explicitly pass a `TestScheduler`
      * instance to observable creators or operators.
      *
      * @see {@link /guide/testing/marble-testing}
      */
    def run[T](callback: js.Function1[/* helpers */ RunHelpers, T]): T = js.native
    
    /**
      * Indicates whether the TestScheduler instance is operating in "run mode",
      * meaning it's processing a call to `run()`
      */
    /* private */ var runMode: Any = js.native
  }
  /* static members */
  object TestScheduler {
    
    @JSImport("rxjs/dist/types/internal/testing/TestScheduler", "TestScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of virtual time units each character in a marble diagram represents. If
      * the test scheduler is being used in "run mode", via the `run` method, this is temporarily
      * set to `1` for the duration of the `run` block, then set back to whatever value it was.
      * @nocollapse
      */
    @JSImport("rxjs/dist/types/internal/testing/TestScheduler", "TestScheduler.frameTimeFactor")
    @js.native
    def frameTimeFactor: Double = js.native
    inline def frameTimeFactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameTimeFactor")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def parseMarbles(marbles: String): js.Array[TestMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any]).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(marbles: String, values: Any): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(marbles: String, values: Any, errorValue: Any): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(marbles: String, values: Any, errorValue: Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(
      marbles: String,
      values: Any,
      errorValue: Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(marbles: String, values: Any, errorValue: Any, materializeInnerObservables: Unit, runMode: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(marbles: String, values: Any, errorValue: Unit, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(
      marbles: String,
      values: Any,
      errorValue: Unit,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(
      marbles: String,
      values: Any,
      errorValue: Unit,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(marbles: String, values: Unit, errorValue: Any): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(marbles: String, values: Unit, errorValue: Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: Any,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(marbles: String, values: Unit, errorValue: Unit, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: Unit,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    inline def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: Unit,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    
    /** @nocollapse */
    inline def parseMarblesAsSubscriptions(): SubscriptionLog = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMarblesAsSubscriptions")().asInstanceOf[SubscriptionLog]
    inline def parseMarblesAsSubscriptions(marbles: String): SubscriptionLog = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMarblesAsSubscriptions")(marbles.asInstanceOf[js.Any]).asInstanceOf[SubscriptionLog]
    inline def parseMarblesAsSubscriptions(marbles: String, runMode: Boolean): SubscriptionLog = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarblesAsSubscriptions")(marbles.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[SubscriptionLog]
    inline def parseMarblesAsSubscriptions(marbles: Null, runMode: Boolean): SubscriptionLog = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarblesAsSubscriptions")(marbles.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[SubscriptionLog]
  }
  
  trait RunHelpers extends StObject {
    
    def animate(marbles: String): Unit
    
    def cold[T](marbles: String): ColdObservable[T]
    def cold[T](marbles: String, values: StringDictionary[T]): ColdObservable[T]
    def cold[T](marbles: String, values: StringDictionary[T], error: Any): ColdObservable[T]
    def cold[T](marbles: String, values: Unit, error: Any): ColdObservable[T]
    @JSName("cold")
    var cold_Original: FnCallMarblesValuesError
    
    def expectObservable[T](observable: Observable[T]): ToBe[T]
    def expectObservable[T](observable: Observable[T], subscriptionMarbles: String): ToBe[T]
    @JSName("expectObservable")
    var expectObservable_Original: FnCallObservableSubscriptionMarbles
    
    def expectSubscriptions(actualSubscriptionLogs: js.Array[SubscriptionLog]): ToBeSubscriptionLogsToBeFn
    @JSName("expectSubscriptions")
    var expectSubscriptions_Original: js.Function1[/* actualSubscriptionLogs */ js.Array[SubscriptionLog], ToBeSubscriptionLogsToBeFn]
    
    def flush(): Unit
    @JSName("flush")
    var flush_Original: js.Function0[Unit]
    
    def hot[T](marbles: String): HotObservable[T]
    def hot[T](marbles: String, values: StringDictionary[T]): HotObservable[T]
    def hot[T](marbles: String, values: StringDictionary[T], error: Any): HotObservable[T]
    def hot[T](marbles: String, values: Unit, error: Any): HotObservable[T]
    @JSName("hot")
    var hot_Original: Fn0
    
    def time(marbles: String): Double
    @JSName("time")
    var time_Original: js.Function1[/* marbles */ String, Double]
  }
  object RunHelpers {
    
    inline def apply(
      animate: String => Unit,
      cold: FnCallMarblesValuesError,
      expectObservable: FnCallObservableSubscriptionMarbles,
      expectSubscriptions: /* actualSubscriptionLogs */ js.Array[SubscriptionLog] => ToBeSubscriptionLogsToBeFn,
      flush: () => Unit,
      hot: Fn0,
      time: /* marbles */ String => Double
    ): RunHelpers = {
      val __obj = js.Dynamic.literal(animate = js.Any.fromFunction1(animate), cold = cold.asInstanceOf[js.Any], expectObservable = expectObservable.asInstanceOf[js.Any], expectSubscriptions = js.Any.fromFunction1(expectSubscriptions), flush = js.Any.fromFunction0(flush), hot = hot.asInstanceOf[js.Any], time = js.Any.fromFunction1(time))
      __obj.asInstanceOf[RunHelpers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunHelpers] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: String => Unit): Self = StObject.set(x, "animate", js.Any.fromFunction1(value))
      
      inline def setCold(value: FnCallMarblesValuesError): Self = StObject.set(x, "cold", value.asInstanceOf[js.Any])
      
      inline def setExpectObservable(value: FnCallObservableSubscriptionMarbles): Self = StObject.set(x, "expectObservable", value.asInstanceOf[js.Any])
      
      inline def setExpectSubscriptions(value: /* actualSubscriptionLogs */ js.Array[SubscriptionLog] => ToBeSubscriptionLogsToBeFn): Self = StObject.set(x, "expectSubscriptions", js.Any.fromFunction1(value))
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setHot(value: Fn0): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setTime(value: /* marbles */ String => Double): Self = StObject.set(x, "time", js.Any.fromFunction1(value))
    }
  }
  
  type observableToBeFn = js.Function3[
    /* marbles */ String, 
    /* values */ js.UndefOr[Any], 
    /* errorValue */ js.UndefOr[Any], 
    Unit
  ]
  
  type subscriptionLogsToBeFn = js.Function1[/* marbles */ String | js.Array[String], Unit]
}
