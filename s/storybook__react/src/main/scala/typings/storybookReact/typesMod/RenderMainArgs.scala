package typings.storybookReact.typesMod

import typings.react.mod.FunctionComponent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderMainArgs extends js.Object {
  var forceRender: Boolean = js.native
  var selectedKind: String = js.native
  var selectedStory: String = js.native
  var storyFn: FunctionComponent[_] = js.native
  def showError(args: ShowErrorArgs): Unit = js.native
  def showException(err: Error): Unit = js.native
  def showMain(): Unit = js.native
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
    def setShowException(value: Error => Unit): Self = this.set("showException", js.Any.fromFunction1(value))
    @scala.inline
    def setShowMain(value: () => Unit): Self = this.set("showMain", js.Any.fromFunction0(value))
    @scala.inline
    def setStoryFn(value: FunctionComponent[_]): Self = this.set("storyFn", value.asInstanceOf[js.Any])
  }
  
}

