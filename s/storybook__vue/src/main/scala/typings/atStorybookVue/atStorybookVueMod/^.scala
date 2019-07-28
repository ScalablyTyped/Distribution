package typings.atStorybookVue.atStorybookVueMod

import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/vue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDecorator(decorator: StoryDecorator): Unit = js.native
  def addParameters(parameters: DecoratorParameters): Unit = js.native
  def configure(loaders: js.Function0[Unit], module: NodeModule): Unit = js.native
  def getStorybook(): js.Array[StoryStore] = js.native
  def setAddon(addon: Addon): Unit = js.native
  def storiesOf(kind: String, module: NodeModule): Story = js.native
}

