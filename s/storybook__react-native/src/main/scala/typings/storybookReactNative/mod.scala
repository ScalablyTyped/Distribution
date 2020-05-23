package typings.storybookReactNative

import typings.storybookReactNative.anon.Instantiable
import typings.storybookReactNative.anon.PartialParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react-native/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val addDecorator: js.Any = js.native
  val addParameters: js.Any = js.native
  val clearDecorators: js.Any = js.native
  val getStorybook: js.Any = js.native
  val raw: js.Any = js.native
  val setAddon: js.Any = js.native
  def configure(loadStories: js.Function0[Unit], module: js.Any): Unit = js.native
  def getStorybookUI(): Instantiable = js.native
  def getStorybookUI(params: PartialParams): Instantiable = js.native
  def storiesOf(args: js.Any*): js.Any = js.native
}

