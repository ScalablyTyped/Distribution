package typings.semanticUiTab

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typings.semanticUiTab.SemanticUI.Tab.ClassNameSettings.Param
import typings.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typings.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typings.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings
import typings.semanticUiTab.anon.PartialPickImplkeyofImpl
import typings.semanticUiTab.anon.PartialPickImplkeyofImplActive
import typings.semanticUiTab.anon.PartialPickImplkeyofImplApi
import typings.semanticUiTab.anon.PartialPickImplkeyofImplLoaded
import typings.semanticUiTab.anon.PartialPickImplkeyofImplParent
import typings.semanticUiTab.anon.PickImplactive
import typings.semanticUiTab.anon.PickImplalwaysRefresh
import typings.semanticUiTab.anon.PickImplapi
import typings.semanticUiTab.anon.PickImplapiSettings
import typings.semanticUiTab.anon.PickImplauto
import typings.semanticUiTab.anon.PickImplcache
import typings.semanticUiTab.anon.PickImplcacheType
import typings.semanticUiTab.anon.PickImplchildrenOnly
import typings.semanticUiTab.anon.PickImplclassName
import typings.semanticUiTab.anon.PickImplcontext
import typings.semanticUiTab.anon.PickImpldeactivate
import typings.semanticUiTab.anon.PickImpldebug
import typings.semanticUiTab.anon.PickImplerror
import typings.semanticUiTab.anon.PickImplevaluateScripts
import typings.semanticUiTab.anon.PickImplhistory
import typings.semanticUiTab.anon.PickImplhistoryType
import typings.semanticUiTab.anon.PickImplignoreFirstLoad
import typings.semanticUiTab.anon.PickImplloadOnce
import typings.semanticUiTab.anon.PickImplloaded
import typings.semanticUiTab.anon.PickImplloading
import typings.semanticUiTab.anon.PickImplmaxDepth
import typings.semanticUiTab.anon.PickImplmetadata
import typings.semanticUiTab.anon.PickImplmethod
import typings.semanticUiTab.anon.PickImplmissingTab
import typings.semanticUiTab.anon.PickImplname
import typings.semanticUiTab.anon.PickImplnamespace
import typings.semanticUiTab.anon.PickImplnoContent
import typings.semanticUiTab.anon.PickImplonFirstLoad
import typings.semanticUiTab.anon.PickImplonLoad
import typings.semanticUiTab.anon.PickImplonRequest
import typings.semanticUiTab.anon.PickImplonVisible
import typings.semanticUiTab.anon.PickImplparent
import typings.semanticUiTab.anon.PickImplpath
import typings.semanticUiTab.anon.PickImplpathPath
import typings.semanticUiTab.anon.PickImplperformance
import typings.semanticUiTab.anon.PickImplpromise
import typings.semanticUiTab.anon.PickImplrecursion
import typings.semanticUiTab.anon.PickImplselector
import typings.semanticUiTab.anon.PickImplsilent
import typings.semanticUiTab.anon.PickImplstate
import typings.semanticUiTab.anon.PickImpltab
import typings.semanticUiTab.anon.PickImpltabs
import typings.semanticUiTab.anon.PickImpltemplates
import typings.semanticUiTab.anon.PickImplverbose
import typings.semanticUiTab.semanticUiTabBooleans.`false`
import typings.semanticUiTab.semanticUiTabStrings.DOM
import typings.semanticUiTab.semanticUiTabStrings.`cache add`
import typings.semanticUiTab.semanticUiTabStrings.`cache read`
import typings.semanticUiTab.semanticUiTabStrings.`cache remove`
import typings.semanticUiTab.semanticUiTabStrings.`change tab`
import typings.semanticUiTab.semanticUiTabStrings.`get path`
import typings.semanticUiTab.semanticUiTabStrings.`is tab`
import typings.semanticUiTab.semanticUiTabStrings.`set state`
import typings.semanticUiTab.semanticUiTabStrings.all
import typings.semanticUiTab.semanticUiTabStrings.alwaysRefresh
import typings.semanticUiTab.semanticUiTabStrings.apiSettings
import typings.semanticUiTab.semanticUiTabStrings.auto
import typings.semanticUiTab.semanticUiTabStrings.cache
import typings.semanticUiTab.semanticUiTabStrings.cacheType
import typings.semanticUiTab.semanticUiTabStrings.childrenOnly
import typings.semanticUiTab.semanticUiTabStrings.className
import typings.semanticUiTab.semanticUiTabStrings.context
import typings.semanticUiTab.semanticUiTabStrings.deactivate
import typings.semanticUiTab.semanticUiTabStrings.debug
import typings.semanticUiTab.semanticUiTabStrings.destroy
import typings.semanticUiTab.semanticUiTabStrings.error
import typings.semanticUiTab.semanticUiTabStrings.evaluateScripts
import typings.semanticUiTab.semanticUiTabStrings.hash
import typings.semanticUiTab.semanticUiTabStrings.history
import typings.semanticUiTab.semanticUiTabStrings.historyType
import typings.semanticUiTab.semanticUiTabStrings.html
import typings.semanticUiTab.semanticUiTabStrings.ignoreFirstLoad
import typings.semanticUiTab.semanticUiTabStrings.loadOnce
import typings.semanticUiTab.semanticUiTabStrings.maxDepth
import typings.semanticUiTab.semanticUiTabStrings.metadata
import typings.semanticUiTab.semanticUiTabStrings.name
import typings.semanticUiTab.semanticUiTabStrings.namespace
import typings.semanticUiTab.semanticUiTabStrings.onFirstLoad
import typings.semanticUiTab.semanticUiTabStrings.onLoad
import typings.semanticUiTab.semanticUiTabStrings.onRequest
import typings.semanticUiTab.semanticUiTabStrings.onVisible
import typings.semanticUiTab.semanticUiTabStrings.once
import typings.semanticUiTab.semanticUiTabStrings.path
import typings.semanticUiTab.semanticUiTabStrings.performance
import typings.semanticUiTab.semanticUiTabStrings.response
import typings.semanticUiTab.semanticUiTabStrings.selector
import typings.semanticUiTab.semanticUiTabStrings.setting
import typings.semanticUiTab.semanticUiTabStrings.siblings
import typings.semanticUiTab.semanticUiTabStrings.silent
import typings.semanticUiTab.semanticUiTabStrings.state
import typings.semanticUiTab.semanticUiTabStrings.templates
import typings.semanticUiTab.semanticUiTabStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Tab extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Sets cached HTML for path
      */
    def apply(behavior: `cache add`, path: String, html: String): JQuery = js.native
    /**
      * Returns cached HTML for path
      */
    def apply(behavior: `cache read`, path: String): String | `false` = js.native
    /**
      * Removes cached HTML for path
      */
    def apply(behavior: `cache remove`, path: String): JQuery = js.native
    // Documentation says this exists but it does not.
    // /**
    //  * Attaches tab action to given selector. Default event if none specified is toggle
    //  */
    // (behavior: 'attach events', selector: Selector, event?: string): JQuery;
    /**
      * Changes tab to path
      */
    def apply(behavior: `change tab`, path: String): JQuery = js.native
    /**
      * Returns current path
      */
    def apply(behavior: `get path`): String = js.native
    /**
      * Returns whether tab exists
      */
    def apply(behavior: `is tab`): Boolean = js.native
    /**
      * Sets current path to state
      */
    def apply(behavior: `set state`, path: String): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    def apply(behavior: setting, name: alwaysRefresh, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: alwaysRefresh, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: apiSettings, value: Unit): ApiSettings = js.native
    def apply(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
    def apply(behavior: setting, name: auto, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: auto, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: cacheType, value: Unit): response | DOM | html = js.native
    def apply(behavior: setting, name: cacheType, value: DOM): JQuery = js.native
    def apply(behavior: setting, name: cacheType, value: html): JQuery = js.native
    def apply(behavior: setting, name: cacheType, value: response): JQuery = js.native
    def apply(behavior: setting, name: cache, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: cache, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: childrenOnly, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: childrenOnly, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: className, value: Unit): ClassNameSettings = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: context, value: String): JQuery = js.native
    def apply(behavior: setting, name: context, value: Unit): `false` | String | JQuery = js.native
    def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: deactivate, value: Unit): siblings | all = js.native
    def apply(behavior: setting, name: deactivate, value: all): JQuery = js.native
    def apply(behavior: setting, name: deactivate, value: siblings): JQuery = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: debug, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: error, value: Unit): ErrorSettings = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: evaluateScripts, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: evaluateScripts, value: Unit): once | Boolean = js.native
    def apply(behavior: setting, name: evaluateScripts, value: once): JQuery = js.native
    def apply(behavior: setting, name: historyType, value: Unit): hash | state = js.native
    def apply(behavior: setting, name: historyType, value: hash): JQuery = js.native
    def apply(behavior: setting, name: historyType, value: state): JQuery = js.native
    def apply(behavior: setting, name: history, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: history, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: ignoreFirstLoad, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: ignoreFirstLoad, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: loadOnce, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: loadOnce, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: maxDepth, value: Double): JQuery = js.native
    def apply(behavior: setting, name: maxDepth, value: Unit): Double = js.native
    def apply(behavior: setting, name: metadata, value: Unit): MetadataSettings = js.native
    def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: Unit): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: Unit): String = js.native
    def apply(
      behavior: setting,
      name: onFirstLoad,
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[js.Any], 
          /* historyEvent */ js.Any, 
          Unit
        ]
    ): JQuery = js.native
    def apply(behavior: setting, name: onFirstLoad, value: Unit): js.ThisFunction3[
        /* this */ JQuery, 
        /* tabPath */ String, 
        /* parameterArray */ js.Array[js.Any], 
        /* historyEvent */ js.Any, 
        Unit
      ] = js.native
    def apply(
      behavior: setting,
      name: onLoad,
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[js.Any], 
          /* historyEvent */ js.Any, 
          Unit
        ]
    ): JQuery = js.native
    def apply(behavior: setting, name: onLoad, value: Unit): js.ThisFunction3[
        /* this */ JQuery, 
        /* tabPath */ String, 
        /* parameterArray */ js.Array[js.Any], 
        /* historyEvent */ js.Any, 
        Unit
      ] = js.native
    def apply(
      behavior: setting,
      name: onRequest,
      value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onRequest, value: Unit): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
    def apply(
      behavior: setting,
      name: onVisible,
      value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onVisible, value: Unit): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
    def apply(behavior: setting, name: path, value: String): JQuery = js.native
    def apply(behavior: setting, name: path, value: Unit): `false` | String = js.native
    def apply(behavior: setting, name: path, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: performance, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: selector, value: Unit): SelectorSettings = js.native
    def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: templates, value: Unit): TemplatesSettings = js.native
    def apply(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: Unit): Boolean = js.native
    def apply(behavior: setting, value: TabSettings): JQuery = js.native
    def apply(settings: TabSettings): JQuery = js.native
    
    var settings: TabSettings = js.native
  }
  object Tab {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String
        
        /**
          * @default 'loading'
          */
        var loading: String
      }
      object Impl {
        
        inline def apply(active: String, loading: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplloading | PickImplactive) & PartialPickImplkeyofImplActive
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'You attempted to load content without API module'
          */
        var api: String
        
        /**
          * @default 'The method you called is not defined'
          */
        var method: String
        
        /**
          * @default 'Activated tab cannot be found for this context.'
          */
        var missingTab: String
        
        /**
          * @default 'The tab you specified is missing a content url.'
          */
        var noContent: String
        
        /**
          * @default 'History enabled, but no path was specified'
          */
        var path: String
        
        /**
          * @default 'Max recursive depth reached'
          */
        var recursion: String
        
        /**
          * @default 'The state library has not been initialized'
          */
        var state: String
      }
      object Impl {
        
        inline def apply(
          api: String,
          method: String,
          missingTab: String,
          noContent: String,
          path: String,
          recursion: String,
          state: String
        ): Impl = {
          val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], missingTab = missingTab.asInstanceOf[js.Any], noContent = noContent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], recursion = recursion.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setMissingTab(value: String): Self = StObject.set(x, "missingTab", value.asInstanceOf[js.Any])
          
          inline def setNoContent(value: String): Self = StObject.set(x, "noContent", value.asInstanceOf[js.Any])
          
          inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
          
          inline def setRecursion(value: String): Self = StObject.set(x, "recursion", value.asInstanceOf[js.Any])
          
          inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplapi | PickImplmethod | PickImplmissingTab | PickImplnoContent | PickImplpathPath | PickImplrecursion | PickImplstate) & PartialPickImplkeyofImplApi
    }
    type ErrorSettings = typings.semanticUiTab.SemanticUI.Tab.ErrorSettings.Param
    
    object MetadataSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'loaded'
          */
        var loaded: String
        
        /**
          * @default 'promise'
          */
        var promise: String
        
        /**
          * @default 'tab'
          */
        var tab: String
      }
      object Impl {
        
        inline def apply(loaded: String, promise: String, tab: String): Impl = {
          val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setLoaded(value: String): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
          
          inline def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
          
          inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImpltab | PickImplloaded | PickImplpromise) & PartialPickImplkeyofImplLoaded
    }
    type MetadataSettings = typings.semanticUiTab.SemanticUI.Tab.MetadataSettings.Param
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default '.ui:not(.menu)'
          */
        var parent: String
        
        /**
          * @default '.ui.tab'
          */
        var tabs: String
      }
      object Impl {
        
        inline def apply(parent: String, tabs: String): Impl = {
          val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
          
          inline def setTabs(value: String): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImpltabs | PickImplparent) & PartialPickImplkeyofImplParent
    }
    type SelectorSettings = typings.semanticUiTab.SemanticUI.Tab.SelectorSettings.Param
    
    /* Inlined semantic-ui-tab.SemanticUI.Tab.TemplatesSettings.Param */
    trait TemplatesSettings extends StObject {
      
      def determineTitle(tabArray: js.Array[js.Any]): String
      @JSName("determineTitle")
      var determineTitle_Original: (js.Function1[/* tabArray */ js.Array[js.Any], String]) & (js.UndefOr[js.Function1[/* tabArray */ js.Array[js.Any], String]])
    }
    object TemplatesSettings {
      
      inline def apply(
        determineTitle: (js.Function1[/* tabArray */ js.Array[js.Any], String]) & (js.UndefOr[js.Function1[/* tabArray */ js.Array[js.Any], String]])
      ): TemplatesSettings = {
        val __obj = js.Dynamic.literal(determineTitle = determineTitle.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplatesSettings]
      }
      
      trait Impl extends StObject {
        
        /**
          * returns page title
          */
        def determineTitle(tabArray: js.Array[js.Any]): String
      }
      object Impl {
        
        inline def apply(determineTitle: js.Array[js.Any] => String): Impl = {
          val __obj = js.Dynamic.literal(determineTitle = js.Any.fromFunction1(determineTitle))
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setDetermineTitle(value: js.Array[js.Any] => String): Self = StObject.set(x, "determineTitle", js.Any.fromFunction1(value))
        }
      }
      
      /* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.TemplatesSettings._Impl, 'determineTitle'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.TemplatesSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.TemplatesSettings._Impl>> */
      trait Param extends StObject {
        
        def determineTitle(tabArray: js.Array[js.Any]): String
        @JSName("determineTitle")
        var determineTitle_Original: (js.Function1[/* tabArray */ js.Array[js.Any], String]) & (js.UndefOr[js.Function1[/* tabArray */ js.Array[js.Any], String]])
      }
      object Param {
        
        inline def apply(
          determineTitle: (js.Function1[/* tabArray */ js.Array[js.Any], String]) & (js.UndefOr[js.Function1[/* tabArray */ js.Array[js.Any], String]])
        ): typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings.Param = {
          val __obj = js.Dynamic.literal(determineTitle = determineTitle.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings.Param]
        }
        
        extension [Self <: typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings.Param](x: Self) {
          
          inline def setDetermineTitle(
            value: (js.Function1[/* tabArray */ js.Array[js.Any], String]) & (js.UndefOr[js.Function1[/* tabArray */ js.Array[js.Any], String]])
          ): Self = StObject.set(x, "determineTitle", value.asInstanceOf[js.Any])
        }
      }
      
      extension [Self <: TemplatesSettings](x: Self) {
        
        inline def setDetermineTitle(
          value: (js.Function1[/* tabArray */ js.Array[js.Any], String]) & (js.UndefOr[js.Function1[/* tabArray */ js.Array[js.Any], String]])
        ): Self = StObject.set(x, "determineTitle", value.asInstanceOf[js.Any])
      }
    }
  }
  
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
      def onFirstLoad(tabPath: String, parameterArray: js.Array[js.Any], historyEvent: js.Any): Unit
      
      /**
        * Callback every time a tab is loaded
        */
      def onLoad(tabPath: String, parameterArray: js.Array[js.Any], historyEvent: js.Any): Unit
      
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
        onFirstLoad: (String, js.Array[js.Any], js.Any) => Unit,
        onLoad: (String, js.Array[js.Any], js.Any) => Unit,
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
        
        inline def setOnFirstLoad(value: (String, js.Array[js.Any], js.Any) => Unit): Self = StObject.set(x, "onFirstLoad", js.Any.fromFunction3(value))
        
        inline def setOnLoad(value: (String, js.Array[js.Any], js.Any) => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction3(value))
        
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
    
    type Param = (PickImplauto | PickImpldeactivate | PickImplhistory | PickImplignoreFirstLoad | PickImplevaluateScripts | PickImplalwaysRefresh | PickImplcacheType | PickImplcache | PickImplapiSettings | PickImplhistoryType | PickImplpath | PickImplcontext | PickImplchildrenOnly | PickImplmaxDepth | PickImplloadOnce | PickImplonFirstLoad | PickImplonLoad | PickImplonRequest | PickImplonVisible | PickImpltemplates | PickImplselector | PickImplmetadata | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) & PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/tab.html#/settings}
    */
  type TabSettings = typings.semanticUiTab.SemanticUI.TabSettings.Param
}
