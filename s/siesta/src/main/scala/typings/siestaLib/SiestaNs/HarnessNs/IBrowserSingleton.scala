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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ExtJS")(ExtJS)
    __obj.updateDynamic("SenchaTouch")(SenchaTouch)
    __obj.updateDynamic("alsoPreload")(alsoPreload)
    __obj.updateDynamic("autoCheckGlobals")(autoCheckGlobals)
    __obj.updateDynamic("autoRun")(autoRun)
    __obj.updateDynamic("autoScrollElementsIntoView")(autoScrollElementsIntoView)
    __obj.updateDynamic("breakOnFail")(breakOnFail)
    __obj.updateDynamic("cachePreload")(cachePreload)
    __obj.updateDynamic("configure")(configure)
    __obj.updateDynamic("coverageUnit")(coverageUnit)
    __obj.updateDynamic("defaultTimeout")(defaultTimeout)
    __obj.updateDynamic("disableCaching")(disableCaching)
    __obj.updateDynamic("disableColoring")(disableColoring)
    __obj.updateDynamic("enableCodeCoverage")(enableCodeCoverage)
    __obj.updateDynamic("excludeCoverageUnits")(excludeCoverageUnits)
    __obj.updateDynamic("expectedGlobals")(expectedGlobals)
    __obj.updateDynamic("hostPageUrl")(hostPageUrl)
    __obj.updateDynamic("includeCoverageUnits")(includeCoverageUnits)
    __obj.updateDynamic("isReadyTimeout")(isReadyTimeout)
    __obj.updateDynamic("keepNLastResults")(keepNLastResults)
    __obj.updateDynamic("keepResults")(keepResults)
    __obj.updateDynamic("listenters")(listenters)
    __obj.updateDynamic("maintainViewportSize")(maintainViewportSize)
    __obj.updateDynamic("maxThreads")(maxThreads)
    __obj.updateDynamic("needDone")(needDone)
    __obj.updateDynamic("overrideSetTimeout")(overrideSetTimeout)
    __obj.updateDynamic("pauseBetweenTests")(pauseBetweenTests)
    __obj.updateDynamic("preload")(preload)
    __obj.updateDynamic("runCore")(runCore)
    __obj.updateDynamic("separateContext")(separateContext)
    __obj.updateDynamic("simulateEventsWith")(simulateEventsWith)
    __obj.updateDynamic("speedRun")(speedRun)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("subTestTimeout")(subTestTimeout)
    __obj.updateDynamic("testClass")(testClass)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("transparentEx")(transparentEx)
    __obj.updateDynamic("useStrictMode")(useStrictMode)
    __obj.updateDynamic("viewDOM")(viewDOM)
    __obj.updateDynamic("viewportHeight")(viewportHeight)
    __obj.updateDynamic("viewportWidth")(viewportWidth)
    __obj.updateDynamic("waitForTimeout")(waitForTimeout)
    __obj.asInstanceOf[IBrowserSingleton]
  }
}

