package typings.storybookUi

import typings.history.mod.LocationState
import typings.reachRouter.mod.WindowLocation
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.Record
import typings.storybookApi.mod.API
import typings.storybookApi.refsMod.Refs
import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.Story
import typings.storybookApi.urlMod.QueryParams
import typings.storybookUi.anon.IsFullscreenIsToolshown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ApplyWrappersProps extends StObject {
    
    var active: Boolean
    
    var id: String
    
    var storyId: String
    
    var viewMode: typings.storybookApi.modulesStoriesMod.ViewMode & js.UndefOr[String]
    
    var wrappers: js.Array[Wrapper]
  }
  object ApplyWrappersProps {
    
    inline def apply(
      active: Boolean,
      id: String,
      storyId: String,
      viewMode: typings.storybookApi.modulesStoriesMod.ViewMode & js.UndefOr[String],
      wrappers: js.Array[Wrapper]
    ): ApplyWrappersProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any], wrappers = wrappers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyWrappersProps]
    }
    
    extension [Self <: ApplyWrappersProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: typings.storybookApi.modulesStoriesMod.ViewMode & js.UndefOr[String]): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setWrappers(value: js.Array[Wrapper]): Self = StObject.set(x, "wrappers", value.asInstanceOf[js.Any])
      
      inline def setWrappersVarargs(value: Wrapper*): Self = StObject.set(x, "wrappers", js.Array(value :_*))
    }
  }
  
  type CustomCanvasRenderer = js.Function6[
    /* storyId */ String, 
    /* viewMode */ typings.storybookApi.modulesStoriesMod.ViewMode & js.UndefOr[String], 
    /* id */ String, 
    /* baseUrl */ String, 
    /* scale */ Double, 
    /* queryParams */ Record[String, js.Any], 
    ReactNode
  ]
  
  trait FramesRendererProps extends StObject {
    
    var baseUrl: String
    
    var queryParams: QueryParams
    
    var refId: String
    
    var refs: Refs
    
    var scale: Double
    
    var story: Story | Group
    
    var storyId: String
    
    var viewMode: ViewMode
  }
  object FramesRendererProps {
    
    inline def apply(
      baseUrl: String,
      queryParams: QueryParams,
      refId: String,
      refs: Refs,
      scale: Double,
      story: Story | Group,
      storyId: String,
      viewMode: ViewMode
    ): FramesRendererProps = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[FramesRendererProps]
    }
    
    extension [Self <: FramesRendererProps](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setQueryParams(value: QueryParams): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefs(value: Refs): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setStory(value: Story | Group): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviewProps extends StObject {
    
    var api: API
    
    var baseUrl: String
    
    var customCanvas: js.UndefOr[CustomCanvasRenderer] = js.undefined
    
    var description: String
    
    var docsOnly: Boolean
    
    var id: String
    
    var location: WindowLocation[LocationState]
    
    var options: IsFullscreenIsToolshown
    
    var path: String
    
    var queryParams: QueryParams
    
    var refs: Refs
    
    var story: Group | Story
    
    var viewMode: ViewMode
    
    var withLoader: Boolean
  }
  object PreviewProps {
    
    inline def apply(
      api: API,
      baseUrl: String,
      description: String,
      docsOnly: Boolean,
      id: String,
      location: WindowLocation[LocationState],
      options: IsFullscreenIsToolshown,
      path: String,
      queryParams: QueryParams,
      refs: Refs,
      story: Group | Story,
      viewMode: ViewMode,
      withLoader: Boolean
    ): PreviewProps = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], docsOnly = docsOnly.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any], withLoader = withLoader.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewProps]
    }
    
    extension [Self <: PreviewProps](x: Self) {
      
      inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setCustomCanvas(
        value: (/* storyId */ String, /* viewMode */ typings.storybookApi.modulesStoriesMod.ViewMode & js.UndefOr[String], /* id */ String, /* baseUrl */ String, /* scale */ Double, /* queryParams */ Record[String, js.Any]) => ReactNode
      ): Self = StObject.set(x, "customCanvas", js.Any.fromFunction6(value))
      
      inline def setCustomCanvasUndefined: Self = StObject.set(x, "customCanvas", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: IsFullscreenIsToolshown): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQueryParams(value: QueryParams): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setRefs(value: Refs): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setStory(value: Group | Story): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setWithLoader(value: Boolean): Self = StObject.set(x, "withLoader", value.asInstanceOf[js.Any])
    }
  }
  
  type ViewMode = typings.storybookApi.modulesStoriesMod.ViewMode & js.UndefOr[String]
  
  trait Wrapper extends StObject {
    
    var render: FunctionComponent[WrapperProps]
  }
  object Wrapper {
    
    inline def apply(render: FunctionComponent[WrapperProps]): Wrapper = {
      val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wrapper]
    }
    
    extension [Self <: Wrapper](x: Self) {
      
      inline def setRender(value: FunctionComponent[WrapperProps]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
  
  trait WrapperProps extends StObject {
    
    var active: Boolean
    
    var children: ReactNode
    
    var id: String
    
    var index: Double
    
    var storyId: String
  }
  object WrapperProps {
    
    inline def apply(active: Boolean, id: String, index: Double, storyId: String): WrapperProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperProps]
    }
    
    extension [Self <: WrapperProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    }
  }
}
