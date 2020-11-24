package typings.storybookAddonInfo.mod

import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapStoryProps extends js.Object {
  
  var context: js.UndefOr[js.Object] = js.native
  
  var options: js.UndefOr[js.Object] = js.native
  
  var storyFn: js.UndefOr[StoryFn[_]] = js.native
}
object WrapStoryProps {
  
  @scala.inline
  def apply(): WrapStoryProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrapStoryProps]
  }
  
  @scala.inline
  implicit class WrapStoryPropsOps[Self <: WrapStoryProps] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = this.set("storyFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = this.set("storyFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoryFn(value: StoryFn[_]): Self = this.set("storyFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoryFn: Self = this.set("storyFn", js.undefined)
  }
}
