package typings.siesta.Siesta

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Harness {
  
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
    implicit class IBrowserMutableBuilder[Self <: IBrowser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRun(value: Boolean): Self = StObject.set(x, "autoRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScrollElementsIntoView(value: Boolean): Self = StObject.set(x, "autoScrollElementsIntoView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakOnFail(value: Boolean): Self = StObject.set(x, "breakOnFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageUnit(value: String): Self = StObject.set(x, "coverageUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCaching(value: Boolean): Self = StObject.set(x, "disableCaching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCodeCoverage(value: Boolean): Self = StObject.set(x, "enableCodeCoverage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeCoverageUnits(value: RegExp): Self = StObject.set(x, "excludeCoverageUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostPageUrl(value: String): Self = StObject.set(x, "hostPageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeCoverageUnits(value: RegExp): Self = StObject.set(x, "includeCoverageUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainViewportSize(value: Boolean): Self = StObject.set(x, "maintainViewportSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparateContext(value: Boolean): Self = StObject.set(x, "separateContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimulateEventsWith(value: String): Self = StObject.set(x, "simulateEventsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedRun(value: Boolean): Self = StObject.set(x, "speedRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStrictMode(value: Boolean): Self = StObject.set(x, "useStrictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewDOM(value: Boolean): Self = StObject.set(x, "viewDOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class IBrowserExtJSMutableBuilder[Self <: IBrowserExtJS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowExtVersionChange(value: Boolean): Self = StObject.set(x, "allowExtVersionChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallLoaderInstrumentationHook(value: Boolean): Self = StObject.set(x, "installLoaderInstrumentationHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderPath(value: js.Any): Self = StObject.set(x, "loaderPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForAppReady(value: js.Any): Self = StObject.set(x, "waitForAppReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForExtReady(value: js.Any): Self = StObject.set(x, "waitForExtReady", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @mixin
    */
  @js.native
  trait IBrowserExtJSCore extends StObject {
    
    var coverageUnit: String = js.native
    
    var excludeCoverageUnits: RegExp = js.native
    
    var installLoaderInstrumentationHook: Boolean = js.native
  }
  object IBrowserExtJSCore {
    
    @scala.inline
    def apply(coverageUnit: String, excludeCoverageUnits: RegExp, installLoaderInstrumentationHook: Boolean): IBrowserExtJSCore = {
      val __obj = js.Dynamic.literal(coverageUnit = coverageUnit.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], installLoaderInstrumentationHook = installLoaderInstrumentationHook.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBrowserExtJSCore]
    }
    
    @scala.inline
    implicit class IBrowserExtJSCoreMutableBuilder[Self <: IBrowserExtJSCore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverageUnit(value: String): Self = StObject.set(x, "coverageUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeCoverageUnits(value: RegExp): Self = StObject.set(x, "excludeCoverageUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallLoaderInstrumentationHook(value: Boolean): Self = StObject.set(x, "installLoaderInstrumentationHook", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @singleton
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.siesta.Siesta.Harness.IBrowserExtJSCore because var conflicts: coverageUnit, excludeCoverageUnits. Inlined installLoaderInstrumentationHook */ @js.native
  trait IBrowserSenchaTouch extends IBrowser {
    
    var installLoaderInstrumentationHook: Boolean = js.native
    
    var loaderPath: js.Any = js.native
    
    var performSetup: Boolean = js.native
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
      val __obj = js.Dynamic.literal(alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], autoRun = autoRun.asInstanceOf[js.Any], autoScrollElementsIntoView = autoScrollElementsIntoView.asInstanceOf[js.Any], breakOnFail = breakOnFail.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableCaching = disableCaching.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], enableCodeCoverage = enableCodeCoverage.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], hostPageUrl = hostPageUrl.asInstanceOf[js.Any], includeCoverageUnits = includeCoverageUnits.asInstanceOf[js.Any], installLoaderInstrumentationHook = installLoaderInstrumentationHook.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], loaderPath = loaderPath.asInstanceOf[js.Any], maintainViewportSize = maintainViewportSize.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], performSetup = performSetup.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], separateContext = separateContext.asInstanceOf[js.Any], simulateEventsWith = simulateEventsWith.asInstanceOf[js.Any], speedRun = speedRun.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], useStrictMode = useStrictMode.asInstanceOf[js.Any], viewDOM = viewDOM.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBrowserSenchaTouch]
    }
    
    @scala.inline
    implicit class IBrowserSenchaTouchMutableBuilder[Self <: IBrowserSenchaTouch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstallLoaderInstrumentationHook(value: Boolean): Self = StObject.set(x, "installLoaderInstrumentationHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderPath(value: js.Any): Self = StObject.set(x, "loaderPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformSetup(value: Boolean): Self = StObject.set(x, "performSetup", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBrowserSingleton extends IBrowser {
    
    var ExtJS: IBrowserExtJS = js.native
    
    var SenchaTouch: IBrowserSenchaTouch = js.native
  }
  object IBrowserSingleton {
    
    @scala.inline
    def apply(
      ExtJS: IBrowserExtJS,
      SenchaTouch: IBrowserSenchaTouch,
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
    ): IBrowserSingleton = {
      val __obj = js.Dynamic.literal(ExtJS = ExtJS.asInstanceOf[js.Any], SenchaTouch = SenchaTouch.asInstanceOf[js.Any], alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], autoRun = autoRun.asInstanceOf[js.Any], autoScrollElementsIntoView = autoScrollElementsIntoView.asInstanceOf[js.Any], breakOnFail = breakOnFail.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), coverageUnit = coverageUnit.asInstanceOf[js.Any], defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableCaching = disableCaching.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], enableCodeCoverage = enableCodeCoverage.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], hostPageUrl = hostPageUrl.asInstanceOf[js.Any], includeCoverageUnits = includeCoverageUnits.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], maintainViewportSize = maintainViewportSize.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], separateContext = separateContext.asInstanceOf[js.Any], simulateEventsWith = simulateEventsWith.asInstanceOf[js.Any], speedRun = speedRun.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], useStrictMode = useStrictMode.asInstanceOf[js.Any], viewDOM = viewDOM.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBrowserSingleton]
    }
    
    @scala.inline
    implicit class IBrowserSingletonMutableBuilder[Self <: IBrowserSingleton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtJS(value: IBrowserExtJS): Self = StObject.set(x, "ExtJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenchaTouch(value: IBrowserSenchaTouch): Self = StObject.set(x, "SenchaTouch", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @singleton
    */
  type IHarnessNodeJS = IHarness
  
  @js.native
  trait IPreloadContentDescriptor extends StObject {
    
    var content: String = js.native
    
    var `type`: String = js.native
  }
  object IPreloadContentDescriptor {
    
    @scala.inline
    def apply(content: String, `type`: String): IPreloadContentDescriptor = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreloadContentDescriptor]
    }
    
    @scala.inline
    implicit class IPreloadContentDescriptorMutableBuilder[Self <: IPreloadContentDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPreloadTextDescriptor extends StObject {
    
    var text: String = js.native
  }
  object IPreloadTextDescriptor {
    
    @scala.inline
    def apply(text: String): IPreloadTextDescriptor = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreloadTextDescriptor]
    }
    
    @scala.inline
    implicit class IPreloadTextDescriptorMutableBuilder[Self <: IPreloadTextDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPreloadUrlDescriptor extends StObject {
    
    var `type`: String = js.native
    
    var url: String = js.native
  }
  object IPreloadUrlDescriptor {
    
    @scala.inline
    def apply(`type`: String, url: String): IPreloadUrlDescriptor = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreloadUrlDescriptor]
    }
    
    @scala.inline
    implicit class IPreloadUrlDescriptorMutableBuilder[Self <: IPreloadUrlDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITestGroupDescriptor extends StObject {
    
    var group: String = js.native
    
    var items: js.Array[_] = js.native
  }
  object ITestGroupDescriptor {
    
    @scala.inline
    def apply(group: String, items: js.Array[_]): ITestGroupDescriptor = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestGroupDescriptor]
    }
    
    @scala.inline
    implicit class ITestGroupDescriptorMutableBuilder[Self <: ITestGroupDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ITestUrlDescriptor extends StObject {
    
    var url: String = js.native
  }
  object ITestUrlDescriptor {
    
    @scala.inline
    def apply(url: String): ITestUrlDescriptor = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestUrlDescriptor]
    }
    
    @scala.inline
    implicit class ITestUrlDescriptorMutableBuilder[Self <: ITestUrlDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
