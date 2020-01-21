package typings.storybookReact.typesMod

import typings.react.mod.FunctionComponent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMainArgs extends js.Object {
  var forceRender: Boolean
  var selectedKind: String
  var selectedStory: String
  var storyFn: FunctionComponent[_]
  def showError(args: ShowErrorArgs): Unit
  def showException(err: Error): Unit
  def showMain(): Unit
}

object RenderMainArgs {
  @scala.inline
  def apply(
    forceRender: Boolean,
    selectedKind: String,
    selectedStory: String,
    showError: ShowErrorArgs => Unit,
    showException: Error => Unit,
    showMain: () => Unit,
    storyFn: FunctionComponent[_]
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], selectedKind = selectedKind.asInstanceOf[js.Any], selectedStory = selectedStory.asInstanceOf[js.Any], showError = js.Any.fromFunction1(showError), showException = js.Any.fromFunction1(showException), showMain = js.Any.fromFunction0(showMain), storyFn = storyFn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderMainArgs]
  }
}

