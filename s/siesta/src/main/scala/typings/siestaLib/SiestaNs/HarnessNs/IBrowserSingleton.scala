package typings
package siestaLib.SiestaNs.HarnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrowserSingleton extends IBrowser {
  var ExtJS: IBrowserExtJS
  var SenchaTouch: IBrowserSenchaTouch
}

object IBrowserSingleton {
  @scala.inline
  def apply(
    ExtJS: IBrowserExtJS,
    SenchaTouch: IBrowserSenchaTouch,
    alsoPreload: js.Array[_],
    autoCheckGlobals: scala.Boolean,
    autoRun: scala.Boolean,
    autoScrollElementsIntoView: scala.Boolean,
    breakOnFail: scala.Boolean,
    cachePreload: scala.Boolean,
    configure: js.Function1[js.Any, scala.Unit],
    coverageUnit: java.lang.String,
    defaultTimeout: scala.Boolean,
    disableCaching: scala.Boolean,
    disableColoring: scala.Boolean,
    enableCodeCoverage: scala.Boolean,
    excludeCoverageUnits: stdLib.RegExp,
    expectedGlobals: js.Array[java.lang.String],
    hostPageUrl: java.lang.String,
    includeCoverageUnits: stdLib.RegExp,
    isReadyTimeout: scala.Double,
    keepNLastResults: scala.Double,
    keepResults: scala.Boolean,
    listenters: org.scalablytyped.runtime.StringDictionary[js.Function2[/* event */ stdLib.Event, /* repeated */ js.Any, scala.Unit]],
    maintainViewportSize: scala.Boolean,
    maxThreads: scala.Double,
    needDone: scala.Boolean,
    overrideSetTimeout: scala.Boolean,
    pauseBetweenTests: scala.Double,
    preload: js.Array[_],
    runCore: java.lang.String,
    separateContext: scala.Boolean,
    simulateEventsWith: java.lang.String,
    speedRun: scala.Boolean,
    start: js.Function1[/* repeated */ js.Any, scala.Unit],
    subTestTimeout: scala.Double,
    testClass: siestaLib.SiestaNs.ITest,
    title: java.lang.String,
    transparentEx: scala.Boolean,
    useStrictMode: scala.Boolean,
    viewDOM: scala.Boolean,
    viewportHeight: scala.Double,
    viewportWidth: scala.Double,
    waitForTimeout: scala.Double
  ): IBrowserSingleton = {
    val __obj = js.Dynamic.literal(ExtJS = ExtJS, SenchaTouch = SenchaTouch, alsoPreload = alsoPreload, autoCheckGlobals = autoCheckGlobals, autoRun = autoRun, autoScrollElementsIntoView = autoScrollElementsIntoView, breakOnFail = breakOnFail, cachePreload = cachePreload, configure = configure, coverageUnit = coverageUnit, defaultTimeout = defaultTimeout, disableCaching = disableCaching, disableColoring = disableColoring, enableCodeCoverage = enableCodeCoverage, excludeCoverageUnits = excludeCoverageUnits, expectedGlobals = expectedGlobals, hostPageUrl = hostPageUrl, includeCoverageUnits = includeCoverageUnits, isReadyTimeout = isReadyTimeout, keepNLastResults = keepNLastResults, keepResults = keepResults, listenters = listenters, maintainViewportSize = maintainViewportSize, maxThreads = maxThreads, needDone = needDone, overrideSetTimeout = overrideSetTimeout, pauseBetweenTests = pauseBetweenTests, preload = preload, runCore = runCore, separateContext = separateContext, simulateEventsWith = simulateEventsWith, speedRun = speedRun, start = start, subTestTimeout = subTestTimeout, testClass = testClass, title = title, transparentEx = transparentEx, useStrictMode = useStrictMode, viewDOM = viewDOM, viewportHeight = viewportHeight, viewportWidth = viewportWidth, waitForTimeout = waitForTimeout)
  
    __obj.asInstanceOf[IBrowserSingleton]
  }
}

