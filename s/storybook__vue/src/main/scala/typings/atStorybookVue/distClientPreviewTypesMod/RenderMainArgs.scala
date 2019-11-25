package typings.atStorybookVue.distClientPreviewTypesMod

import typings.atStorybookAddons.distTypesMod.StoryContext
import typings.atStorybookAddons.distTypesMod.StoryFn
import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMainArgs extends js.Object {
  var forceRender: Boolean
  var selectedKind: String
  var selectedStory: String
  var storyFn: StoryFn[VueConstructor[Vue]]
  def showError(args: ShowErrorArgs): Unit
  def showException(args: js.Any*): Unit
  def showMain(): Unit
}

object RenderMainArgs {
  @scala.inline
  def apply(
    forceRender: Boolean,
    selectedKind: String,
    selectedStory: String,
    showError: ShowErrorArgs => Unit,
    showException: /* repeated */ js.Any => Unit,
    showMain: () => Unit,
    storyFn: /* p */ js.UndefOr[StoryContext] => VueConstructor[Vue]
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], selectedKind = selectedKind.asInstanceOf[js.Any], selectedStory = selectedStory.asInstanceOf[js.Any], showError = js.Any.fromFunction1(showError), showException = js.Any.fromFunction1(showException), showMain = js.Any.fromFunction0(showMain), storyFn = js.Any.fromFunction1(storyFn))
  
    __obj.asInstanceOf[RenderMainArgs]
  }
}

