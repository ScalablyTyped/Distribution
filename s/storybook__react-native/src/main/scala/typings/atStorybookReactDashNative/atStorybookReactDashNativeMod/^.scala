package typings.atStorybookReactDashNative.atStorybookReactDashNativeMod

import typings.atStorybookReact.atStorybookReactMod.DecoratorParameters
import typings.atStorybookReact.atStorybookReactMod.Story
import typings.atStorybookReact.atStorybookReactMod.StoryBucket
import typings.atStorybookReact.atStorybookReactMod.StoryDecorator
import typings.node.NodeModule
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react-native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDecorator(decorator: StoryDecorator): Unit = js.native
  def addParameters(parameters: DecoratorParameters): Unit = js.native
  def clearDecorators(): Unit = js.native
  def configure(fn: js.Function0[Unit], module: NodeModule): Unit = js.native
  def forceReRender(): Unit = js.native
  def getStorybook(): js.Array[StoryBucket] = js.native
  def getStorybookUI(options: StorybookUIOptions): ComponentClass[js.Object, ComponentState] = js.native
  def setAddon(addon: js.Object): Unit = js.native
  def storiesOf(name: String, module: NodeModule): Story = js.native
  @JSName("storiesOf")
  def storiesOf_T_Intersection[T](name: String, module: NodeModule): Story with T = js.native
}

