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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Site extends StObject {
    
    def apply(): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: debug, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: modules, value: js.Array[String]): JQuery = js.native
    def apply(behavior: setting, name: modules, value: Unit): js.Array[String] = js.native
    def apply(behavior: setting, name: namespaceStub, value: Unit): NamespaceStubSettings = js.native
    def apply(behavior: setting, name: namespaceStub, value: NamespaceStubSettings): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: Unit): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: Unit): String = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: performance, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: Unit): Boolean = js.native
    def apply(behavior: setting, name: siteNamespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: siteNamespace, value: Unit): String = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: Unit): Boolean = js.native
    def apply(behavior: setting, value: SiteSettings): JQuery = js.native
    def apply(settings: SiteSettings): JQuery = js.native
    
    var settings: SiteSettings = js.native
  }
  object Site {
    
    object NamespaceStubSettings {
      
      trait Impl extends StObject {
        
        var cache: js.Any
        
        var config: js.Any
        
        var section: js.Any
        
        var sections: js.Any
        
        var utilities: js.Any
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
      
      type Param = (PickImplcache | PickImplconfig | PickImplsections | PickImplsection | PickImplutilities) & PartialPickImplkeyofImplCache
    }
    type NamespaceStubSettings = Param
  }
  
  object SiteSettings {
    
    trait Impl extends StObject {
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      var modules: js.Array[String]
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String
      
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String
      
      var namespaceStub: NamespaceStubSettings
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      var siteNamespace: String
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
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
    
    type Param = (PickImplmodules | PickImplsiteNamespace | PickImplnamespaceStub | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) & PartialPickImplkeyofImpl
  }
  type SiteSettings = typings.semanticUiSite.SemanticUI.SiteSettings.Param
}
