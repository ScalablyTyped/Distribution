package typings.semanticUiTab.SemanticUI

import typings.semanticUiTab.JQuery
import typings.semanticUiTab.SemanticUI.Tab.ClassNameSettings.Param
import typings.semanticUiTab.semanticUiTabBooleans.`false`
import typings.semanticUiTab.semanticUiTabStrings.`cache add`
import typings.semanticUiTab.semanticUiTabStrings.`cache read`
import typings.semanticUiTab.semanticUiTabStrings.`cache remove`
import typings.semanticUiTab.semanticUiTabStrings.`change tab`
import typings.semanticUiTab.semanticUiTabStrings.`get path`
import typings.semanticUiTab.semanticUiTabStrings.`is tab`
import typings.semanticUiTab.semanticUiTabStrings.`set state`
import typings.semanticUiTab.semanticUiTabStrings.destroy
import typings.semanticUiTab.semanticUiTabStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(behavior: setting, value: TabSettings): JQuery = js.native
  def apply(settings: TabSettings): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-tab.SemanticUI.TabSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-tab.SemanticUI.TabSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-tab.SemanticUI.TabSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-tab.SemanticUI.TabSettings._Impl[K] */ js.Any = js.native
  
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
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiTab.anon.PickImplloadingPartialPic
      - typings.semanticUiTab.anon.PickImplactivePartialPick
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactivePartialPick(active: String): typings.semanticUiTab.anon.PickImplactivePartialPick = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplactivePartialPick]
      }
      
      inline def PickImplloadingPartialPic(loading: String): typings.semanticUiTab.anon.PickImplloadingPartialPic = {
        val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplloadingPartialPic]
      }
    }
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
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiTab.anon.PickImplapiPartialPickImp
      - typings.semanticUiTab.anon.PickImplmethodPartialPick
      - typings.semanticUiTab.anon.PickImplmissingTabPartial
      - typings.semanticUiTab.anon.PickImplnoContentPartialP
      - typings.semanticUiTab.anon.PickImplpathPartialPickImApi
      - typings.semanticUiTab.anon.PickImplrecursionPartialP
      - typings.semanticUiTab.anon.PickImplstatePartialPickI
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplapiPartialPickImp(api: String): typings.semanticUiTab.anon.PickImplapiPartialPickImp = {
        val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplapiPartialPickImp]
      }
      
      inline def PickImplmethodPartialPick(method: String): typings.semanticUiTab.anon.PickImplmethodPartialPick = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplmethodPartialPick]
      }
      
      inline def PickImplmissingTabPartial(missingTab: String): typings.semanticUiTab.anon.PickImplmissingTabPartial = {
        val __obj = js.Dynamic.literal(missingTab = missingTab.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplmissingTabPartial]
      }
      
      inline def PickImplnoContentPartialP(noContent: String): typings.semanticUiTab.anon.PickImplnoContentPartialP = {
        val __obj = js.Dynamic.literal(noContent = noContent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplnoContentPartialP]
      }
      
      inline def PickImplpathPartialPickImApi(path: String): typings.semanticUiTab.anon.PickImplpathPartialPickImApi = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplpathPartialPickImApi]
      }
      
      inline def PickImplrecursionPartialP(recursion: String): typings.semanticUiTab.anon.PickImplrecursionPartialP = {
        val __obj = js.Dynamic.literal(recursion = recursion.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplrecursionPartialP]
      }
      
      inline def PickImplstatePartialPickI(state: String): typings.semanticUiTab.anon.PickImplstatePartialPickI = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplstatePartialPickI]
      }
    }
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
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiTab.anon.PickImpltabPartialPickImp
      - typings.semanticUiTab.anon.PickImplloadedPartialPick
      - typings.semanticUiTab.anon.PickImplpromisePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplloadedPartialPick(loaded: String): typings.semanticUiTab.anon.PickImplloadedPartialPick = {
        val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplloadedPartialPick]
      }
      
      inline def PickImplpromisePartialPic(promise: String): typings.semanticUiTab.anon.PickImplpromisePartialPic = {
        val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplpromisePartialPic]
      }
      
      inline def PickImpltabPartialPickImp(tab: String): typings.semanticUiTab.anon.PickImpltabPartialPickImp = {
        val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImpltabPartialPickImp]
      }
    }
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
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiTab.anon.PickImpltabsPartialPickIm
      - typings.semanticUiTab.anon.PickImplparentPartialPick
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplparentPartialPick(parent: String): typings.semanticUiTab.anon.PickImplparentPartialPick = {
        val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImplparentPartialPick]
      }
      
      inline def PickImpltabsPartialPickIm(tabs: String): typings.semanticUiTab.anon.PickImpltabsPartialPickIm = {
        val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiTab.anon.PickImpltabsPartialPickIm]
      }
    }
  }
  type SelectorSettings = typings.semanticUiTab.SemanticUI.Tab.SelectorSettings.Param
  
  /* Inlined semantic-ui-tab.SemanticUI.Tab.TemplatesSettings.Param */
  trait TemplatesSettings extends StObject {
    
    def determineTitle(tabArray: js.Array[Any]): String
    @JSName("determineTitle")
    var determineTitle_Original: js.Function1[/* tabArray */ js.Array[Any], String]
  }
  object TemplatesSettings {
    
    inline def apply(determineTitle: /* tabArray */ js.Array[Any] => String): TemplatesSettings = {
      val __obj = js.Dynamic.literal(determineTitle = js.Any.fromFunction1(determineTitle))
      __obj.asInstanceOf[TemplatesSettings]
    }
    
    trait Impl extends StObject {
      
      /**
        * returns page title
        */
      def determineTitle(tabArray: js.Array[Any]): String
    }
    object Impl {
      
      inline def apply(determineTitle: js.Array[Any] => String): Impl = {
        val __obj = js.Dynamic.literal(determineTitle = js.Any.fromFunction1(determineTitle))
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setDetermineTitle(value: js.Array[Any] => String): Self = StObject.set(x, "determineTitle", js.Any.fromFunction1(value))
      }
    }
    
    extension [Self <: TemplatesSettings](x: Self) {
      
      inline def setDetermineTitle(value: /* tabArray */ js.Array[Any] => String): Self = StObject.set(x, "determineTitle", js.Any.fromFunction1(value))
    }
    
    /* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.TemplatesSettings._Impl, 'determineTitle'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.TemplatesSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.TemplatesSettings._Impl>> */
    trait Param extends StObject {
      
      def determineTitle(tabArray: js.Array[Any]): String
      @JSName("determineTitle")
      var determineTitle_Original: js.Function1[/* tabArray */ js.Array[Any], String]
    }
    object Param {
      
      inline def apply(determineTitle: /* tabArray */ js.Array[Any] => String): typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings.Param = {
        val __obj = js.Dynamic.literal(determineTitle = js.Any.fromFunction1(determineTitle))
        __obj.asInstanceOf[typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings.Param]
      }
      
      extension [Self <: typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings.Param](x: Self) {
        
        inline def setDetermineTitle(value: /* tabArray */ js.Array[Any] => String): Self = StObject.set(x, "determineTitle", js.Any.fromFunction1(value))
      }
    }
  }
}
