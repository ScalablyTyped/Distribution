package typings.storybookCsf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeExcludeOptions extends js.Object {
  
  var excludeStories: js.UndefOr[StoryDescriptor] = js.native
  
  var includeStories: js.UndefOr[StoryDescriptor] = js.native
}
object IncludeExcludeOptions {
  
  @scala.inline
  def apply(): IncludeExcludeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeExcludeOptions]
  }
  
  @scala.inline
  implicit class IncludeExcludeOptionsOps[Self <: IncludeExcludeOptions] (val x: Self) extends AnyVal {
    
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
    def setExcludeStoriesVarargs(value: String*): Self = this.set("excludeStories", js.Array(value :_*))
    
    @scala.inline
    def setExcludeStories(value: StoryDescriptor): Self = this.set("excludeStories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeStories: Self = this.set("excludeStories", js.undefined)
    
    @scala.inline
    def setIncludeStoriesVarargs(value: String*): Self = this.set("includeStories", js.Array(value :_*))
    
    @scala.inline
    def setIncludeStories(value: StoryDescriptor): Self = this.set("includeStories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeStories: Self = this.set("includeStories", js.undefined)
  }
}
