package typings
package atStorybookVueLib.atStorybookVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/vue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDecorator(decorator: atStorybookVueLib.atStorybookVueMod.StoryDecorator): scala.Unit = js.native
  def configure(loaders: js.Function0[scala.Unit], module: nodeLib.NodeModule): scala.Unit = js.native
  def getStorybook(): js.Array[atStorybookVueLib.atStorybookVueMod.StoryStore] = js.native
  def setAddon(addon: atStorybookVueLib.atStorybookVueMod.Addon): scala.Unit = js.native
  def storiesOf(kind: java.lang.String, module: nodeLib.NodeModule): atStorybookVueLib.atStorybookVueMod.Story = js.native
}

