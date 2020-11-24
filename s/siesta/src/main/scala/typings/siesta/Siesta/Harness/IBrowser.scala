package typings.siesta.Siesta.Harness

import org.scalablytyped.runtime.StringDictionary
import typings.siesta.Siesta.IHarness
import typings.siesta.Siesta.ITest
import typings.std.Event
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @singleton
  */
@js.native
trait IBrowser extends IHarness {
  
  var autoRun: Boolean = js.native
  
  var autoScrollElementsIntoView: Boolean = js.native
  
  var breakOnFail: Boolean = js.native
  
  var coverageUnit: String = js.native
  
  var disableCaching: Boolean = js.native
  
  var enableCodeCoverage: Boolean = js.native
  
  var excludeCoverageUnits: RegExp = js.native
  
  var hostPageUrl: String = js.native
  
  var includeCoverageUnits: RegExp = js.native
  
  var maintainViewportSize: Boolean = js.native
  
  var separateContext: Boolean = js.native
  
  var simulateEventsWith: String = js.native
  
  var speedRun: Boolean = js.native
  
  var useStrictMode: Boolean = js.native
  
  var viewDOM: Boolean = js.native
  
  var viewportHeight: Double = js.native
  
  var viewportWidth: Double = js.native
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
    val __obj = js.Dynamic.literal(alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], autoRun = autoRun.asInstanceOf[js.Any], autoScrollElementsIntoView = autoScrollElementsIntoView.asInstanceOf[js.Any], breakOnFail = breakOnFail.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableCaching = disableCaching.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], enableCodeCoverage = enableCodeCoverage.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], hostPageUrl = hostPageUrl.asInstanceOf[js.Any], includeCoverageUnits = includeCoverageUnits.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], maintainViewportSize = maintainViewportSize.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], separateContext = separateContext.asInstanceOf[js.Any], simulateEventsWith = simulateEventsWith.asInstanceOf[js.Any], speedRun = speedRun.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], useStrictMode = useStrictMode.asInstanceOf[js.Any], viewDOM = viewDOM.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowser]
  }
  
  @scala.inline
  implicit class IBrowserOps[Self <: IBrowser] (val x: Self) extends AnyVal {
    
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
    def setAutoRun(value: Boolean): Self = this.set("autoRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollElementsIntoView(value: Boolean): Self = this.set("autoScrollElementsIntoView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakOnFail(value: Boolean): Self = this.set("breakOnFail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageUnit(value: String): Self = this.set("coverageUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCaching(value: Boolean): Self = this.set("disableCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCodeCoverage(value: Boolean): Self = this.set("enableCodeCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeCoverageUnits(value: RegExp): Self = this.set("excludeCoverageUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPageUrl(value: String): Self = this.set("hostPageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCoverageUnits(value: RegExp): Self = this.set("includeCoverageUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainViewportSize(value: Boolean): Self = this.set("maintainViewportSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparateContext(value: Boolean): Self = this.set("separateContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulateEventsWith(value: String): Self = this.set("simulateEventsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedRun(value: Boolean): Self = this.set("speedRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStrictMode(value: Boolean): Self = this.set("useStrictMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDOM(value: Boolean): Self = this.set("viewDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportHeight(value: Double): Self = this.set("viewportHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportWidth(value: Double): Self = this.set("viewportWidth", value.asInstanceOf[js.Any])
  }
}
