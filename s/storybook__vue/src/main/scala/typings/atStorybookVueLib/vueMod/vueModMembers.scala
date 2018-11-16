package typings
package atStorybookVueLib.vueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/vue", JSImport.Namespace)
@js.native
object vueModMembers extends js.Object {
  def addDecorator(decorator: StoryDecorator): scala.Unit = js.native
  def configure(loaders: js.Function0[scala.Unit], module: nodeLib.NodeModule): scala.Unit = js.native
  def getStorybook(): js.Array[StoryStore] = js.native
  def setAddon(addon: Addon): scala.Unit = js.native
  def storiesOf(kind: java.lang.String, module: nodeLib.NodeModule): Story = js.native
}

