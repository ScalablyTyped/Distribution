package typings.storybookAddons

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.storybookAddons.typesMod.Types_
import typings.storybookApi.mod.API
import typings.storybookChannels.mod.ChannelArgs
import typings.storybookRouter.mod.RenderData
import typings.storybookTheming.mod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ts39Mod {
  
  @JSImport("@storybook/addons/dist/ts3.9", "AddonStore")
  @js.native
  open class AddonStore () extends StObject {
    
    def add(name: String, addon: Addon): Unit = js.native
    
    def addPanel(name: String, options: Addon): Unit = js.native
    
    /* private */ var channel: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var elements: Any = js.native
    
    def getChannel(): typings.storybookChannels.mod.Channel = js.native
    
    def getConfig(): Config = js.native
    
    def getElements(`type`: Types_): Collection = js.native
    
    def getServerChannel(): typings.storybookChannels.mod.Channel = js.native
    
    def hasChannel(): Boolean = js.native
    
    def hasServerChannel(): Boolean = js.native
    
    def loadAddons(api: Any): Unit = js.native
    
    /* private */ var loaders: Any = js.native
    
    /* private */ var promise: Any = js.native
    
    def ready(): js.Promise[typings.storybookChannels.mod.Channel] = js.native
    
    def register(name: String, registerCallback: js.Function1[/* api */ API, Unit]): Unit = js.native
    
    /* private */ var resolve: Any = js.native
    
    /* private */ var serverChannel: Any = js.native
    
    def setChannel(channel: typings.storybookChannels.mod.Channel): Unit = js.native
    
    def setConfig(value: Config): Unit = js.native
    
    def setServerChannel(channel: typings.storybookChannels.mod.Channel): Unit = js.native
  }
  
  @JSImport("@storybook/addons/dist/ts3.9", "Channel")
  @js.native
  open class Channel ()
    extends typings.storybookChannels.mod.Channel {
    def this(hasTransportAsync: ChannelArgs) = this()
  }
  
  @JSImport("@storybook/addons/dist/ts3.9", "addons")
  @js.native
  val addons: AddonStore = js.native
  
  trait Addon extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `match`: js.UndefOr[js.Function1[/* matchOptions */ RenderData, Boolean]] = js.undefined
    
    var paramKey: js.UndefOr[String] = js.undefined
    
    def render(renderOptions: RenderOptions): ReactElement
    
    var route: js.UndefOr[js.Function1[/* routeOptions */ RenderData, String]] = js.undefined
    
    var title: js.Function0[String] | String
    
    var `type`: js.UndefOr[Types_] = js.undefined
  }
  object Addon {
    
    inline def apply(render: RenderOptions => ReactElement, title: js.Function0[String] | String): Addon = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Addon]
    }
    
    extension [Self <: Addon](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMatch(value: /* matchOptions */ RenderData => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setParamKey(value: String): Self = StObject.set(x, "paramKey", value.asInstanceOf[js.Any])
      
      inline def setParamKeyUndefined: Self = StObject.set(x, "paramKey", js.undefined)
      
      inline def setRender(value: RenderOptions => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRoute(value: /* routeOptions */ RenderData => String): Self = StObject.set(x, "route", js.Any.fromFunction1(value))
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setTitle(value: js.Function0[String] | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setType(value: Types_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Collection = StringDictionary[Addon]
  
  trait Config
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var theme: js.UndefOr[ThemeVars] = js.undefined
    
    var toolbar: js.UndefOr[StringDictionary[ToolbarConfig]] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setTheme(value: ThemeVars): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setToolbar(value: StringDictionary[ToolbarConfig]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    }
  }
  
  type Loader = js.Function1[/* api */ API, Unit]
  
  trait RenderOptions extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
  }
  object RenderOptions {
    
    inline def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait ToolbarConfig extends StObject {
    
    var hidden: js.UndefOr[Boolean] = js.undefined
  }
  object ToolbarConfig {
    
    inline def apply(): ToolbarConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarConfig]
    }
    
    extension [Self <: ToolbarConfig](x: Self) {
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    }
  }
}
