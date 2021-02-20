package typings.rxjs

import typings.rxjs.subscriptionLogMod.SubscriptionLog
import typings.rxjs.testMessageMod.TestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("rxjs/testing", "TestScheduler")
  @js.native
  class TestScheduler protected ()
    extends typings.rxjs.testSchedulerMod.TestScheduler {
    def this(assertDeepEqual: js.Function2[/* actual */ js.Any, /* expected */ js.Any, Boolean | Unit]) = this()
  }
  /* static members */
  object TestScheduler {
    
    /** @nocollapse */
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(marbles: String): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(marbles: String, values: js.UndefOr[scala.Nothing], errorValue: js.Any): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.Any,
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.Any,
      materializeInnerObservables: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.UndefOr[scala.Nothing],
      errorValue: js.Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(marbles: String, values: js.Any): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.UndefOr[scala.Nothing],
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.Any,
      materializeInnerObservables: js.UndefOr[scala.Nothing],
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarbles")
    @js.native
    def parseMarbles(
      marbles: String,
      values: js.Any,
      errorValue: js.Any,
      materializeInnerObservables: Boolean,
      runMode: Boolean
    ): js.Array[TestMessage] = js.native
    
    /** @nocollapse */
    @JSImport("rxjs/testing", "TestScheduler.parseMarblesAsSubscriptions")
    @js.native
    def parseMarblesAsSubscriptions(marbles: String): SubscriptionLog = js.native
    @JSImport("rxjs/testing", "TestScheduler.parseMarblesAsSubscriptions")
    @js.native
    def parseMarblesAsSubscriptions(marbles: String, runMode: Boolean): SubscriptionLog = js.native
  }
}
