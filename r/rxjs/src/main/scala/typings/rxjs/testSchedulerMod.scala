package typings.rxjs

import org.scalablytyped.runtime.StringDictionary
import typings.rxjs.anon.Fn0
import typings.rxjs.anon.FnCallMarblesValuesError
import typings.rxjs.anon.ToBe
import typings.rxjs.anon.ToBeSubscriptionLogsToBeFn
import typings.rxjs.coldObservableMod.ColdObservable
import typings.rxjs.hotObservableMod.HotObservable
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subscriptionLogMod.SubscriptionLog
import typings.rxjs.testMessageMod.TestMessage
import typings.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testSchedulerMod {
  
  @JSImport("rxjs/internal/testing/TestScheduler", "TestScheduler")
  @js.native
  class TestScheduler protected () extends VirtualTimeScheduler {
    def this(assertDeepEqual: js.Function2[/* actual */ js.Any, /* expected */ js.Any, Boolean | Unit]) = this()
    
    def assertDeepEqual(actual: js.Any, expected: js.Any): Boolean | Unit = js.native
    
    val coldObservables: js.Array[ColdObservable[js.Any]] = js.native
    
    /**
      * @param marbles A diagram in the marble DSL. Letters map to keys in `values` if provided.
      * @param values Values to use for the letters in `marbles`. If ommitted, the letters themselves are used.
      * @param error The error to use for the `#` marble (if present).
      */
    def createColdObservable[T](marbles: String): ColdObservable[T] = js.native
    def createColdObservable[T](marbles: String, values: StringDictionary[T]): ColdObservable[T] = js.native
    def createColdObservable[T](marbles: String, values: StringDictionary[T], error: js.Any): ColdObservable[T] = js.native
    def createColdObservable[T](marbles: String, values: Unit, error: js.Any): ColdObservable[T] = js.native
    
    /**
      * @param marbles A diagram in the marble DSL. Letters map to keys in `values` if provided.
      * @param values Values to use for the letters in `marbles`. If ommitted, the letters themselves are used.
      * @param error The error to use for the `#` marble (if present).
      */
    def createHotObservable[T](marbles: String): HotObservable[T] = js.native
    def createHotObservable[T](marbles: String, values: StringDictionary[T]): HotObservable[T] = js.native
    def createHotObservable[T](marbles: String, values: StringDictionary[T], error: js.Any): HotObservable[T] = js.native
    def createHotObservable[T](marbles: String, values: Unit, error: js.Any): HotObservable[T] = js.native
    
    def createTime(marbles: String): Double = js.native
    
    def expectObservable(observable: Observable[js.Any]): ToBe = js.native
    def expectObservable(observable: Observable[js.Any], subscriptionMarbles: String): ToBe = js.native
    
    def expectSubscriptions(actualSubscriptionLogs: js.Array[SubscriptionLog]): ToBeSubscriptionLogsToBeFn = js.native
    
    var flushTests: js.Any = js.native
    
    val hotObservables: js.Array[HotObservable[js.Any]] = js.native
    
    var materializeInnerObservable: js.Any = js.native
    
    def run[T](callback: js.Function1[/* helpers */ RunHelpers, T]): T = js.native
    
    var runMode: js.Any = js.native
  }
  /* static members */
  object TestScheduler {
    
    @JSImport("rxjs/internal/testing/TestScheduler", "TestScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @scala.inline
    def parseMarbles(marbles: String): js.Array[TestMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any]).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: js.Any): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.Any,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: js.Any, errorValue: Unit, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: Unit,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: Unit,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: Unit, errorValue: js.Any): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: Unit, errorValue: js.Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: js.Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: js.Any,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(marbles: String, values: Unit, errorValue: Unit, materializeInnerObservables: Boolean): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: Unit,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    @scala.inline
    def parseMarbles(
      marbles: String,
      values: Unit,
      errorValue: Unit,
      materializeInnerObservables: Unit,
      runMode: Boolean
    ): js.Array[TestMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarbles")(marbles.asInstanceOf[js.Any], values.asInstanceOf[js.Any], errorValue.asInstanceOf[js.Any], materializeInnerObservables.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TestMessage]]
    
    /** @nocollapse */
    @scala.inline
    def parseMarblesAsSubscriptions(marbles: String): SubscriptionLog = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMarblesAsSubscriptions")(marbles.asInstanceOf[js.Any]).asInstanceOf[SubscriptionLog]
    @scala.inline
    def parseMarblesAsSubscriptions(marbles: String, runMode: Boolean): SubscriptionLog = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMarblesAsSubscriptions")(marbles.asInstanceOf[js.Any], runMode.asInstanceOf[js.Any])).asInstanceOf[SubscriptionLog]
  }
  
  trait RunHelpers extends StObject {
    
    def cold[T](marbles: String): ColdObservable[T]
    def cold[T](marbles: String, values: StringDictionary[T]): ColdObservable[T]
    def cold[T](marbles: String, values: StringDictionary[T], error: js.Any): ColdObservable[T]
    def cold[T](marbles: String, values: Unit, error: js.Any): ColdObservable[T]
    @JSName("cold")
    var cold_Original: FnCallMarblesValuesError
    
    def expectObservable(observable: Observable[js.Any]): ToBe
    def expectObservable(observable: Observable[js.Any], subscriptionMarbles: String): ToBe
    @JSName("expectObservable")
    var expectObservable_Original: js.Function2[
        /* observable */ Observable[js.Any], 
        /* subscriptionMarbles */ js.UndefOr[String], 
        ToBe
      ]
    
    def expectSubscriptions(actualSubscriptionLogs: js.Array[SubscriptionLog]): ToBeSubscriptionLogsToBeFn
    @JSName("expectSubscriptions")
    var expectSubscriptions_Original: js.Function1[/* actualSubscriptionLogs */ js.Array[SubscriptionLog], ToBeSubscriptionLogsToBeFn]
    
    def flush(): Unit
    @JSName("flush")
    var flush_Original: js.Function0[Unit]
    
    def hot[T](marbles: String): HotObservable[T]
    def hot[T](marbles: String, values: StringDictionary[T]): HotObservable[T]
    def hot[T](marbles: String, values: StringDictionary[T], error: js.Any): HotObservable[T]
    def hot[T](marbles: String, values: Unit, error: js.Any): HotObservable[T]
    @JSName("hot")
    var hot_Original: Fn0
  }
  object RunHelpers {
    
    @scala.inline
    def apply(
      cold: FnCallMarblesValuesError,
      expectObservable: (/* observable */ Observable[js.Any], /* subscriptionMarbles */ js.UndefOr[String]) => ToBe,
      expectSubscriptions: /* actualSubscriptionLogs */ js.Array[SubscriptionLog] => ToBeSubscriptionLogsToBeFn,
      flush: () => Unit,
      hot: Fn0
    ): RunHelpers = {
      val __obj = js.Dynamic.literal(cold = cold.asInstanceOf[js.Any], expectObservable = js.Any.fromFunction2(expectObservable), expectSubscriptions = js.Any.fromFunction1(expectSubscriptions), flush = js.Any.fromFunction0(flush), hot = hot.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunHelpers]
    }
    
    @scala.inline
    implicit class RunHelpersMutableBuilder[Self <: RunHelpers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCold(value: FnCallMarblesValuesError): Self = StObject.set(x, "cold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectObservable(value: (/* observable */ Observable[js.Any], /* subscriptionMarbles */ js.UndefOr[String]) => ToBe): Self = StObject.set(x, "expectObservable", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExpectSubscriptions(value: /* actualSubscriptionLogs */ js.Array[SubscriptionLog] => ToBeSubscriptionLogsToBeFn): Self = StObject.set(x, "expectSubscriptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHot(value: Fn0): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    }
  }
  
  type observableToBeFn = js.Function3[
    /* marbles */ String, 
    /* values */ js.UndefOr[js.Any], 
    /* errorValue */ js.UndefOr[js.Any], 
    Unit
  ]
  
  type subscriptionLogsToBeFn = js.Function1[/* marbles */ String | js.Array[String], Unit]
}
