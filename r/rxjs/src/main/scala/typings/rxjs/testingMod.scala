package typings.rxjs

import typings.rxjs.subscriptionLogMod.SubscriptionLog
import typings.rxjs.testMessageMod.TestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("rxjs/dist/types/testing", "TestScheduler")
  @js.native
  open class TestScheduler protected ()
    extends typings.rxjs.testSchedulerMod.TestScheduler {
    /**
      *
      * @param assertDeepEqual A function to set up your assertion for your test harness
      */
    def this(assertDeepEqual: js.Function2[/* actual */ Any, /* expected */ Any, Boolean | Unit]) = this()
  }
  /* static members */
  object TestScheduler {
    
    @JSImport("rxjs/dist/types/testing", "TestScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of virtual time units each character in a marble diagram represents. If
      * the test scheduler is being used in "run mode", via the `run` method, this is temporarly
      * set to `1` for the duration of the `run` block, then set back to whatever value it was.
      * @nocollapse
      */
    @JSImport("rxjs/dist/types/testing", "TestScheduler.frameTimeFactor")
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
}
