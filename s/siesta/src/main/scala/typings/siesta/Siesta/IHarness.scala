package typings.siesta.Siesta

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @abstract
  */
trait IHarness extends js.Object {
  var alsoPreload: js.Array[_]
  var autoCheckGlobals: Boolean
  var cachePreload: Boolean
  var defaultTimeout: Boolean
  var disableColoring: Boolean
  var expectedGlobals: js.Array[String]
  var isReadyTimeout: Double
  var keepNLastResults: Double
  var keepResults: Boolean
  var listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ js.Any, Unit]]
  var maxThreads: Double
  var needDone: Boolean
  var overrideSetTimeout: Boolean
  var pauseBetweenTests: Double
  var preload: js.Array[_]
  var runCore: String
  var subTestTimeout: Double
  var testClass: ITest
  var title: String
  var transparentEx: Boolean
  var waitForTimeout: Double
  def configure(config: js.Any): Unit
  def start(descriptors: js.Any*): Unit
}

object IHarness {
  @scala.inline
  def apply(
    alsoPreload: js.Array[_],
    autoCheckGlobals: Boolean,
    cachePreload: Boolean,
    configure: js.Any => Unit,
    defaultTimeout: Boolean,
    disableColoring: Boolean,
    expectedGlobals: js.Array[String],
    isReadyTimeout: Double,
    keepNLastResults: Double,
    keepResults: Boolean,
    listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ js.Any, Unit]],
    maxThreads: Double,
    needDone: Boolean,
    overrideSetTimeout: Boolean,
    pauseBetweenTests: Double,
    preload: js.Array[_],
    runCore: String,
    start: /* repeated */ js.Any => Unit,
    subTestTimeout: Double,
    testClass: ITest,
    title: String,
    transparentEx: Boolean,
    waitForTimeout: Double
  ): IHarness = {
    val __obj = js.Dynamic.literal(alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHarness]
  }
}

