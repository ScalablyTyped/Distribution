package typings.atStorybookReactDashNative.distPreviewComponentsStoryListViewMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryListView
  extends Component[Props, State, js.Any] {
  def changeStory(storyId: String): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MStoryListView(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MStoryListView(): Unit = js.native
  def forceReRender(): Unit = js.native
  def handleChangeSearchText(text: String): Unit = js.native
  def handleStoryAdded(): Unit = js.native
}

