package typings.storybookAddonA11y.tagsMod

import typings.axeCore.mod.TagValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsProps extends js.Object {
  
  var tags: js.Array[TagValue] = js.native
}
object TagsProps {
  
  @scala.inline
  def apply(tags: js.Array[TagValue]): TagsProps = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsProps]
  }
  
  @scala.inline
  implicit class TagsPropsOps[Self <: TagsProps] (val x: Self) extends AnyVal {
    
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
    def setTagsVarargs(value: TagValue*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[TagValue]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
