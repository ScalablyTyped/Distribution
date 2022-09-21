package typings.reactIntl

import typings.formatjsIntl.srcCreateIntlMod.CreateIntlFn
import typings.formatjsIntl.srcTypesMod.IntlCache
import typings.react.mod.PropsWithChildren
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactIntl.anon.PartialState
import typings.reactIntl.anon.PickResolvedIntlConfigonE
import typings.reactIntl.anon.ReadonlyIntlConfig
import typings.reactIntl.srcTypesMod.IntlConfig
import typings.reactIntl.srcTypesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsProviderMod {
  
  @JSImport("react-intl/src/components/provider", JSImport.Default)
  @js.native
  open class default () extends IntlProvider
  /* static members */
  object default {
    
    @JSImport("react-intl/src/components/provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/src/components/provider", "default.defaultProps")
    @js.native
    def defaultProps: PickResolvedIntlConfigonE = js.native
    inline def defaultProps_=(x: PickResolvedIntlConfigonE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/components/provider", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: ReadonlyIntlConfig, hasPrevConfigCache: State): PartialState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], hasPrevConfigCache.asInstanceOf[js.Any])).asInstanceOf[PartialState | Null]
  }
  
  @JSImport("react-intl/src/components/provider", "createIntl")
  @js.native
  val createIntl: CreateIntlFn[ReactNode, IntlConfig, IntlShape] = js.native
  
  @js.native
  trait IntlProvider extends PureComponent[PropsWithChildren[IntlConfig], State, Any] {
    
    /* private */ var cache: Any = js.native
  }
  
  trait State extends StObject {
    
    /**
      * Explicit intl cache to prevent memory leaks
      */
    var cache: IntlCache
    
    /**
      * Intl object we created
      */
    var intl: js.UndefOr[IntlShape] = js.undefined
    
    /**
      * list of memoized config we care about.
      * This is important since creating intl is
      * very expensive
      */
    var prevConfig: IntlConfig
  }
  object State {
    
    inline def apply(cache: IntlCache, prevConfig: IntlConfig): State = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], prevConfig = prevConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCache(value: IntlCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
      
      inline def setIntlUndefined: Self = StObject.set(x, "intl", js.undefined)
      
      inline def setPrevConfig(value: IntlConfig): Self = StObject.set(x, "prevConfig", value.asInstanceOf[js.Any])
    }
  }
}
