package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.LocationState
import typings.reachRouter.mod.WindowLocation
import typings.react.mod.ReactElement
import typings.storybookApi.mod.ModuleFn
import typings.storybookApi.storeMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonsMod {
  
  @JSImport("@storybook/api/dist/modules/addons", "ensurePanel")
  @js.native
  def ensurePanel(panels: Panels): String = js.native
  @JSImport("@storybook/api/dist/modules/addons", "ensurePanel")
  @js.native
  def ensurePanel(panels: Panels, selectedPanel: js.UndefOr[scala.Nothing], currentPanel: String): String = js.native
  @JSImport("@storybook/api/dist/modules/addons", "ensurePanel")
  @js.native
  def ensurePanel(panels: Panels, selectedPanel: String): String = js.native
  @JSImport("@storybook/api/dist/modules/addons", "ensurePanel")
  @js.native
  def ensurePanel(panels: Panels, selectedPanel: String, currentPanel: String): String = js.native
  
  @JSImport("@storybook/api/dist/modules/addons", "init")
  @js.native
  val init: ModuleFn = js.native
  
  @js.native
  sealed trait types extends StObject
  @JSImport("@storybook/api/dist/modules/addons", "types")
  @js.native
  object types extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[types with String] = js.native
    
    @js.native
    sealed trait NOTES_ELEMENT extends types
    /* "notes-element" */ val NOTES_ELEMENT: typings.storybookApi.addonsMod.types.NOTES_ELEMENT with String = js.native
    
    @js.native
    sealed trait PANEL extends types
    /* "panel" */ val PANEL: typings.storybookApi.addonsMod.types.PANEL with String = js.native
    
    @js.native
    sealed trait PREVIEW extends types
    /* "preview" */ val PREVIEW: typings.storybookApi.addonsMod.types.PREVIEW with String = js.native
    
    @js.native
    sealed trait TAB extends types
    /* "tab" */ val TAB: typings.storybookApi.addonsMod.types.TAB with String = js.native
    
    @js.native
    sealed trait TOOL extends types
    /* "tool" */ val TOOL: typings.storybookApi.addonsMod.types.TOOL with String = js.native
  }
  
  @js.native
  trait Addon extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var `match`: js.UndefOr[js.Function1[/* matchOptions */ MatchOptions, Boolean]] = js.native
    
    var paramKey: js.UndefOr[String] = js.native
    
    def render(renderOptions: RenderOptions): ReactElement = js.native
    
    var route: js.UndefOr[js.Function1[/* routeOptions */ RouteOptions, String]] = js.native
    
    var title: String = js.native
    
    var `type`: js.UndefOr[Types_] = js.native
  }
  object Addon {
    
    @scala.inline
    def apply(render: RenderOptions => ReactElement, title: String): Addon = {
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
      def setMatch(value: /* matchOptions */ MatchOptions => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setParamKey(value: String): Self = StObject.set(x, "paramKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamKeyUndefined: Self = StObject.set(x, "paramKey", js.undefined)
      
      @scala.inline
      def setRender(value: RenderOptions => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoute(value: /* routeOptions */ RouteOptions => String): Self = StObject.set(x, "route", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Types_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Collection[T] = StringDictionary[T]
  
  @js.native
  trait MatchOptions extends StObject {
    
    var location: WindowLocation[LocationState] = js.native
    
    var path: String = js.native
    
    var storyId: String = js.native
    
    var viewMode: ViewMode = js.native
  }
  object MatchOptions {
    
    @scala.inline
    def apply(location: WindowLocation[LocationState], path: String, storyId: String): MatchOptions = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchOptions]
    }
    
    @scala.inline
    implicit class MatchOptionsMutableBuilder[Self <: MatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  type Panels = Collection[Addon]
  
  @js.native
  trait RenderOptions extends StObject {
    
    var active: Boolean = js.native
    
    var key: String = js.native
  }
  object RenderOptions {
    
    @scala.inline
    def apply(active: Boolean, key: String): RenderOptions = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteOptions extends StObject {
    
    var location: WindowLocation[LocationState] = js.native
    
    var path: String = js.native
    
    var storyId: String = js.native
    
    var viewMode: ViewMode = js.native
  }
  object RouteOptions {
    
    @scala.inline
    def apply(location: WindowLocation[LocationState], path: String, storyId: String): RouteOptions = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteOptions]
    }
    
    @scala.inline
    implicit class RouteOptionsMutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  type StateMerger[S] = js.Function1[/* input */ S, S]
  
  @js.native
  trait SubAPI extends StObject {
    
    def getAddonState[S](addonId: String): S = js.native
    
    def getElements[T](`type`: Types_): Collection[T] = js.native
    
    def getPanels(): Panels = js.native
    
    def getSelectedPanel(): String = js.native
    
    def getStoryPanels(): Panels = js.native
    
    def setAddonState[S](addonId: String, newStateOrMerger: S): js.Promise[S] = js.native
    def setAddonState[S](addonId: String, newStateOrMerger: S, options: Options): js.Promise[S] = js.native
    def setAddonState[S](addonId: String, newStateOrMerger: StateMerger[S]): js.Promise[S] = js.native
    def setAddonState[S](addonId: String, newStateOrMerger: StateMerger[S], options: Options): js.Promise[S] = js.native
    
    def setSelectedPanel(panelName: String): Unit = js.native
  }
  
  type Types_ = types | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookApi.storybookApiStrings.story
    - typings.storybookApi.storybookApiStrings.info
    - typings.storybookApi.storybookApiStrings.settings
    - typings.storybookApi.storybookApiStrings.page
    - js.UndefOr[scala.Nothing]
    - java.lang.String
  */
  type ViewMode = js.UndefOr[_ViewMode | String]
  
  trait _ViewMode extends StObject
}
