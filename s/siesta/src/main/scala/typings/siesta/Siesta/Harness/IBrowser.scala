package typings.siesta.Siesta.Harness

import org.scalablytyped.runtime.StringDictionary
import typings.siesta.Siesta.IHarness
import typings.siesta.Siesta.ITest
import typings.std.Event_
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @singleton
  */
trait IBrowser extends IHarness {
  var autoRun: Boolean
  var autoScrollElementsIntoView: Boolean
  var breakOnFail: Boolean
  var coverageUnit: String
  var disableCaching: Boolean
  var enableCodeCoverage: Boolean
  var excludeCoverageUnits: RegExp
  var hostPageUrl: String
  var includeCoverageUnits: RegExp
  var maintainViewportSize: Boolean
  var separateContext: Boolean
  var simulateEventsWith: String
  var speedRun: Boolean
  var useStrictMode: Boolean
  var viewDOM: Boolean
  var viewportHeight: Double
  var viewportWidth: Double
}

object IBrowser {
  @scala.inline
  def apply(
    alsoPreload: js.Array[_],
    autoCheckGlobals: Boolean,
    autoRun: Boolean,
    autoScrollElementsIntoView: Boolean,
    breakOnFail: Boolean,
    cachePreload: Boolean,
    configure: js.Any => Unit,
    coverageUnit: String,
    defaultTimeout: Boolean,
    disableCaching: Boolean,
    disableColoring: Boolean,
    enableCodeCoverage: Boolean,
    excludeCoverageUnits: RegExp,
    expectedGlobals: js.Array[String],
    hostPageUrl: String,
    includeCoverageUnits: RegExp,
    isReadyTimeout: Double,
    keepNLastResults: Double,
    keepResults: Boolean,
    listenters: StringDictionary[js.Function2[/* event */ Event_, /* repeated */ js.Any, Unit]],
    maintainViewportSize: Boolean,
    maxThreads: Double,
    needDone: Boolean,
    overrideSetTimeout: Boolean,
    pauseBetweenTests: Double,
    preload: js.Array[_],
    runCore: String,
    separateContext: Boolean,
    simulateEventsWith: String,
    speedRun: Boolean,
    start: /* repeated */ js.Any => Unit,
    subTestTimeout: Double,
    testClass: ITest,
    title: String,
    transparentEx: Boolean,
    useStrictMode: Boolean,
    viewDOM: Boolean,
    viewportHeight: Double,
    viewportWidth: Double,
    waitForTimeout: Double
  ): IBrowser = {
    val __obj = js.Dynamic.literal(alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], autoRun = autoRun.asInstanceOf[js.Any], autoScrollElementsIntoView = autoScrollElementsIntoView.asInstanceOf[js.Any], breakOnFail = breakOnFail.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableCaching = disableCaching.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], enableCodeCoverage = enableCodeCoverage.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], hostPageUrl = hostPageUrl.asInstanceOf[js.Any], includeCoverageUnits = includeCoverageUnits.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], maintainViewportSize = maintainViewportSize.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], separateContext = separateContext.asInstanceOf[js.Any], simulateEventsWith = simulateEventsWith.asInstanceOf[js.Any], speedRun = speedRun.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], useStrictMode = useStrictMode.asInstanceOf[js.Any], viewDOM = viewDOM.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBrowser]
  }
}

