package typings
package atStorybookReactLib.atStorybookReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Story extends js.Object {
  val kind: java.lang.String = js.native
  def add(storyName: java.lang.String, callback: RenderFunction): this.type = js.native
  def add(storyName: java.lang.String, callback: RenderFunction, parameters: DecoratorParameters): this.type = js.native
  def addDecorator(decorator: StoryDecorator): this.type = js.native
  def addParameters(parameters: DecoratorParameters): this.type = js.native
}

