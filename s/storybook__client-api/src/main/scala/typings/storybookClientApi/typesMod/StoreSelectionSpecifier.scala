package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.ViewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreSelectionSpecifier extends js.Object {
  
  var storySpecifier: StorySpecifier = js.native
  
  var viewMode: ViewMode = js.native
}
object StoreSelectionSpecifier {
  
  @scala.inline
  def apply(storySpecifier: StorySpecifier, viewMode: ViewMode): StoreSelectionSpecifier = {
    val __obj = js.Dynamic.literal(storySpecifier = storySpecifier.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSelectionSpecifier]
  }
  
  @scala.inline
  implicit class StoreSelectionSpecifierOps[Self <: StoreSelectionSpecifier] (val x: Self) extends AnyVal {
    
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
    def setStorySpecifier(value: StorySpecifier): Self = this.set("storySpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
}
