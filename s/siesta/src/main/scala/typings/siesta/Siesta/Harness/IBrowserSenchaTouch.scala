package typings.siesta.Siesta.Harness

import org.scalablytyped.runtime.StringDictionary
import typings.siesta.Siesta.ITest
import typings.std.Event
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @singleton
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.siesta.Siesta.Harness.IBrowserExtJSCore because var conflicts: coverageUnit, excludeCoverageUnits. Inlined installLoaderInstrumentationHook */ trait IBrowserSenchaTouch extends IBrowser {
  var installLoaderInstrumentationHook: Boolean
  var loaderPath: js.Any
  var performSetup: Boolean
}

object IBrowserSenchaTouch {
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
    installLoaderInstrumentationHook: Boolean,
    isReadyTimeout: Double,
    keepNLastResults: Double,
    keepResults: Boolean,
    listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ js.Any, Unit]],
    loaderPath: js.Any,
    maintainViewportSize: Boolean,
    maxThreads: Double,
    needDone: Boolean,
    overrideSetTimeout: Boolean,
    pauseBetweenTests: Double,
    performSetup: Boolean,
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
  ): IBrowserSenchaTouch = {
    val __obj = js.Dynamic.literal(alsoPreload = alsoPreload, autoCheckGlobals = autoCheckGlobals, autoRun = autoRun, autoScrollElementsIntoView = autoScrollElementsIntoView, breakOnFail = breakOnFail, cachePreload = cachePreload, configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit, defaultTimeout = defaultTimeout, disableCaching = disableCaching, disableColoring = disableColoring, enableCodeCoverage = enableCodeCoverage, excludeCoverageUnits = excludeCoverageUnits, expectedGlobals = expectedGlobals, hostPageUrl = hostPageUrl, includeCoverageUnits = includeCoverageUnits, installLoaderInstrumentationHook = installLoaderInstrumentationHook, isReadyTimeout = isReadyTimeout, keepNLastResults = keepNLastResults, keepResults = keepResults, listenters = listenters, loaderPath = loaderPath, maintainViewportSize = maintainViewportSize, maxThreads = maxThreads, needDone = needDone, overrideSetTimeout = overrideSetTimeout, pauseBetweenTests = pauseBetweenTests, performSetup = performSetup, preload = preload, runCore = runCore, separateContext = separateContext, simulateEventsWith = simulateEventsWith, speedRun = speedRun, start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout, testClass = testClass, title = title, transparentEx = transparentEx, useStrictMode = useStrictMode, viewDOM = viewDOM, viewportHeight = viewportHeight, viewportWidth = viewportWidth, waitForTimeout = waitForTimeout)
  
    __obj.asInstanceOf[IBrowserSenchaTouch]
  }
}

