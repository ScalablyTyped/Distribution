package typings.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/story_store.StoryOptions & {  normalizeParameters :boolean | undefined} */
@js.native
trait StoryOptionsnormalizePara extends js.Object {
  
  var includeDocsOnly: js.UndefOr[Boolean] = js.native
  
  var normalizeParameters: js.UndefOr[Boolean] = js.native
}
object StoryOptionsnormalizePara {
  
  @scala.inline
  def apply(): StoryOptionsnormalizePara = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoryOptionsnormalizePara]
  }
  
  @scala.inline
  implicit class StoryOptionsnormalizeParaOps[Self <: StoryOptionsnormalizePara] (val x: Self) extends AnyVal {
    
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
    def setIncludeDocsOnly(value: Boolean): Self = this.set("includeDocsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDocsOnly: Self = this.set("includeDocsOnly", js.undefined)
    
    @scala.inline
    def setNormalizeParameters(value: Boolean): Self = this.set("normalizeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeParameters: Self = this.set("normalizeParameters", js.undefined)
  }
}
