package typings
package atStorybookVueLib.atStorybookVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Story extends js.Object {
  val kind: java.lang.String = js.native
  def add(storyName: java.lang.String, getStory: StoryFunction): this.type = js.native
  def add(storyName: java.lang.String, getStory: StoryFunction, parameters: js.Any): this.type = js.native
  def addDecorator(decorator: StoryDecorator): this.type = js.native
  def addParameters(parameters: DecoratorParameters): this.type = js.native
}

