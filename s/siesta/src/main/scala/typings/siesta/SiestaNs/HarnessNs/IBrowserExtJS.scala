package typings.siesta.SiestaNs.HarnessNs

import org.scalablytyped.runtime.StringDictionary
import typings.siesta.SiestaNs.ITest
import typings.std.Event
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @singleton
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.siesta.SiestaNs.HarnessNs.IBrowserExtJSCore because var conflicts: coverageUnit, excludeCoverageUnits. Inlined installLoaderInstrumentationHook */ trait IBrowserExtJS extends IBrowser {
  var allowExtVersionChange: Boolean
  var installLoaderInstrumentationHook: Boolean
  var loaderPath: js.Any
  var waitForAppReady: js.Any
  var waitForExtReady: js.Any
}

object IBrowserExtJS {
  @scala.inline
  def apply(
    allowExtVersionChange: Boolean,
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
    waitForAppReady: js.Any,
    waitForExtReady: js.Any,
    waitForTimeout: Double
  ): IBrowserExtJS = {
    val __obj = js.Dynamic.literal(allowExtVersionChange = allowExtVersionChange, alsoPreload = alsoPreload, autoCheckGlobals = autoCheckGlobals, autoRun = autoRun, autoScrollElementsIntoView = autoScrollElementsIntoView, breakOnFail = breakOnFail, cachePreload = cachePreload, configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit, defaultTimeout = defaultTimeout, disableCaching = disableCaching, disableColoring = disableColoring, enableCodeCoverage = enableCodeCoverage, excludeCoverageUnits = excludeCoverageUnits, expectedGlobals = expectedGlobals, hostPageUrl = hostPageUrl, includeCoverageUnits = includeCoverageUnits, installLoaderInstrumentationHook = installLoaderInstrumentationHook, isReadyTimeout = isReadyTimeout, keepNLastResults = keepNLastResults, keepResults = keepResults, listenters = listenters, loaderPath = loaderPath, maintainViewportSize = maintainViewportSize, maxThreads = maxThreads, needDone = needDone, overrideSetTimeout = overrideSetTimeout, pauseBetweenTests = pauseBetweenTests, preload = preload, runCore = runCore, separateContext = separateContext, simulateEventsWith = simulateEventsWith, speedRun = speedRun, start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout, testClass = testClass, title = title, transparentEx = transparentEx, useStrictMode = useStrictMode, viewDOM = viewDOM, viewportHeight = viewportHeight, viewportWidth = viewportWidth, waitForAppReady = waitForAppReady, waitForExtReady = waitForExtReady, waitForTimeout = waitForTimeout)
  
    __obj.asInstanceOf[IBrowserExtJS]
  }
}

