package typings.storybookUi.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyWrappersProps extends js.Object {
  
  var active: Boolean = js.native
  
  var id: String = js.native
  
  var storyId: String = js.native
  
  var viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any = js.native
  
  var wrappers: js.Array[Wrapper] = js.native
}
object ApplyWrappersProps {
  
  @scala.inline
  def apply(
    active: Boolean,
    id: String,
    storyId: String,
    viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any,
    wrappers: js.Array[Wrapper]
  ): ApplyWrappersProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any], wrappers = wrappers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWrappersProps]
  }
  
  @scala.inline
  implicit class ApplyWrappersPropsOps[Self <: ApplyWrappersProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
    ): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappersVarargs(value: Wrapper*): Self = this.set("wrappers", js.Array(value :_*))
    
    @scala.inline
    def setWrappers(value: js.Array[Wrapper]): Self = this.set("wrappers", value.asInstanceOf[js.Any])
  }
}
