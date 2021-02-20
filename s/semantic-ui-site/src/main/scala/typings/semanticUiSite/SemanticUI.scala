package typings.semanticUiSite

import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings.Param
import typings.semanticUiSite.anon.PartialPickImplkeyofImpl
import typings.semanticUiSite.anon.PartialPickImplkeyofImplCache
import typings.semanticUiSite.anon.PickImplcache
import typings.semanticUiSite.anon.PickImplconfig
import typings.semanticUiSite.anon.PickImpldebug
import typings.semanticUiSite.anon.PickImplmodules
import typings.semanticUiSite.anon.PickImplname
import typings.semanticUiSite.anon.PickImplnamespace
import typings.semanticUiSite.anon.PickImplnamespaceStub
import typings.semanticUiSite.anon.PickImplperformance
import typings.semanticUiSite.anon.PickImplsection
import typings.semanticUiSite.anon.PickImplsections
import typings.semanticUiSite.anon.PickImplsilent
import typings.semanticUiSite.anon.PickImplsiteNamespace
import typings.semanticUiSite.anon.PickImplutilities
import typings.semanticUiSite.anon.PickImplverbose
import typings.semanticUiSite.semanticUiSiteStrings.debug
import typings.semanticUiSite.semanticUiSiteStrings.destroy
import typings.semanticUiSite.semanticUiSiteStrings.modules
import typings.semanticUiSite.semanticUiSiteStrings.name
import typings.semanticUiSite.semanticUiSiteStrings.namespace
import typings.semanticUiSite.semanticUiSiteStrings.namespaceStub
import typings.semanticUiSite.semanticUiSiteStrings.performance
import typings.semanticUiSite.semanticUiSiteStrings.setting
import typings.semanticUiSite.semanticUiSiteStrings.silent
import typings.semanticUiSite.semanticUiSiteStrings.siteNamespace
import typings.semanticUiSite.semanticUiSiteStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Site extends StObject {
    
    def apply(): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: modules, value: js.UndefOr[scala.Nothing]): js.Array[String] = js.native
    def apply(behavior: setting, name: modules, value: js.Array[String]): JQuery = js.native
    def apply(behavior: setting, name: namespaceStub, value: NamespaceStubSettings): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: siteNamespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: siteNamespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: SiteSettings): JQuery = js.native
    def apply(settings: SiteSettings): JQuery = js.native
    
    var settings: SiteSettings = js.native
  }
  object Site {
    
    object NamespaceStubSettings {
      
      @js.native
      trait Impl extends StObject {
        
        var cache: js.Any = js.native
        
        var config: js.Any = js.native
        
        var section: js.Any = js.native
        
        var sections: js.Any = js.native
        
        var utilities: js.Any = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(cache: js.Any, config: js.Any, section: js.Any, sections: js.Any, utilities: js.Any): Impl = {
          val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], utilities = utilities.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSection(value: js.Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSections(value: js.Any): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUtilities(value: js.Any): Self = StObject.set(x, "utilities", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplcache | PickImplconfig | PickImplsections | PickImplsection | PickImplutilities) with PartialPickImplkeyofImplCache
    }
    type NamespaceStubSettings = Param
  }
  
  object SiteSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      var modules: js.Array[String] = js.native
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String = js.native
      
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String = js.native
      
      var namespaceStub: NamespaceStubSettings = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      var siteNamespace: String = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        debug: Boolean,
        modules: js.Array[String],
        name: String,
        namespace: String,
        namespaceStub: NamespaceStubSettings,
        performance: Boolean,
        silent: Boolean,
        siteNamespace: String,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], namespaceStub = namespaceStub.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], siteNamespace = siteNamespace.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespaceStub(value: NamespaceStubSettings): Self = StObject.set(x, "namespaceStub", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSiteNamespace(value: String): Self = StObject.set(x, "siteNamespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplmodules | PickImplsiteNamespace | PickImplnamespaceStub | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  type SiteSettings = typings.semanticUiSite.SemanticUI.SiteSettings.Param
}
