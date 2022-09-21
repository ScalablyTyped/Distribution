package typings.semanticUiTab.SemanticUI

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiTab.JQuery
import typings.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typings.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typings.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typings.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings
import typings.semanticUiTab.semanticUiTabBooleans.`false`
import typings.semanticUiTab.semanticUiTabStrings.DOM
import typings.semanticUiTab.semanticUiTabStrings.all
import typings.semanticUiTab.semanticUiTabStrings.hash
import typings.semanticUiTab.semanticUiTabStrings.html
import typings.semanticUiTab.semanticUiTabStrings.once
import typings.semanticUiTab.semanticUiTabStrings.response
import typings.semanticUiTab.semanticUiTabStrings.siblings
import typings.semanticUiTab.semanticUiTabStrings.state
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabSettings {
  
  trait Impl extends StObject {
    
    /**
      * Tab should reload content every time it is opened
      */
    var alwaysRefresh: Boolean
    
    /**
      * Settings object for $.api call
      *
      * @default false
      * @see {@link http://semantic-ui.com/behaviors/api.html}
      */
    var apiSettings: ApiSettings
    
    // region Tab Settings
    /**
      * Whether tab should load remote content as same url as history
      *
      * @default false
      */
    var auto: Boolean
    
    /**
      * Tab should cache content after loading locally to avoid server trip on second load
      *
      * @default true
      */
    var cache: Boolean
    
    /**
      * Can be set to either response, DOM or html.
      * Using DOM will cache the a clone of the DOM tree, preserving all events as they existed on render.
      * response will cache the original response on load, this way callbacks always receive the same content.
      * Using html will cache the resulting html after all callbacks, making sure any changes to content are preserved.
      *
      * @default 'response'
      */
    var cacheType: response | DOM | html
    
    /**
      * If enabled limits tabs to children of passed context
      *
      * @default false
      */
    var childrenOnly: Boolean
    
    /**
      * Class names used to attach style to state
      */
    var className: ClassNameSettings
    
    /**
      * Tabs are limited to those found inside this context
      *
      * @default false
      */
    var context: `false` | String | JQuery
    
    /**
      * When set to siblings will only deactivate elements that are DOM siblings with the activated element.
      * When set to all the component will deactivate all other elements initialized at the same time.
      *
      * @default 'siblings'
      * @since 2.2
      */
    var deactivate: siblings | all
    
    /**
      * Debug output to console
      */
    var debug: Boolean
    
    // endregion
    // region Debug Settings
    var error: ErrorSettings
    
    /**
      * Whether inline scripts in tab HTML should be parsed on tab load.
      * Defaults to once, parsing only on first load.
      * Can also be set to true or false to always parse or never parse inline scripts.
      *
      * @default 'once'
      */
    var evaluateScripts: once | Boolean
    
    /**
      * Whether to record history events for tab changes
      *
      * @default false
      */
    var history: Boolean
    
    /**
      * Can be set to hash or state.
      * Hash will use an in-page link to create history events.
      * State will use DOM History and load pages from server on refresh.
      *
      * @default 'hash'
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/Guide/API/DOM/Manipulating_the_browser_history}
      */
    var historyType: hash | state
    
    /**
      * Do not load content remotely on first tab load. Useful when open tab is rendered on server.
      *
      * @default false
      */
    var ignoreFirstLoad: Boolean
    
    /**
      * When enabled only calls remote endpoint for tab data on first load and leaves the DOM undisturbed afterwards.
      *
      * @default false
      * @since 2.2.8
      */
    var loadOnce: Boolean
    
    /**
      * Maximum amount of nested tabs allowed (avoids recursion)
      *
      * @default 25
      */
    var maxDepth: Double
    
    /**
      * DOM metadata used by module
      */
    var metadata: MetadataSettings
    
    // endregion
    // region Debug Settings
    /**
      * Name used in log statements
      */
    var name: String
    
    // endregion
    // region Component Settings
    // region DOM Settings
    /**
      * Event namespace. Makes sure module teardown does not effect other events attached to an element.
      */
    var namespace: String
    
    // endregion
    // region Callbacks
    /**
      * Callback only the first time a tab is loaded
      */
    def onFirstLoad(tabPath: String, parameterArray: js.Array[Any], historyEvent: Any): Unit
    
    /**
      * Callback every time a tab is loaded
      */
    def onLoad(tabPath: String, parameterArray: js.Array[Any], historyEvent: Any): Unit
    
    /**
      * Called when a tab begins loading remote content
      */
    def onRequest(tabPath: String): Unit
    
    /**
      * Called after a tab becomes visible
      */
    def onVisible(tabPath: String): Unit
    
    /**
      * When using historyType state you must specify the base URL for all internal links.
      *
      * @default false
      */
    var path: `false` | String
    
    /**
      * Show console.table output with performance metrics
      */
    var performance: Boolean
    
    /**
      * Selectors used by module
      */
    var selector: SelectorSettings
    
    /**
      * Silences all console output including error messages, regardless of other debug settings.
      */
    var silent: Boolean
    
    // endregion
    // region DOM Settings
    /**
      * Functions used to return content
      */
    var templates: TemplatesSettings
    
    /**
      * Debug output includes all internal behaviors
      */
    var verbose: Boolean
  }
  object Impl {
    
    inline def apply(
      alwaysRefresh: Boolean,
      apiSettings: ApiSettings,
      auto: Boolean,
      cache: Boolean,
      cacheType: response | DOM | html,
      childrenOnly: Boolean,
      className: ClassNameSettings,
      context: `false` | String | JQuery,
      deactivate: siblings | all,
      debug: Boolean,
      error: ErrorSettings,
      evaluateScripts: once | Boolean,
      history: Boolean,
      historyType: hash | state,
      ignoreFirstLoad: Boolean,
      loadOnce: Boolean,
      maxDepth: Double,
      metadata: MetadataSettings,
      name: String,
      namespace: String,
      onFirstLoad: (String, js.Array[Any], Any) => Unit,
      onLoad: (String, js.Array[Any], Any) => Unit,
      onRequest: String => Unit,
      onVisible: String => Unit,
      path: `false` | String,
      performance: Boolean,
      selector: SelectorSettings,
      silent: Boolean,
      templates: TemplatesSettings,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(alwaysRefresh = alwaysRefresh.asInstanceOf[js.Any], apiSettings = apiSettings.asInstanceOf[js.Any], auto = auto.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheType = cacheType.asInstanceOf[js.Any], childrenOnly = childrenOnly.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], deactivate = deactivate.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], evaluateScripts = evaluateScripts.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], historyType = historyType.asInstanceOf[js.Any], ignoreFirstLoad = ignoreFirstLoad.asInstanceOf[js.Any], loadOnce = loadOnce.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onFirstLoad = js.Any.fromFunction3(onFirstLoad), onLoad = js.Any.fromFunction3(onLoad), onRequest = js.Any.fromFunction1(onRequest), onVisible = js.Any.fromFunction1(onVisible), path = path.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    extension [Self <: Impl](x: Self) {
      
      inline def setAlwaysRefresh(value: Boolean): Self = StObject.set(x, "alwaysRefresh", value.asInstanceOf[js.Any])
      
      inline def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheType(value: response | DOM | html): Self = StObject.set(x, "cacheType", value.asInstanceOf[js.Any])
      
      inline def setChildrenOnly(value: Boolean): Self = StObject.set(x, "childrenOnly", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setContext(value: `false` | String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDeactivate(value: siblings | all): Self = StObject.set(x, "deactivate", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setEvaluateScripts(value: once | Boolean): Self = StObject.set(x, "evaluateScripts", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryType(value: hash | state): Self = StObject.set(x, "historyType", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFirstLoad(value: Boolean): Self = StObject.set(x, "ignoreFirstLoad", value.asInstanceOf[js.Any])
      
      inline def setLoadOnce(value: Boolean): Self = StObject.set(x, "loadOnce", value.asInstanceOf[js.Any])
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOnFirstLoad(value: (String, js.Array[Any], Any) => Unit): Self = StObject.set(x, "onFirstLoad", js.Any.fromFunction3(value))
      
      inline def setOnLoad(value: (String, js.Array[Any], Any) => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction3(value))
      
      inline def setOnRequest(value: String => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction1(value))
      
      inline def setOnVisible(value: String => Unit): Self = StObject.set(x, "onVisible", js.Any.fromFunction1(value))
      
      inline def setPath(value: `false` | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.semanticUiTab.anon.PickImplautoPartialPickIm
    - typings.semanticUiTab.anon.PickImpldeactivatePartial
    - typings.semanticUiTab.anon.PickImplhistoryPartialPic
    - typings.semanticUiTab.anon.PickImplignoreFirstLoadPa
    - typings.semanticUiTab.anon.PickImplevaluateScriptsPa
    - typings.semanticUiTab.anon.PickImplalwaysRefreshPart
    - typings.semanticUiTab.anon.PickImplcacheTypePartialP
    - typings.semanticUiTab.anon.PickImplcachePartialPickI
    - typings.semanticUiTab.anon.PickImplapiSettingsPartia
    - typings.semanticUiTab.anon.PickImplhistoryTypePartia
    - typings.semanticUiTab.anon.PickImplpathPartialPickIm
    - typings.semanticUiTab.anon.PickImplcontextPartialPic
    - typings.semanticUiTab.anon.PickImplchildrenOnlyParti
    - typings.semanticUiTab.anon.PickImplmaxDepthPartialPi
    - typings.semanticUiTab.anon.PickImplloadOncePartialPi
    - typings.semanticUiTab.anon.PickImplonFirstLoadPartia
    - typings.semanticUiTab.anon.PickImplonLoadPartialPick
    - typings.semanticUiTab.anon.PickImplonRequestPartialP
    - typings.semanticUiTab.anon.PickImplonVisiblePartialP
    - typings.semanticUiTab.anon.PickImpltemplatesPartialP
    - typings.semanticUiTab.anon.PickImplselectorPartialPi
    - typings.semanticUiTab.anon.PickImplmetadataPartialPi
    - typings.semanticUiTab.anon.PickImplclassNamePartialP
    - typings.semanticUiTab.anon.PickImplerrorPartialPickI
    - typings.semanticUiTab.anon.PickImplnamespacePartialP
    - typings.semanticUiTab.anon.PickImplnamePartialPickIm
    - typings.semanticUiTab.anon.PickImplsilentPartialPick
    - typings.semanticUiTab.anon.PickImpldebugPartialPickI
    - typings.semanticUiTab.anon.PickImplperformancePartia
    - typings.semanticUiTab.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImplalwaysRefreshPart(alwaysRefresh: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImplalwaysRefreshPart = {
      val __obj = js.Dynamic.literal(alwaysRefresh = alwaysRefresh.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplalwaysRefreshPart]
    }
    
    inline def PickImplapiSettingsPartia(apiSettings: ApiSettings & js.UndefOr[ApiSettings]): typings.semanticUiTab.anon.PickImplapiSettingsPartia = {
      val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplapiSettingsPartia]
    }
    
    inline def PickImplautoPartialPickIm(auto: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImplautoPartialPickIm = {
      val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplautoPartialPickIm]
    }
    
    inline def PickImplcachePartialPickI(cache: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImplcachePartialPickI = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplcachePartialPickI]
    }
    
    inline def PickImplcacheTypePartialP(cacheType: (response | DOM | html) & (js.UndefOr[response | DOM | html])): typings.semanticUiTab.anon.PickImplcacheTypePartialP = {
      val __obj = js.Dynamic.literal(cacheType = cacheType.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplcacheTypePartialP]
    }
    
    inline def PickImplchildrenOnlyParti(childrenOnly: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImplchildrenOnlyParti = {
      val __obj = js.Dynamic.literal(childrenOnly = childrenOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplchildrenOnlyParti]
    }
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typings.semanticUiTab.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImplcontextPartialPic(context: (`false` | String | JQuery) & (js.UndefOr[`false` | String | JQuery])): typings.semanticUiTab.anon.PickImplcontextPartialPic = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplcontextPartialPic]
    }
    
    inline def PickImpldeactivatePartial(deactivate: (siblings | all) & (js.UndefOr[siblings | all])): typings.semanticUiTab.anon.PickImpldeactivatePartial = {
      val __obj = js.Dynamic.literal(deactivate = deactivate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImpldeactivatePartial]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typings.semanticUiTab.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImplevaluateScriptsPa(evaluateScripts: (once | Boolean) & (js.UndefOr[once | Boolean])): typings.semanticUiTab.anon.PickImplevaluateScriptsPa = {
      val __obj = js.Dynamic.literal(evaluateScripts = evaluateScripts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplevaluateScriptsPa]
    }
    
    inline def PickImplhistoryPartialPic(history: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImplhistoryPartialPic = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplhistoryPartialPic]
    }
    
    inline def PickImplhistoryTypePartia(historyType: (hash | state) & (js.UndefOr[hash | state])): typings.semanticUiTab.anon.PickImplhistoryTypePartia = {
      val __obj = js.Dynamic.literal(historyType = historyType.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplhistoryTypePartia]
    }
    
    inline def PickImplignoreFirstLoadPa(ignoreFirstLoad: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImplignoreFirstLoadPa = {
      val __obj = js.Dynamic.literal(ignoreFirstLoad = ignoreFirstLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplignoreFirstLoadPa]
    }
    
    inline def PickImplloadOncePartialPi(loadOnce: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImplloadOncePartialPi = {
      val __obj = js.Dynamic.literal(loadOnce = loadOnce.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplloadOncePartialPi]
    }
    
    inline def PickImplmaxDepthPartialPi(maxDepth: Double & js.UndefOr[Double]): typings.semanticUiTab.anon.PickImplmaxDepthPartialPi = {
      val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplmaxDepthPartialPi]
    }
    
    inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typings.semanticUiTab.anon.PickImplmetadataPartialPi = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplmetadataPartialPi]
    }
    
    inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typings.semanticUiTab.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typings.semanticUiTab.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplonFirstLoadPartia(
      onFirstLoad: (js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[Any], 
          /* historyEvent */ Any, 
          Unit
        ]) & (js.UndefOr[
          js.ThisFunction3[
            /* this */ JQuery, 
            /* tabPath */ String, 
            /* parameterArray */ js.Array[Any], 
            /* historyEvent */ Any, 
            Unit
          ]
        ])
    ): typings.semanticUiTab.anon.PickImplonFirstLoadPartia = {
      val __obj = js.Dynamic.literal(onFirstLoad = onFirstLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplonFirstLoadPartia]
    }
    
    inline def PickImplonLoadPartialPick(
      onLoad: (js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[Any], 
          /* historyEvent */ Any, 
          Unit
        ]) & (js.UndefOr[
          js.ThisFunction3[
            /* this */ JQuery, 
            /* tabPath */ String, 
            /* parameterArray */ js.Array[Any], 
            /* historyEvent */ Any, 
            Unit
          ]
        ])
    ): typings.semanticUiTab.anon.PickImplonLoadPartialPick = {
      val __obj = js.Dynamic.literal(onLoad = onLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplonLoadPartialPick]
    }
    
    inline def PickImplonRequestPartialP(
      onRequest: (js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]])
    ): typings.semanticUiTab.anon.PickImplonRequestPartialP = {
      val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplonRequestPartialP]
    }
    
    inline def PickImplonVisiblePartialP(
      onVisible: (js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]])
    ): typings.semanticUiTab.anon.PickImplonVisiblePartialP = {
      val __obj = js.Dynamic.literal(onVisible = onVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplonVisiblePartialP]
    }
    
    inline def PickImplpathPartialPickIm(path: (`false` | String) & (js.UndefOr[`false` | String])): typings.semanticUiTab.anon.PickImplpathPartialPickIm = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplpathPartialPickIm]
    }
    
    inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplperformancePartia]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typings.semanticUiTab.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImpltemplatesPartialP(templates: TemplatesSettings & js.UndefOr[TemplatesSettings]): typings.semanticUiTab.anon.PickImpltemplatesPartialP = {
      val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImpltemplatesPartialP]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typings.semanticUiTab.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplverbosePartialPic]
    }
  }
}
