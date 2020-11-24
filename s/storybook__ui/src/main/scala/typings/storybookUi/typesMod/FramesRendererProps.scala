package typings.storybookUi.typesMod

import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.Story
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FramesRendererProps extends js.Object {
  
  var baseUrl: String = js.native
  
  var queryParams: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['customQueryParams'] */ js.Any = js.native
  
  var refId: String = js.native
  
  var refs: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any = js.native
  
  var scale: Double = js.native
  
  var story: Story | Group = js.native
  
  var storyId: String = js.native
  
  var viewMode: ViewMode = js.native
}
object FramesRendererProps {
  
  @scala.inline
  def apply(
    baseUrl: String,
    queryParams: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['customQueryParams'] */ js.Any,
    refId: String,
    refs: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any,
    scale: Double,
    story: Story | Group,
    storyId: String,
    viewMode: ViewMode
  ): FramesRendererProps = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FramesRendererProps]
  }
  
  @scala.inline
  implicit class FramesRendererPropsOps[Self <: FramesRendererProps] (val x: Self) extends AnyVal {
    
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['customQueryParams'] */ js.Any
    ): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any
    ): Self = this.set("refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory(value: Story | Group): Self = this.set("story", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
}
