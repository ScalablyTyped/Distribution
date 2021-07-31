package typings.radium

import org.scalablytyped.runtime.StringDictionary
import typings.radium.mod.Radium.RadiumConfig
import typings.radium.mod.Radium.RadiumTestMode
import typings.radium.mod.Radium.StyleProps
import typings.radium.mod.Radium.StyleRootProps
import typings.radium.mod.Radium.StyleRules
import typings.radium.radiumStrings.Colonactive
import typings.radium.radiumStrings.Colonfocus
import typings.radium.radiumStrings.Colonhover
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.MediaQueryList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @scala.inline
    def apply(config: RadiumConfig): js.Function1[/* component */ js.UndefOr[js.Any], js.Any] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ js.UndefOr[js.Any], js.Any]]
    // @Radium decorator
    @scala.inline
    def apply[TElement /* <: js.Function */](component: TElement): TElement = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[TElement]
    
    @JSImport("radium", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("radium", "default.Style")
    @js.native
    class Style ()
      extends Component[StyleProps, js.Object, js.Any]
    
    @JSImport("radium", "default.StyleRoot")
    @js.native
    class StyleRoot ()
      extends Component[StyleRootProps, js.Object, js.Any]
    
    @JSImport("radium", "default.TestMode")
    @js.native
    def TestMode: RadiumTestMode = js.native
    @scala.inline
    def TestMode_=(x: RadiumTestMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TestMode")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getState_active(state: js.Any, elementKey: String, value: Colonactive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(state.asInstanceOf[js.Any], elementKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def getState_active(state: js.Any, elementKey: Unit, value: Colonactive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(state.asInstanceOf[js.Any], elementKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def getState_focus(state: js.Any, elementKey: String, value: Colonfocus): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(state.asInstanceOf[js.Any], elementKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def getState_focus(state: js.Any, elementKey: Unit, value: Colonfocus): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(state.asInstanceOf[js.Any], elementKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def getState_hover(state: js.Any, elementKey: String, value: Colonhover): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(state.asInstanceOf[js.Any], elementKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def getState_hover(state: js.Any, elementKey: Unit, value: Colonhover): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(state.asInstanceOf[js.Any], elementKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def keyframes(keyframes: StyleRules): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(keyframes.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    @scala.inline
    def keyframes(keyframes: StyleRules, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(keyframes.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  }
  
  object Radium {
    
    trait RadiumConfig extends StObject {
      
      /**
        * Allow to replace matchMedia function that Radium uses. The default one is window.matchMedia
        * @param mediaQuery
        */
      var matchMedia: js.UndefOr[js.Function1[/* mediaQuery */ String, MediaQueryList]] = js.undefined
      
      /**
        * List of plugins
        */
      var plugins: js.UndefOr[js.Array[js.Any]] = js.undefined
      
      /**
        * Set the user agent passed to inline-style-prefixer to perform prefixing on style objects.
        * Mainly used during server rendering
        */
      var userAgent: js.UndefOr[String] = js.undefined
    }
    object RadiumConfig {
      
      @scala.inline
      def apply(): RadiumConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RadiumConfig]
      }
      
      @scala.inline
      implicit class RadiumConfigMutableBuilder[Self <: RadiumConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMatchMedia(value: /* mediaQuery */ String => MediaQueryList): Self = StObject.set(x, "matchMedia", js.Any.fromFunction1(value))
        
        @scala.inline
        def setMatchMediaUndefined: Self = StObject.set(x, "matchMedia", js.undefined)
        
        @scala.inline
        def setPlugins(value: js.Array[js.Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
        
        @scala.inline
        def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
        
        @scala.inline
        def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      }
    }
    
    // Radium 0.17 Test mode
    /**
      * Used to control internal Radium state and behavior during tests. It is only available in non-production builds.
      */
    trait RadiumTestMode extends StObject {
      
      /**
        * Clears the global Radium state, currently only the cache of media query listeners.
        */
      def clearState(): Unit
      
      /**
        * Disables "test mode"
        */
      def disable(): Unit
      
      /**
        * Enables "test mode", which doesn’t throw or warn as much. Currently it just doesn’t throw when using addCSS without StyleRoot.
        */
      def enable(): Unit
    }
    object RadiumTestMode {
      
      @scala.inline
      def apply(clearState: () => Unit, disable: () => Unit, enable: () => Unit): RadiumTestMode = {
        val __obj = js.Dynamic.literal(clearState = js.Any.fromFunction0(clearState), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
        __obj.asInstanceOf[RadiumTestMode]
      }
      
      @scala.inline
      implicit class RadiumTestModeMutableBuilder[Self <: RadiumTestMode] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClearState(value: () => Unit): Self = StObject.set(x, "clearState", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      }
    }
    
    type Style = Component[StyleProps, js.Object, js.Any]
    
    trait StyleProps extends StObject {
      
      /**
        * An object of styles, or an object of CSS rules to render. Each key of the rules object is a CSS
        * selector and the value is an object of styles. If rules is empty, the component will render nothing.
        */
      var rules: CSSProperties | StyleRules
      
      /**
        * A string that any included selectors in rules will be appended to.
        * Use to scope styles in the component to a particular element. A good use case might be to generate a unique
        * ID for a component to scope any styles to the particular component that owns the <Style> component instance.
        */
      var scopeSelector: js.UndefOr[String] = js.undefined
    }
    object StyleProps {
      
      @scala.inline
      def apply(rules: CSSProperties | StyleRules): StyleProps = {
        val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
        __obj.asInstanceOf[StyleProps]
      }
      
      @scala.inline
      implicit class StylePropsMutableBuilder[Self <: StyleProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRules(value: CSSProperties | StyleRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeSelector(value: String): Self = StObject.set(x, "scopeSelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeSelectorUndefined: Self = StObject.set(x, "scopeSelector", js.undefined)
      }
    }
    
    @js.native
    trait StyleRoot
      extends Component[StyleRootProps, js.Object, js.Any]
    
    trait StyleRootProps
      extends StObject
         with HTMLProps[StyleRoot] {
      
      var radiumConfig: js.UndefOr[RadiumConfig] = js.undefined
    }
    object StyleRootProps {
      
      @scala.inline
      def apply(): StyleRootProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StyleRootProps]
      }
      
      @scala.inline
      implicit class StyleRootPropsMutableBuilder[Self <: StyleRootProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRadiumConfig(value: RadiumConfig): Self = StObject.set(x, "radiumConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRadiumConfigUndefined: Self = StObject.set(x, "radiumConfig", js.undefined)
      }
    }
    
    trait StyleRules
      extends StObject
         with /* index */ StringDictionary[CSSProperties | StyleRules]
    object StyleRules {
      
      @scala.inline
      def apply(): StyleRules = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StyleRules]
      }
    }
  }
}
