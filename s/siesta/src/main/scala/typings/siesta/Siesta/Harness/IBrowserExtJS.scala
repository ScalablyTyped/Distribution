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
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.siesta.Siesta.Harness.IBrowserExtJSCore because var conflicts: coverageUnit, excludeCoverageUnits. Inlined installLoaderInstrumentationHook */ @js.native
trait IBrowserExtJS extends IBrowser {
  var allowExtVersionChange: Boolean = js.native
  var installLoaderInstrumentationHook: Boolean = js.native
  var loaderPath: js.Any = js.native
  var waitForAppReady: js.Any = js.native
  var waitForExtReady: js.Any = js.native
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
    val __obj = js.Dynamic.literal(allowExtVersionChange = allowExtVersionChange.asInstanceOf[js.Any], alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], autoRun = autoRun.asInstanceOf[js.Any], autoScrollElementsIntoView = autoScrollElementsIntoView.asInstanceOf[js.Any], breakOnFail = breakOnFail.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableCaching = disableCaching.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], enableCodeCoverage = enableCodeCoverage.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], hostPageUrl = hostPageUrl.asInstanceOf[js.Any], includeCoverageUnits = includeCoverageUnits.asInstanceOf[js.Any], installLoaderInstrumentationHook = installLoaderInstrumentationHook.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], loaderPath = loaderPath.asInstanceOf[js.Any], maintainViewportSize = maintainViewportSize.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], separateContext = separateContext.asInstanceOf[js.Any], simulateEventsWith = simulateEventsWith.asInstanceOf[js.Any], speedRun = speedRun.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], useStrictMode = useStrictMode.asInstanceOf[js.Any], viewDOM = viewDOM.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForAppReady = waitForAppReady.asInstanceOf[js.Any], waitForExtReady = waitForExtReady.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowserExtJS]
  }
  @scala.inline
  implicit class IBrowserExtJSOps[Self <: IBrowserExtJS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowExtVersionChange(value: Boolean): Self = this.set("allowExtVersionChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallLoaderInstrumentationHook(value: Boolean): Self = this.set("installLoaderInstrumentationHook", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderPath(value: js.Any): Self = this.set("loaderPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitForAppReady(value: js.Any): Self = this.set("waitForAppReady", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitForExtReady(value: js.Any): Self = this.set("waitForExtReady", value.asInstanceOf[js.Any])
  }
  
}

