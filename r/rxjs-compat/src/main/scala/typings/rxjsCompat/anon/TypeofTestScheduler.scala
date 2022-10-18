package typings.rxjsCompat.anon

import org.scalablytyped.runtime.Instantiable1
import typings.rxjs.distTypesInternalTestingSubscriptionLogMod.SubscriptionLog
import typings.rxjs.distTypesInternalTestingTestMessageMod.TestMessage
import typings.rxjs.testingMod.TestScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTestScheduler
  extends StObject
     with Instantiable1[
      /* assertDeepEqual */ js.Function2[/* actual */ Any, /* expected */ Any, Boolean | Unit], 
      TestScheduler
    ] {
  
  /**
    * The number of virtual time units each character in a marble diagram represents. If
    * the test scheduler is being used in "run mode", via the `run` method, this is temporarily
    * set to `1` for the duration of the `run` block, then set back to whatever value it was.
    * @nocollapse
    */
  var frameTimeFactor: Double = js.native
  
  /** @nocollapse */
  def parseMarbles(marbles: String): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: Any): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: Any, errorValue: Any): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: Any, errorValue: Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = js.native
  def parseMarbles(
    marbles: String,
    values: Any,
    errorValue: Any,
    materializeInnerObservables: Boolean,
    runMode: Boolean
  ): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: Any, errorValue: Any, materializeInnerObservables: Unit, runMode: Boolean): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: Any, errorValue: Unit, materializeInnerObservables: Boolean): js.Array[TestMessage] = js.native
  def parseMarbles(
    marbles: String,
    values: Any,
    errorValue: Unit,
    materializeInnerObservables: Boolean,
    runMode: Boolean
  ): js.Array[TestMessage] = js.native
  def parseMarbles(
    marbles: String,
    values: Any,
    errorValue: Unit,
    materializeInnerObservables: Unit,
    runMode: Boolean
  ): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: Unit, errorValue: Any): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: Unit, errorValue: Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = js.native
  def parseMarbles(
    marbles: String,
    values: Unit,
    errorValue: Any,
    materializeInnerObservables: Boolean,
    runMode: Boolean
  ): js.Array[TestMessage] = js.native
  def parseMarbles(
    marbles: String,
    values: Unit,
    errorValue: Any,
    materializeInnerObservables: Unit,
    runMode: Boolean
  ): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: Unit, errorValue: Unit, materializeInnerObservables: Boolean): js.Array[TestMessage] = js.native
  def parseMarbles(
    marbles: String,
    values: Unit,
    errorValue: Unit,
    materializeInnerObservables: Boolean,
    runMode: Boolean
  ): js.Array[TestMessage] = js.native
  def parseMarbles(
    marbles: String,
    values: Unit,
    errorValue: Unit,
    materializeInnerObservables: Unit,
    runMode: Boolean
  ): js.Array[TestMessage] = js.native
  
  /** @nocollapse */
  def parseMarblesAsSubscriptions(): SubscriptionLog = js.native
  def parseMarblesAsSubscriptions(marbles: String): SubscriptionLog = js.native
  def parseMarblesAsSubscriptions(marbles: String, runMode: Boolean): SubscriptionLog = js.native
  def parseMarblesAsSubscriptions(marbles: Null, runMode: Boolean): SubscriptionLog = js.native
}
