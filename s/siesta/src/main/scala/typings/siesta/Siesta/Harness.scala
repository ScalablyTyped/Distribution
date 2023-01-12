package typings.siesta.Siesta

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Harness {
  
  /**
    * @singleton
    */
  trait IBrowser
    extends StObject
       with IHarness {
    
    var autoRun: Boolean
    
    var autoScrollElementsIntoView: Boolean
    
    var breakOnFail: Boolean
    
    var coverageUnit: String
    
    var disableCaching: Boolean
    
    var enableCodeCoverage: Boolean
    
    var excludeCoverageUnits: js.RegExp
    
    var hostPageUrl: String
    
    var includeCoverageUnits: js.RegExp
    
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
    
    inline def apply(
      alsoPreload: js.Array[Any],
      autoCheckGlobals: Boolean,
      autoRun: Boolean,
      autoScrollElementsIntoView: Boolean,
      breakOnFail: Boolean,
      cachePreload: Boolean,
      configure: Any => Unit,
      coverageUnit: String,
      defaultTimeout: Boolean,
      disableCaching: Boolean,
      disableColoring: Boolean,
      enableCodeCoverage: Boolean,
      excludeCoverageUnits: js.RegExp,
      expectedGlobals: js.Array[String],
      hostPageUrl: String,
      includeCoverageUnits: js.RegExp,
      isReadyTimeout: Double,
      keepNLastResults: Double,
      keepResults: Boolean,
      listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ Any, Unit]],
      maintainViewportSize: Boolean,
      maxThreads: Double,
      needDone: Boolean,
      overrideSetTimeout: Boolean,
      pauseBetweenTests: Double,
      preload: js.Array[Any],
      runCore: String,
      separateContext: Boolean,
      simulateEventsWith: String,
      speedRun: Boolean,
      start: /* repeated */ Any => Unit,
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
    implicit open class MutableBuilder[Self <: IBrowser] (val x: Self) extends AnyVal {
      
      inline def setAutoRun(value: Boolean): Self = StObject.set(x, "autoRun", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollElementsIntoView(value: Boolean): Self = StObject.set(x, "autoScrollElementsIntoView", value.asInstanceOf[js.Any])
      
      inline def setBreakOnFail(value: Boolean): Self = StObject.set(x, "breakOnFail", value.asInstanceOf[js.Any])
      
      inline def setCoverageUnit(value: String): Self = StObject.set(x, "coverageUnit", value.asInstanceOf[js.Any])
      
      inline def setDisableCaching(value: Boolean): Self = StObject.set(x, "disableCaching", value.asInstanceOf[js.Any])
      
      inline def setEnableCodeCoverage(value: Boolean): Self = StObject.set(x, "enableCodeCoverage", value.asInstanceOf[js.Any])
      
      inline def setExcludeCoverageUnits(value: js.RegExp): Self = StObject.set(x, "excludeCoverageUnits", value.asInstanceOf[js.Any])
      
      inline def setHostPageUrl(value: String): Self = StObject.set(x, "hostPageUrl", value.asInstanceOf[js.Any])
      
      inline def setIncludeCoverageUnits(value: js.RegExp): Self = StObject.set(x, "includeCoverageUnits", value.asInstanceOf[js.Any])
      
      inline def setMaintainViewportSize(value: Boolean): Self = StObject.set(x, "maintainViewportSize", value.asInstanceOf[js.Any])
      
      inline def setSeparateContext(value: Boolean): Self = StObject.set(x, "separateContext", value.asInstanceOf[js.Any])
      
      inline def setSimulateEventsWith(value: String): Self = StObject.set(x, "simulateEventsWith", value.asInstanceOf[js.Any])
      
      inline def setSpeedRun(value: Boolean): Self = StObject.set(x, "speedRun", value.asInstanceOf[js.Any])
      
      inline def setUseStrictMode(value: Boolean): Self = StObject.set(x, "useStrictMode", value.asInstanceOf[js.Any])
      
      inline def setViewDOM(value: Boolean): Self = StObject.set(x, "viewDOM", value.asInstanceOf[js.Any])
      
      inline def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
      
      inline def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @singleton
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.siesta.Siesta.Harness.IBrowserExtJSCore because var conflicts: coverageUnit, excludeCoverageUnits. Inlined installLoaderInstrumentationHook */ trait IBrowserExtJS
    extends StObject
       with IBrowser {
    
    var allowExtVersionChange: Boolean
    
    var installLoaderInstrumentationHook: Boolean
    
    var loaderPath: Any
    
    var waitForAppReady: Any
    
    var waitForExtReady: Any
  }
  object IBrowserExtJS {
    
    inline def apply(
      allowExtVersionChange: Boolean,
      alsoPreload: js.Array[Any],
      autoCheckGlobals: Boolean,
      autoRun: Boolean,
      autoScrollElementsIntoView: Boolean,
      breakOnFail: Boolean,
      cachePreload: Boolean,
      configure: Any => Unit,
      coverageUnit: String,
      defaultTimeout: Boolean,
      disableCaching: Boolean,
      disableColoring: Boolean,
      enableCodeCoverage: Boolean,
      excludeCoverageUnits: js.RegExp,
      expectedGlobals: js.Array[String],
      hostPageUrl: String,
      includeCoverageUnits: js.RegExp,
      installLoaderInstrumentationHook: Boolean,
      isReadyTimeout: Double,
      keepNLastResults: Double,
      keepResults: Boolean,
      listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ Any, Unit]],
      loaderPath: Any,
      maintainViewportSize: Boolean,
      maxThreads: Double,
      needDone: Boolean,
      overrideSetTimeout: Boolean,
      pauseBetweenTests: Double,
      preload: js.Array[Any],
      runCore: String,
      separateContext: Boolean,
      simulateEventsWith: String,
      speedRun: Boolean,
      start: /* repeated */ Any => Unit,
      subTestTimeout: Double,
      testClass: ITest,
      title: String,
      transparentEx: Boolean,
      useStrictMode: Boolean,
      viewDOM: Boolean,
      viewportHeight: Double,
      viewportWidth: Double,
      waitForAppReady: Any,
      waitForExtReady: Any,
      waitForTimeout: Double
    ): IBrowserExtJS = {
      val __obj = js.Dynamic.literal(allowExtVersionChange = allowExtVersionChange.asInstanceOf[js.Any], alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], autoRun = autoRun.asInstanceOf[js.Any], autoScrollElementsIntoView = autoScrollElementsIntoView.asInstanceOf[js.Any], breakOnFail = breakOnFail.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableCaching = disableCaching.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], enableCodeCoverage = enableCodeCoverage.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], hostPageUrl = hostPageUrl.asInstanceOf[js.Any], includeCoverageUnits = includeCoverageUnits.asInstanceOf[js.Any], installLoaderInstrumentationHook = installLoaderInstrumentationHook.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], loaderPath = loaderPath.asInstanceOf[js.Any], maintainViewportSize = maintainViewportSize.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], separateContext = separateContext.asInstanceOf[js.Any], simulateEventsWith = simulateEventsWith.asInstanceOf[js.Any], speedRun = speedRun.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], useStrictMode = useStrictMode.asInstanceOf[js.Any], viewDOM = viewDOM.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForAppReady = waitForAppReady.asInstanceOf[js.Any], waitForExtReady = waitForExtReady.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBrowserExtJS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBrowserExtJS] (val x: Self) extends AnyVal {
      
      inline def setAllowExtVersionChange(value: Boolean): Self = StObject.set(x, "allowExtVersionChange", value.asInstanceOf[js.Any])
      
      inline def setInstallLoaderInstrumentationHook(value: Boolean): Self = StObject.set(x, "installLoaderInstrumentationHook", value.asInstanceOf[js.Any])
      
      inline def setLoaderPath(value: Any): Self = StObject.set(x, "loaderPath", value.asInstanceOf[js.Any])
      
      inline def setWaitForAppReady(value: Any): Self = StObject.set(x, "waitForAppReady", value.asInstanceOf[js.Any])
      
      inline def setWaitForExtReady(value: Any): Self = StObject.set(x, "waitForExtReady", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @mixin
    */
  trait IBrowserExtJSCore extends StObject {
    
    var coverageUnit: String
    
    var excludeCoverageUnits: js.RegExp
    
    var installLoaderInstrumentationHook: Boolean
  }
  object IBrowserExtJSCore {
    
    inline def apply(coverageUnit: String, excludeCoverageUnits: js.RegExp, installLoaderInstrumentationHook: Boolean): IBrowserExtJSCore = {
      val __obj = js.Dynamic.literal(coverageUnit = coverageUnit.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], installLoaderInstrumentationHook = installLoaderInstrumentationHook.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBrowserExtJSCore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBrowserExtJSCore] (val x: Self) extends AnyVal {
      
      inline def setCoverageUnit(value: String): Self = StObject.set(x, "coverageUnit", value.asInstanceOf[js.Any])
      
      inline def setExcludeCoverageUnits(value: js.RegExp): Self = StObject.set(x, "excludeCoverageUnits", value.asInstanceOf[js.Any])
      
      inline def setInstallLoaderInstrumentationHook(value: Boolean): Self = StObject.set(x, "installLoaderInstrumentationHook", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @singleton
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.siesta.Siesta.Harness.IBrowserExtJSCore because var conflicts: coverageUnit, excludeCoverageUnits. Inlined installLoaderInstrumentationHook */ trait IBrowserSenchaTouch
    extends StObject
       with IBrowser {
    
    var installLoaderInstrumentationHook: Boolean
    
    var loaderPath: Any
    
    var performSetup: Boolean
  }
  object IBrowserSenchaTouch {
    
    inline def apply(
      alsoPreload: js.Array[Any],
      autoCheckGlobals: Boolean,
      autoRun: Boolean,
      autoScrollElementsIntoView: Boolean,
      breakOnFail: Boolean,
      cachePreload: Boolean,
      configure: Any => Unit,
      coverageUnit: String,
      defaultTimeout: Boolean,
      disableCaching: Boolean,
      disableColoring: Boolean,
      enableCodeCoverage: Boolean,
      excludeCoverageUnits: js.RegExp,
      expectedGlobals: js.Array[String],
      hostPageUrl: String,
      includeCoverageUnits: js.RegExp,
      installLoaderInstrumentationHook: Boolean,
      isReadyTimeout: Double,
      keepNLastResults: Double,
      keepResults: Boolean,
      listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ Any, Unit]],
      loaderPath: Any,
      maintainViewportSize: Boolean,
      maxThreads: Double,
      needDone: Boolean,
      overrideSetTimeout: Boolean,
      pauseBetweenTests: Double,
      performSetup: Boolean,
      preload: js.Array[Any],
      runCore: String,
      separateContext: Boolean,
      simulateEventsWith: String,
      speedRun: Boolean,
      start: /* repeated */ Any => Unit,
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
      val __obj = js.Dynamic.literal(alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], autoRun = autoRun.asInstanceOf[js.Any], autoScrollElementsIntoView = autoScrollElementsIntoView.asInstanceOf[js.Any], breakOnFail = breakOnFail.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableCaching = disableCaching.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], enableCodeCoverage = enableCodeCoverage.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], hostPageUrl = hostPageUrl.asInstanceOf[js.Any], includeCoverageUnits = includeCoverageUnits.asInstanceOf[js.Any], installLoaderInstrumentationHook = installLoaderInstrumentationHook.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], loaderPath = loaderPath.asInstanceOf[js.Any], maintainViewportSize = maintainViewportSize.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], performSetup = performSetup.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], separateContext = separateContext.asInstanceOf[js.Any], simulateEventsWith = simulateEventsWith.asInstanceOf[js.Any], speedRun = speedRun.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], useStrictMode = useStrictMode.asInstanceOf[js.Any], viewDOM = viewDOM.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBrowserSenchaTouch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBrowserSenchaTouch] (val x: Self) extends AnyVal {
      
      inline def setInstallLoaderInstrumentationHook(value: Boolean): Self = StObject.set(x, "installLoaderInstrumentationHook", value.asInstanceOf[js.Any])
      
      inline def setLoaderPath(value: Any): Self = StObject.set(x, "loaderPath", value.asInstanceOf[js.Any])
      
      inline def setPerformSetup(value: Boolean): Self = StObject.set(x, "performSetup", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBrowserSingleton
    extends StObject
       with IBrowser {
    
    var ExtJS: IBrowserExtJS
    
    var SenchaTouch: IBrowserSenchaTouch
  }
  object IBrowserSingleton {
    
    inline def apply(
      ExtJS: IBrowserExtJS,
      SenchaTouch: IBrowserSenchaTouch,
      alsoPreload: js.Array[Any],
      autoCheckGlobals: Boolean,
      autoRun: Boolean,
      autoScrollElementsIntoView: Boolean,
      breakOnFail: Boolean,
      cachePreload: Boolean,
      configure: Any => Unit,
      coverageUnit: String,
      defaultTimeout: Boolean,
      disableCaching: Boolean,
      disableColoring: Boolean,
      enableCodeCoverage: Boolean,
      excludeCoverageUnits: js.RegExp,
      expectedGlobals: js.Array[String],
      hostPageUrl: String,
      includeCoverageUnits: js.RegExp,
      isReadyTimeout: Double,
      keepNLastResults: Double,
      keepResults: Boolean,
      listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ Any, Unit]],
      maintainViewportSize: Boolean,
      maxThreads: Double,
      needDone: Boolean,
      overrideSetTimeout: Boolean,
      pauseBetweenTests: Double,
      preload: js.Array[Any],
      runCore: String,
      separateContext: Boolean,
      simulateEventsWith: String,
      speedRun: Boolean,
      start: /* repeated */ Any => Unit,
      subTestTimeout: Double,
      testClass: ITest,
      title: String,
      transparentEx: Boolean,
      useStrictMode: Boolean,
      viewDOM: Boolean,
      viewportHeight: Double,
      viewportWidth: Double,
      waitForTimeout: Double
    ): IBrowserSingleton = {
      val __obj = js.Dynamic.literal(ExtJS = ExtJS.asInstanceOf[js.Any], SenchaTouch = SenchaTouch.asInstanceOf[js.Any], alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], autoRun = autoRun.asInstanceOf[js.Any], autoScrollElementsIntoView = autoScrollElementsIntoView.asInstanceOf[js.Any], breakOnFail = breakOnFail.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableCaching = disableCaching.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], enableCodeCoverage = enableCodeCoverage.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], hostPageUrl = hostPageUrl.asInstanceOf[js.Any], includeCoverageUnits = includeCoverageUnits.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], maintainViewportSize = maintainViewportSize.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], separateContext = separateContext.asInstanceOf[js.Any], simulateEventsWith = simulateEventsWith.asInstanceOf[js.Any], speedRun = speedRun.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], useStrictMode = useStrictMode.asInstanceOf[js.Any], viewDOM = viewDOM.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBrowserSingleton]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBrowserSingleton] (val x: Self) extends AnyVal {
      
      inline def setExtJS(value: IBrowserExtJS): Self = StObject.set(x, "ExtJS", value.asInstanceOf[js.Any])
      
      inline def setSenchaTouch(value: IBrowserSenchaTouch): Self = StObject.set(x, "SenchaTouch", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @singleton
    */
  type IHarnessNodeJS = IHarness
  
  trait IPreloadContentDescriptor extends StObject {
    
    var content: String
    
    var `type`: String
  }
  object IPreloadContentDescriptor {
    
    inline def apply(content: String, `type`: String): IPreloadContentDescriptor = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreloadContentDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPreloadContentDescriptor] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPreloadTextDescriptor extends StObject {
    
    var text: String
  }
  object IPreloadTextDescriptor {
    
    inline def apply(text: String): IPreloadTextDescriptor = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreloadTextDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPreloadTextDescriptor] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPreloadUrlDescriptor extends StObject {
    
    var `type`: String
    
    var url: String
  }
  object IPreloadUrlDescriptor {
    
    inline def apply(`type`: String, url: String): IPreloadUrlDescriptor = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreloadUrlDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPreloadUrlDescriptor] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITestGroupDescriptor extends StObject {
    
    var group: String
    
    var items: js.Array[Any]
  }
  object ITestGroupDescriptor {
    
    inline def apply(group: String, items: js.Array[Any]): ITestGroupDescriptor = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestGroupDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITestGroupDescriptor] (val x: Self) extends AnyVal {
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait ITestUrlDescriptor extends StObject {
    
    var url: String
  }
  object ITestUrlDescriptor {
    
    inline def apply(url: String): ITestUrlDescriptor = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestUrlDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITestUrlDescriptor] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
