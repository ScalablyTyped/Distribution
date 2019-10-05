package typings.siesta.Siesta.Harness

import org.scalablytyped.runtime.StringDictionary
import typings.siesta.Siesta.IHarness
import typings.siesta.Siesta.ITest
import typings.std.Event
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
    listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ js.Any, Unit]],
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
    val __obj = js.Dynamic.literal(alsoPreload = alsoPreload, autoCheckGlobals = autoCheckGlobals, autoRun = autoRun, autoScrollElementsIntoView = autoScrollElementsIntoView, breakOnFail = breakOnFail, cachePreload = cachePreload, configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit, defaultTimeout = defaultTimeout, disableCaching = disableCaching, disableColoring = disableColoring, enableCodeCoverage = enableCodeCoverage, excludeCoverageUnits = excludeCoverageUnits, expectedGlobals = expectedGlobals, hostPageUrl = hostPageUrl, includeCoverageUnits = includeCoverageUnits, isReadyTimeout = isReadyTimeout, keepNLastResults = keepNLastResults, keepResults = keepResults, listenters = listenters, maintainViewportSize = maintainViewportSize, maxThreads = maxThreads, needDone = needDone, overrideSetTimeout = overrideSetTimeout, pauseBetweenTests = pauseBetweenTests, preload = preload, runCore = runCore, separateContext = separateContext, simulateEventsWith = simulateEventsWith, speedRun = speedRun, start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout, testClass = testClass, title = title, transparentEx = transparentEx, useStrictMode = useStrictMode, viewDOM = viewDOM, viewportHeight = viewportHeight, viewportWidth = viewportWidth, waitForTimeout = waitForTimeout)
  
    __obj.asInstanceOf[IBrowser]
  }
}

