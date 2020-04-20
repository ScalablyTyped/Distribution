package typings.storybookPreact.typesMod

import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMainArgs extends js.Object {
  var forceRender: Boolean
  var selectedKind: String
  var selectedStory: String
  def showError(args: ShowErrorArgs): Unit
  def showMain(): Unit
  def storyFn(): StoryFn[StoryFnPreactReturnType]
}

object RenderMainArgs {
  @scala.inline
  def apply(
    forceRender: Boolean,
    selectedKind: String,
    selectedStory: String,
    showError: ShowErrorArgs => Unit,
    showMain: () => Unit,
    storyFn: () => StoryFn[StoryFnPreactReturnType]
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], selectedKind = selectedKind.asInstanceOf[js.Any], selectedStory = selectedStory.asInstanceOf[js.Any], showError = js.Any.fromFunction1(showError), showMain = js.Any.fromFunction0(showMain), storyFn = js.Any.fromFunction0(storyFn))
    __obj.asInstanceOf[RenderMainArgs]
  }
}

