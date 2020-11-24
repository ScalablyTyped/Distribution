package typings.storybookUi.typesMod

import typings.react.mod.ReactNode
import typings.std.Record
import typings.storybookApi.mod.API
import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.Story
import typings.storybookUi.anon.IsFullscreenIsToolshown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewProps extends js.Object {
  
  var api: API = js.native
  
  var baseUrl: String = js.native
  
  var customCanvas: js.UndefOr[CustomCanvasRenderer] = js.native
  
  var description: String = js.native
  
  var docsOnly: Boolean = js.native
  
  var id: String = js.native
  
  var location: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['location'] */ js.Any = js.native
  
  var options: IsFullscreenIsToolshown = js.native
  
  var path: String = js.native
  
  var queryParams: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['customQueryParams'] */ js.Any = js.native
  
  var refs: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any = js.native
  
  var story: Group | Story = js.native
  
  var viewMode: ViewMode = js.native
  
  var withLoader: Boolean = js.native
}
object PreviewProps {
  
  @scala.inline
  def apply(
    api: API,
    baseUrl: String,
    description: String,
    docsOnly: Boolean,
    id: String,
    location: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['location'] */ js.Any,
    options: IsFullscreenIsToolshown,
    path: String,
    queryParams: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['customQueryParams'] */ js.Any,
    refs: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any,
    story: Group | Story,
    viewMode: ViewMode,
    withLoader: Boolean
  ): PreviewProps = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], docsOnly = docsOnly.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any], withLoader = withLoader.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewProps]
  }
  
  @scala.inline
  implicit class PreviewPropsOps[Self <: PreviewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApi(value: API): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsOnly(value: Boolean): Self = this.set("docsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['location'] */ js.Any
    ): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: IsFullscreenIsToolshown): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['customQueryParams'] */ js.Any
    ): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any
    ): Self = this.set("refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory(value: Group | Story): Self = this.set("story", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithLoader(value: Boolean): Self = this.set("withLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCanvas(
      value: (/* storyId */ String, /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ /* viewMode */ js.Any, /* id */ String, /* baseUrl */ String, /* scale */ Double, /* queryParams */ Record[String, js.Any]) => ReactNode
    ): Self = this.set("customCanvas", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteCustomCanvas: Self = this.set("customCanvas", js.undefined)
  }
}
