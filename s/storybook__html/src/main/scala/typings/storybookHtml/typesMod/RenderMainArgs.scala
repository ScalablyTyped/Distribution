package typings.storybookHtml.typesMod

import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderMainArgs extends js.Object {
  var forceRender: Boolean = js.native
  var selectedKind: String = js.native
  var selectedStory: String = js.native
  def showError(args: ShowErrorArgs): Unit = js.native
  def showMain(): Unit = js.native
  def storyFn(): StoryFn[StoryFnHtmlReturnType] = js.native
}

object RenderMainArgs {
  @scala.inline
  def apply(
    forceRender: Boolean,
    selectedKind: String,
    selectedStory: String,
    showError: ShowErrorArgs => Unit,
    showMain: () => Unit,
    storyFn: () => StoryFn[StoryFnHtmlReturnType]
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], selectedKind = selectedKind.asInstanceOf[js.Any], selectedStory = selectedStory.asInstanceOf[js.Any], showError = js.Any.fromFunction1(showError), showMain = js.Any.fromFunction0(showMain), storyFn = js.Any.fromFunction0(storyFn))
    __obj.asInstanceOf[RenderMainArgs]
  }
  @scala.inline
  implicit class RenderMainArgsOps[Self <: RenderMainArgs] (val x: Self) extends AnyVal {
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
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedKind(value: String): Self = this.set("selectedKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedStory(value: String): Self = this.set("selectedStory", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowError(value: ShowErrorArgs => Unit): Self = this.set("showError", js.Any.fromFunction1(value))
    @scala.inline
    def setShowMain(value: () => Unit): Self = this.set("showMain", js.Any.fromFunction0(value))
    @scala.inline
    def setStoryFn(value: () => StoryFn[StoryFnHtmlReturnType]): Self = this.set("storyFn", js.Any.fromFunction0(value))
  }
  
}

