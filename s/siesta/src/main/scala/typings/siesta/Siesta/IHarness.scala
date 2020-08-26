package typings.siesta.Siesta

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @abstract
  */
@js.native
trait IHarness extends js.Object {
  var alsoPreload: js.Array[_] = js.native
  var autoCheckGlobals: Boolean = js.native
  var cachePreload: Boolean = js.native
  var defaultTimeout: Boolean = js.native
  var disableColoring: Boolean = js.native
  var expectedGlobals: js.Array[String] = js.native
  var isReadyTimeout: Double = js.native
  var keepNLastResults: Double = js.native
  var keepResults: Boolean = js.native
  var listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ js.Any, Unit]] = js.native
  var maxThreads: Double = js.native
  var needDone: Boolean = js.native
  var overrideSetTimeout: Boolean = js.native
  var pauseBetweenTests: Double = js.native
  var preload: js.Array[_] = js.native
  var runCore: String = js.native
  var subTestTimeout: Double = js.native
  var testClass: ITest = js.native
  var title: String = js.native
  var transparentEx: Boolean = js.native
  var waitForTimeout: Double = js.native
  def configure(config: js.Any): Unit = js.native
  def start(descriptors: js.Any*): Unit = js.native
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
  @scala.inline
  implicit class IHarnessOps[Self <: IHarness] (val x: Self) extends AnyVal {
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
    def setAlsoPreloadVarargs(value: js.Any*): Self = this.set("alsoPreload", js.Array(value :_*))
    @scala.inline
    def setAlsoPreload(value: js.Array[_]): Self = this.set("alsoPreload", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoCheckGlobals(value: Boolean): Self = this.set("autoCheckGlobals", value.asInstanceOf[js.Any])
    @scala.inline
    def setCachePreload(value: Boolean): Self = this.set("cachePreload", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigure(value: js.Any => Unit): Self = this.set("configure", js.Any.fromFunction1(value))
    @scala.inline
    def setDefaultTimeout(value: Boolean): Self = this.set("defaultTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableColoring(value: Boolean): Self = this.set("disableColoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedGlobalsVarargs(value: String*): Self = this.set("expectedGlobals", js.Array(value :_*))
    @scala.inline
    def setExpectedGlobals(value: js.Array[String]): Self = this.set("expectedGlobals", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReadyTimeout(value: Double): Self = this.set("isReadyTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepNLastResults(value: Double): Self = this.set("keepNLastResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepResults(value: Boolean): Self = this.set("keepResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenters(value: StringDictionary[js.Function2[/* event */ Event, /* repeated */ js.Any, Unit]]): Self = this.set("listenters", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxThreads(value: Double): Self = this.set("maxThreads", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedDone(value: Boolean): Self = this.set("needDone", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrideSetTimeout(value: Boolean): Self = this.set("overrideSetTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPauseBetweenTests(value: Double): Self = this.set("pauseBetweenTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreloadVarargs(value: js.Any*): Self = this.set("preload", js.Array(value :_*))
    @scala.inline
    def setPreload(value: js.Array[_]): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunCore(value: String): Self = this.set("runCore", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: /* repeated */ js.Any => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setSubTestTimeout(value: Double): Self = this.set("subTestTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestClass(value: ITest): Self = this.set("testClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransparentEx(value: Boolean): Self = this.set("transparentEx", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitForTimeout(value: Double): Self = this.set("waitForTimeout", value.asInstanceOf[js.Any])
  }
  
}

