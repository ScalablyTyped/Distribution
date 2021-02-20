package typings.siesta.Siesta

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @abstract
  */
@js.native
trait IHarness extends StObject {
  
  var alsoPreload: js.Array[_] = js.native
  
  var autoCheckGlobals: Boolean = js.native
  
  var cachePreload: Boolean = js.native
  
  def configure(config: js.Any): Unit = js.native
  
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
  
  def start(descriptors: js.Any*): Unit = js.native
  
  var subTestTimeout: Double = js.native
  
  var testClass: ITest = js.native
  
  var title: String = js.native
  
  var transparentEx: Boolean = js.native
  
  var waitForTimeout: Double = js.native
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
  implicit class IHarnessMutableBuilder[Self <: IHarness] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlsoPreload(value: js.Array[_]): Self = StObject.set(x, "alsoPreload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlsoPreloadVarargs(value: js.Any*): Self = StObject.set(x, "alsoPreload", js.Array(value :_*))
    
    @scala.inline
    def setAutoCheckGlobals(value: Boolean): Self = StObject.set(x, "autoCheckGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePreload(value: Boolean): Self = StObject.set(x, "cachePreload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigure(value: js.Any => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultTimeout(value: Boolean): Self = StObject.set(x, "defaultTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableColoring(value: Boolean): Self = StObject.set(x, "disableColoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedGlobals(value: js.Array[String]): Self = StObject.set(x, "expectedGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedGlobalsVarargs(value: String*): Self = StObject.set(x, "expectedGlobals", js.Array(value :_*))
    
    @scala.inline
    def setIsReadyTimeout(value: Double): Self = StObject.set(x, "isReadyTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepNLastResults(value: Double): Self = StObject.set(x, "keepNLastResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepResults(value: Boolean): Self = StObject.set(x, "keepResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenters(value: StringDictionary[js.Function2[/* event */ Event, /* repeated */ js.Any, Unit]]): Self = StObject.set(x, "listenters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxThreads(value: Double): Self = StObject.set(x, "maxThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedDone(value: Boolean): Self = StObject.set(x, "needDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideSetTimeout(value: Boolean): Self = StObject.set(x, "overrideSetTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseBetweenTests(value: Double): Self = StObject.set(x, "pauseBetweenTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: js.Array[_]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadVarargs(value: js.Any*): Self = StObject.set(x, "preload", js.Array(value :_*))
    
    @scala.inline
    def setRunCore(value: String): Self = StObject.set(x, "runCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubTestTimeout(value: Double): Self = StObject.set(x, "subTestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestClass(value: ITest): Self = StObject.set(x, "testClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentEx(value: Boolean): Self = StObject.set(x, "transparentEx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForTimeout(value: Double): Self = StObject.set(x, "waitForTimeout", value.asInstanceOf[js.Any])
  }
}
