package typings.storybookAddons

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.storybookAddons.typesMod.Types_
import typings.storybookApi.mod.API
import typings.storybookChannels.mod.ChannelArgs
import typings.storybookRouter.routerMod.RenderData
import typings.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@storybook/addons/dist", "AddonStore")
  @js.native
  class AddonStore () extends StObject {
    
    def add(name: String, addon: Addon): Unit = js.native
    
    def addPanel(name: String, options: Addon): Unit = js.native
    
    var channel: js.Any = js.native
    
    var config: js.Any = js.native
    
    var elements: js.Any = js.native
    
    def getChannel(): typings.storybookChannels.mod.Channel = js.native
    
    def getConfig(): Config = js.native
    
    def getElements(`type`: Types_): Collection = js.native
    
    def hasChannel(): Boolean = js.native
    
    def loadAddons(api: js.Any): Unit = js.native
    
    var loaders: js.Any = js.native
    
    var promise: js.Any = js.native
    
    def ready(): js.Promise[typings.storybookChannels.mod.Channel] = js.native
    
    def register(name: String, registerCallback: js.Function1[/* api */ API, Unit]): Unit = js.native
    
    var resolve: js.Any = js.native
    
    def setChannel(channel: typings.storybookChannels.mod.Channel): Unit = js.native
    
    def setConfig(value: Config): Unit = js.native
  }
  
  @JSImport("@storybook/addons/dist", "Channel")
  @js.native
  class Channel ()
    extends typings.storybookChannels.mod.Channel {
    def this(hasTransportAsync: ChannelArgs) = this()
  }
  
  @JSImport("@storybook/addons/dist", "addons")
  @js.native
  val addons: AddonStore = js.native
  
  @js.native
  trait Addon extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var `match`: js.UndefOr[js.Function1[/* matchOptions */ RenderData, Boolean]] = js.native
    
    var paramKey: js.UndefOr[String] = js.native
    
    def render(renderOptions: RenderOptions): ReactElement = js.native
    
    var route: js.UndefOr[js.Function1[/* routeOptions */ RenderData, String]] = js.native
    
    var title: js.Function0[String] | String = js.native
    
    var `type`: js.UndefOr[Types_] = js.native
  }
  object Addon {
    
    @scala.inline
    def apply(render: RenderOptions => ReactElement, title: js.Function0[String] | String): Addon = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Addon]
    }
    
    @scala.inline
    implicit class AddonMutableBuilder[Self <: Addon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMatch(value: /* matchOptions */ RenderData => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setParamKey(value: String): Self = StObject.set(x, "paramKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamKeyUndefined: Self = StObject.set(x, "paramKey", js.undefined)
      
      @scala.inline
      def setRender(value: RenderOptions => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoute(value: /* routeOptions */ RenderData => String): Self = StObject.set(x, "route", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      @scala.inline
      def setTitle(value: js.Function0[String] | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: Types_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Collection = StringDictionary[Addon]
  
  @js.native
  trait Config
    extends /* key */ StringDictionary[js.Any] {
    
    var theme: js.UndefOr[ThemeVars] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: ThemeVars): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type Loader = js.Function1[/* api */ API, Unit]
  
  @js.native
  trait RenderOptions extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
  }
  object RenderOptions {
    
    @scala.inline
    def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
