package typings.semanticUiNag

import typings.semanticUiNag.SemanticUI.Nag.AnimationSettings
import typings.semanticUiNag.SemanticUI.Nag.AnimationSettings.Param
import typings.semanticUiNag.SemanticUI.Nag.ClassNameSettings
import typings.semanticUiNag.SemanticUI.Nag.ErrorSettings
import typings.semanticUiNag.SemanticUI.Nag.SelectorSettings
import typings.semanticUiNag.anon.PartialPickImplkeyofImpl
import typings.semanticUiNag.anon.PartialPickImplkeyofImplBottom
import typings.semanticUiNag.anon.PartialPickImplkeyofImplHide
import typings.semanticUiNag.anon.PartialPickImplkeyofImplMethod
import typings.semanticUiNag.anon.PickImplanimation
import typings.semanticUiNag.anon.PickImplbottom
import typings.semanticUiNag.anon.PickImplclassName
import typings.semanticUiNag.anon.PickImplcontext
import typings.semanticUiNag.anon.PickImpldebug
import typings.semanticUiNag.anon.PickImpldetachable
import typings.semanticUiNag.anon.PickImpldisplayTime
import typings.semanticUiNag.anon.PickImpldomain
import typings.semanticUiNag.anon.PickImpleasing
import typings.semanticUiNag.anon.PickImplerror
import typings.semanticUiNag.anon.PickImplexpires
import typings.semanticUiNag.anon.PickImplfixed
import typings.semanticUiNag.anon.PickImplhide
import typings.semanticUiNag.anon.PickImplkey
import typings.semanticUiNag.anon.PickImplmethod
import typings.semanticUiNag.anon.PickImplname
import typings.semanticUiNag.anon.PickImplnamespace
import typings.semanticUiNag.anon.PickImplnoCookieStorage
import typings.semanticUiNag.anon.PickImplnoStorage
import typings.semanticUiNag.anon.PickImplonHide
import typings.semanticUiNag.anon.PickImplpath
import typings.semanticUiNag.anon.PickImplperformance
import typings.semanticUiNag.anon.PickImplpersist
import typings.semanticUiNag.anon.PickImplselector
import typings.semanticUiNag.anon.PickImplshow
import typings.semanticUiNag.anon.PickImplsilent
import typings.semanticUiNag.anon.PickImplspeed
import typings.semanticUiNag.anon.PickImplstorageMethod
import typings.semanticUiNag.anon.PickImplvalue
import typings.semanticUiNag.anon.PickImplverbose
import typings.semanticUiNag.semanticUiNagBooleans.`false`
import typings.semanticUiNag.semanticUiNagStrings.animation
import typings.semanticUiNag.semanticUiNagStrings.className
import typings.semanticUiNag.semanticUiNagStrings.clear
import typings.semanticUiNag.semanticUiNagStrings.context
import typings.semanticUiNag.semanticUiNagStrings.cookie
import typings.semanticUiNag.semanticUiNagStrings.debug
import typings.semanticUiNag.semanticUiNagStrings.destroy
import typings.semanticUiNag.semanticUiNagStrings.detachable
import typings.semanticUiNag.semanticUiNagStrings.displayTime
import typings.semanticUiNag.semanticUiNagStrings.domain
import typings.semanticUiNag.semanticUiNagStrings.easing
import typings.semanticUiNag.semanticUiNagStrings.error
import typings.semanticUiNag.semanticUiNagStrings.expires
import typings.semanticUiNag.semanticUiNagStrings.hide
import typings.semanticUiNag.semanticUiNagStrings.key
import typings.semanticUiNag.semanticUiNagStrings.localstorage
import typings.semanticUiNag.semanticUiNagStrings.name
import typings.semanticUiNag.semanticUiNagStrings.namespace
import typings.semanticUiNag.semanticUiNagStrings.onHide
import typings.semanticUiNag.semanticUiNagStrings.path
import typings.semanticUiNag.semanticUiNagStrings.performance
import typings.semanticUiNag.semanticUiNagStrings.persist
import typings.semanticUiNag.semanticUiNagStrings.selector
import typings.semanticUiNag.semanticUiNagStrings.sessionstorage
import typings.semanticUiNag.semanticUiNagStrings.setting
import typings.semanticUiNag.semanticUiNagStrings.show
import typings.semanticUiNag.semanticUiNagStrings.silent
import typings.semanticUiNag.semanticUiNagStrings.speed
import typings.semanticUiNag.semanticUiNagStrings.storageMethod
import typings.semanticUiNag.semanticUiNagStrings.value
import typings.semanticUiNag.semanticUiNagStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Nag extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Clears cookie so nag shows again
      */
    def apply(behavior: clear): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    def apply(behavior: hide): JQuery = js.native
    def apply(behavior: setting, name: animation, value: AnimationSettings): JQuery = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
    def apply(behavior: setting, name: context, value: String): JQuery = js.native
    def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: detachable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: detachable, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: displayTime, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: displayTime, value: Double): JQuery = js.native
    def apply(behavior: setting, name: domain, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
    def apply(behavior: setting, name: domain, value: String): JQuery = js.native
    def apply(behavior: setting, name: domain, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: easing, value: String): JQuery = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: expires, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: expires, value: Double): JQuery = js.native
    def apply(behavior: setting, name: key, value: js.UndefOr[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['key'] */ js.Any = js.native
    def apply(
      behavior: setting,
      name: key,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['key'] */ js.Any
    ): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: path, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: path, value: String): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: persist, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: persist, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
    def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: speed, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: speed, value: Double): JQuery = js.native
    def apply(behavior: setting, name: storageMethod, value: js.UndefOr[scala.Nothing]): cookie | localstorage | sessionstorage = js.native
    def apply(behavior: setting, name: storageMethod, value: cookie): JQuery = js.native
    def apply(behavior: setting, name: storageMethod, value: localstorage): JQuery = js.native
    def apply(behavior: setting, name: storageMethod, value: sessionstorage): JQuery = js.native
    def apply(behavior: setting, name: value, value: js.UndefOr[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['value'] */ js.Any = js.native
    def apply(
      behavior: setting,
      name: value,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['value'] */ js.Any
    ): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: NagSettings): JQuery = js.native
    def apply(behavior: show): JQuery = js.native
    def apply(settings: NagSettings): JQuery = js.native
    
    var settings: NagSettings = js.native
  }
  object Nag {
    
    object AnimationSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'slide'
          */
        var hide: String = js.native
        
        /**
          * @default 'slide'
          */
        var show: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(hide: String, show: String): Impl = {
          val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplshow | PickImplhide) with PartialPickImplkeyofImplHide
    }
    type AnimationSettings = Param
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'bottom'
          */
        var bottom: String = js.native
        
        /**
          * @default 'fixed'
          */
        var fixed: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(bottom: String, fixed: String): Impl = {
          val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplbottom | PickImplfixed) with PartialPickImplkeyofImplBottom
    }
    type ClassNameSettings = typings.semanticUiNag.SemanticUI.Nag.ClassNameSettings.Param
    
    object ErrorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String = js.native
        
        /**
          * @default '$.cookie is not included. A storage solution is required.'
          */
        var noCookieStorage: String = js.native
        
        /**
          * @default 'Neither $.cookie or store is defined. A storage solution is required for storing state'
          */
        var noStorage: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(method: String, noCookieStorage: String, noStorage: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noCookieStorage = noCookieStorage.asInstanceOf[js.Any], noStorage = noStorage.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoCookieStorage(value: String): Self = StObject.set(x, "noCookieStorage", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoStorage(value: String): Self = StObject.set(x, "noStorage", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplnoCookieStorage | PickImplnoStorage | PickImplmethod) with PartialPickImplkeyofImplMethod
    }
    type ErrorSettings = typings.semanticUiNag.SemanticUI.Nag.ErrorSettings.Param
    
    /* Inlined semantic-ui-nag.SemanticUI.Nag.SelectorSettings.Param */
    @js.native
    trait SelectorSettings extends StObject {
      
      var close: String with js.UndefOr[String] = js.native
    }
    object SelectorSettings {
      
      @scala.inline
      def apply(close: String with js.UndefOr[String]): SelectorSettings = {
        val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
        __obj.asInstanceOf[SelectorSettings]
      }
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '.close.icon'
          */
        var close: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(close: String): Impl = {
          val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.SelectorSettings._Impl, 'close'> & std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.SelectorSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.SelectorSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        var close: String with js.UndefOr[String] = js.native
      }
      object Param {
        
        @scala.inline
        def apply(close: String with js.UndefOr[String]): typings.semanticUiNag.SemanticUI.Nag.SelectorSettings.Param = {
          val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiNag.SemanticUI.Nag.SelectorSettings.Param]
        }
        
        @scala.inline
        implicit class ParamMutableBuilder[Self <: typings.semanticUiNag.SemanticUI.Nag.SelectorSettings.Param] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClose(value: String with js.UndefOr[String]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        }
      }
      
      @scala.inline
      implicit class SelectorSettingsMutableBuilder[Self <: SelectorSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClose(value: String with js.UndefOr[String]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object NagSettings {
    
    @js.native
    trait Impl extends StObject {
      
      var animation: AnimationSettings = js.native
      
      // endregion
      // region DOM Settings
      var className: ClassNameSettings = js.native
      
      /**
        * @default false
        */
      var context: `false` | String | JQuery = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      /**
        * @default false
        */
      var detachable: Boolean = js.native
      
      /**
        * set to zero to require manually dismissal, otherwise hides on its own
        *
        * @default 0
        */
      var displayTime: Double = js.native
      
      /**
        * @default false
        */
      var domain: `false` | String = js.native
      
      /**
        * @default 'easeOutQuad'
        */
      var easing: String = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * @default 30
        */
      var expires: Double = js.native
      
      /**
        * @default 'nag'
        */
      var key: js.Any = js.native
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String = js.native
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String = js.native
      
      // endregion
      // region Callbacks
      def onHide(): Unit = js.native
      
      /**
        * @default '/'
        */
      var path: String = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      // region Behavior
      /**
        * allows cookie to be overridden
        *
        * @default false
        */
      var persist: Boolean = js.native
      
      var selector: SelectorSettings = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * @default 500
        */
      var speed: Double = js.native
      
      /**
        * type of storage to use
        *
        * @default 'cookie'
        */
      var storageMethod: cookie | localstorage | sessionstorage = js.native
      
      /**
        * @default 'dismiss'
        */
      var value: js.Any = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        animation: AnimationSettings,
        className: ClassNameSettings,
        context: `false` | String | JQuery,
        debug: Boolean,
        detachable: Boolean,
        displayTime: Double,
        domain: `false` | String,
        easing: String,
        error: ErrorSettings,
        expires: Double,
        key: js.Any,
        name: String,
        namespace: String,
        onHide: () => Unit,
        path: String,
        performance: Boolean,
        persist: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        speed: Double,
        storageMethod: cookie | localstorage | sessionstorage,
        value: js.Any,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], detachable = detachable.asInstanceOf[js.Any], displayTime = displayTime.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onHide = js.Any.fromFunction0(onHide), path = path.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], persist = persist.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], storageMethod = storageMethod.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnimation(value: AnimationSettings): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContext(value: `false` | String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetachable(value: Boolean): Self = StObject.set(x, "detachable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayTime(value: Double): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomain(value: `false` | String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStorageMethod(value: cookie | localstorage | sessionstorage): Self = StObject.set(x, "storageMethod", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplpersist | PickImpldisplayTime | PickImplanimation | PickImplcontext | PickImpldetachable | PickImplexpires | PickImpldomain | PickImplpath | PickImplstorageMethod | PickImplkey | PickImplvalue | PickImplspeed | PickImpleasing | PickImplonHide | PickImplclassName | PickImplselector | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/nag.html}
    */
  type NagSettings = typings.semanticUiNag.SemanticUI.NagSettings.Param
}
