package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.LocationState
import typings.reachRouter.mod.WindowLocation
import typings.react.mod.ReactElement
import typings.storybookApi.mod.ModuleFn
import typings.storybookApi.storeMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonsMod {
  
  @JSImport("@storybook/api/dist/modules/addons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensurePanel(panels: Panels): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensurePanel")(panels.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ensurePanel(panels: Panels, selectedPanel: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePanel")(panels.asInstanceOf[js.Any], selectedPanel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def ensurePanel(panels: Panels, selectedPanel: String, currentPanel: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePanel")(panels.asInstanceOf[js.Any], selectedPanel.asInstanceOf[js.Any], currentPanel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def ensurePanel(panels: Panels, selectedPanel: Unit, currentPanel: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensurePanel")(panels.asInstanceOf[js.Any], selectedPanel.asInstanceOf[js.Any], currentPanel.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@storybook/api/dist/modules/addons", "init")
  @js.native
  val init: ModuleFn = js.native
  
  @js.native
  sealed trait types extends StObject
  @JSImport("@storybook/api/dist/modules/addons", "types")
  @js.native
  object types extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[types & String] = js.native
    
    @js.native
    sealed trait NOTES_ELEMENT
      extends StObject
         with types
    /* "notes-element" */ val NOTES_ELEMENT: typings.storybookApi.addonsMod.types.NOTES_ELEMENT & String = js.native
    
    @js.native
    sealed trait PANEL
      extends StObject
         with types
    /* "panel" */ val PANEL: typings.storybookApi.addonsMod.types.PANEL & String = js.native
    
    @js.native
    sealed trait PREVIEW
      extends StObject
         with types
    /* "preview" */ val PREVIEW: typings.storybookApi.addonsMod.types.PREVIEW & String = js.native
    
    @js.native
    sealed trait TAB
      extends StObject
         with types
    /* "tab" */ val TAB: typings.storybookApi.addonsMod.types.TAB & String = js.native
    
    @js.native
    sealed trait TOOL
      extends StObject
         with types
    /* "tool" */ val TOOL: typings.storybookApi.addonsMod.types.TOOL & String = js.native
  }
  
  trait Addon extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `match`: js.UndefOr[js.Function1[/* matchOptions */ MatchOptions, Boolean]] = js.undefined
    
    var paramKey: js.UndefOr[String] = js.undefined
    
    def render(renderOptions: RenderOptions): ReactElement
    
    var route: js.UndefOr[js.Function1[/* routeOptions */ RouteOptions, String]] = js.undefined
    
    var title: String
    
    var `type`: js.UndefOr[Types_] = js.undefined
  }
  object Addon {
    
    inline def apply(render: RenderOptions => ReactElement, title: String): Addon = {
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
      
      inline def setMatch(value: /* matchOptions */ MatchOptions => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setParamKey(value: String): Self = StObject.set(x, "paramKey", value.asInstanceOf[js.Any])
      
      inline def setParamKeyUndefined: Self = StObject.set(x, "paramKey", js.undefined)
      
      inline def setRender(value: RenderOptions => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRoute(value: /* routeOptions */ RouteOptions => String): Self = StObject.set(x, "route", js.Any.fromFunction1(value))
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: Types_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Collection[T] = StringDictionary[T]
  
  trait MatchOptions extends StObject {
    
    var location: WindowLocation[LocationState]
    
    var path: String
    
    var storyId: String
    
    var viewMode: ViewMode
  }
  object MatchOptions {
    
    inline def apply(location: WindowLocation[LocationState], path: String, storyId: String): MatchOptions = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchOptions]
    }
    
    extension [Self <: MatchOptions](x: Self) {
      
      inline def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  type Panels = Collection[Addon]
  
  trait RenderOptions extends StObject {
    
    var active: Boolean
    
    var key: String
  }
  object RenderOptions {
    
    inline def apply(active: Boolean, key: String): RenderOptions = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteOptions extends StObject {
    
    var location: WindowLocation[LocationState]
    
    var path: String
    
    var storyId: String
    
    var viewMode: ViewMode
  }
  object RouteOptions {
    
    inline def apply(location: WindowLocation[LocationState], path: String, storyId: String): RouteOptions = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteOptions]
    }
    
    extension [Self <: RouteOptions](x: Self) {
      
      inline def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
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
    - scala.Unit
    - java.lang.String
  */
  type ViewMode = js.UndefOr[_ViewMode | String]
  
  trait _ViewMode extends StObject
}
