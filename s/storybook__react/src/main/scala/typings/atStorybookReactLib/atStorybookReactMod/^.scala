package typings
package atStorybookReactLib.atStorybookReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDecorator(decorator: StoryDecorator): scala.Unit = js.native
  def addParameters(parameters: DecoratorParameters): scala.Unit = js.native
  def clearDecorators(): scala.Unit = js.native
  def configure(fn: js.Function0[scala.Unit], module: nodeLib.NodeModule): scala.Unit = js.native
  def forceReRender(): scala.Unit = js.native
  def getStorybook(): js.Array[StoryBucket] = js.native
  def setAddon(addon: js.Object): scala.Unit = js.native
  def storiesOf(name: java.lang.String, module: nodeLib.NodeModule): Story = js.native
  @JSName("storiesOf")
  def `storiesOf_T<intersection>`[T](name: java.lang.String, module: nodeLib.NodeModule): Story with T = js.native
}

