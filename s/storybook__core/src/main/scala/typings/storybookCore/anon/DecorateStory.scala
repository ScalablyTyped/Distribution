package typings.storybookCore.anon

import typings.storybookAddons.typesMod.DecorateStoryFunction
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecorateStory extends js.Object {
  
  var decorateStory: js.UndefOr[DecorateStoryFunction[_]] = js.native
}
object DecorateStory {
  
  @scala.inline
  def apply(): DecorateStory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorateStory]
  }
  
  @scala.inline
  implicit class DecorateStoryOps[Self <: DecorateStory] (val x: Self) extends AnyVal {
    
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
    def setDecorateStory(value: (/* storyFn */ StoryFn[_], /* decorators */ js.Array[DecoratorFunction[_]]) => StoryFn[_]): Self = this.set("decorateStory", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDecorateStory: Self = this.set("decorateStory", js.undefined)
  }
}
