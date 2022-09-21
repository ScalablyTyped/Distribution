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
    
    inline def apply(config: RadiumConfig): js.Function1[/* component */ js.UndefOr[Any], Any] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ js.UndefOr[Any], Any]]
    // @Radium decorator
    inline def apply[TElement /* <: js.Function */](component: TElement): TElement = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[TElement]
    
    @JSImport("radium", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("radium", "default.Style")
    @js.native
    open class Style ()
      extends Component[StyleProps, js.Object, Any]
    
    @JSImport("radium", "default.StyleRoot")
    @js.native
    open class StyleRoot ()
      extends Component[StyleRootProps, js.Object, Any]
    
    @JSImport("radium", "default.TestMode")
    @js.native
    def TestMode: RadiumTestMode = js.native
    inline def TestMode_=(x: RadiumTestMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TestMode")(x.asInstanceOf[js.Any])
    
    inline def getState(state: Any, elementKey: String, value: Colonactive | Colonfocus | Colonhover): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(state.asInstanceOf[js.Any], elementKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def getState(state: Any, elementKey: Unit, value: Colonactive | Colonfocus | Colonhover): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(state.asInstanceOf[js.Any], elementKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def keyframes(keyframes: StyleRules): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(keyframes.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    inline def keyframes(keyframes: StyleRules, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(keyframes.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
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
      var plugins: js.UndefOr[js.Array[Any]] = js.undefined
      
      /**
        * Set the user agent passed to inline-style-prefixer to perform prefixing on style objects.
        * Mainly used during server rendering
        */
      var userAgent: js.UndefOr[String] = js.undefined
    }
    object RadiumConfig {
      
      inline def apply(): RadiumConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RadiumConfig]
      }
      
      extension [Self <: RadiumConfig](x: Self) {
        
        inline def setMatchMedia(value: /* mediaQuery */ String => MediaQueryList): Self = StObject.set(x, "matchMedia", js.Any.fromFunction1(value))
        
        inline def setMatchMediaUndefined: Self = StObject.set(x, "matchMedia", js.undefined)
        
        inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
        
        inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
        
        inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
        
        inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
        
        inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
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
      
      inline def apply(clearState: () => Unit, disable: () => Unit, enable: () => Unit): RadiumTestMode = {
        val __obj = js.Dynamic.literal(clearState = js.Any.fromFunction0(clearState), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
        __obj.asInstanceOf[RadiumTestMode]
      }
      
      extension [Self <: RadiumTestMode](x: Self) {
        
        inline def setClearState(value: () => Unit): Self = StObject.set(x, "clearState", js.Any.fromFunction0(value))
        
        inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
        
        inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      }
    }
    
    type Style = Component[StyleProps, js.Object, Any]
    
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
      
      inline def apply(rules: CSSProperties | StyleRules): StyleProps = {
        val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
        __obj.asInstanceOf[StyleProps]
      }
      
      extension [Self <: StyleProps](x: Self) {
        
        inline def setRules(value: CSSProperties | StyleRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
        
        inline def setScopeSelector(value: String): Self = StObject.set(x, "scopeSelector", value.asInstanceOf[js.Any])
        
        inline def setScopeSelectorUndefined: Self = StObject.set(x, "scopeSelector", js.undefined)
      }
    }
    
    type StyleRoot = Component[StyleRootProps, js.Object, Any]
    
    trait StyleRootProps
      extends StObject
         with HTMLProps[StyleRoot] {
      
      var radiumConfig: js.UndefOr[RadiumConfig] = js.undefined
    }
    object StyleRootProps {
      
      inline def apply(): StyleRootProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StyleRootProps]
      }
      
      extension [Self <: StyleRootProps](x: Self) {
        
        inline def setRadiumConfig(value: RadiumConfig): Self = StObject.set(x, "radiumConfig", value.asInstanceOf[js.Any])
        
        inline def setRadiumConfigUndefined: Self = StObject.set(x, "radiumConfig", js.undefined)
      }
    }
    
    trait StyleRules
      extends StObject
         with /* index */ StringDictionary[CSSProperties | StyleRules]
    object StyleRules {
      
      inline def apply(): StyleRules = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StyleRules]
      }
    }
  }
}
