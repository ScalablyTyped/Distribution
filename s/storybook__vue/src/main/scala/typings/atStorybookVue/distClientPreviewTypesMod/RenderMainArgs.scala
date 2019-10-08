package typings.atStorybookVue.distClientPreviewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMainArgs extends js.Object {
  var forceRender: Boolean
  var selectedKind: String
  var selectedStory: String
  var storyFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn<VueConstructor> */ js.Any
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
    storyFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn<VueConstructor> */ js.Any
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender, selectedKind = selectedKind, selectedStory = selectedStory, showError = js.Any.fromFunction1(showError), showException = js.Any.fromFunction1(showException), showMain = js.Any.fromFunction0(showMain), storyFn = storyFn)
  
    __obj.asInstanceOf[RenderMainArgs]
  }
}

