package typings.atStorybookPreact.atStorybookPreactMod

import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/preact", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDecorator(decorator: StoryDecorator): Unit = js.native
  def addParameters(parameters: DecoratorParameters): Unit = js.native
  def clearDecorators(): Unit = js.native
  def configure(fn: js.Function0[Unit], module: NodeModule): Unit = js.native
  def forceReRender(): Unit = js.native
  def getStorybook(): js.Array[StoryBucket] = js.native
  def setAddon(addon: js.Object): Unit = js.native
  def storiesOf(name: String, module: NodeModule): Story = js.native
  @JSName("storiesOf")
  def storiesOf_T_Intersection[T](name: String, module: NodeModule): Story with T = js.native
}

