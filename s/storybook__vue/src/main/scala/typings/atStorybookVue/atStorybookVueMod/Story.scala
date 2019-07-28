package typings.atStorybookVue.atStorybookVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Story extends js.Object {
  val kind: String = js.native
  def add(storyName: String, getStory: StoryFunction): this.type = js.native
  def add(storyName: String, getStory: StoryFunction, parameters: js.Any): this.type = js.native
  def addDecorator(decorator: StoryDecorator): this.type = js.native
  def addParameters(parameters: DecoratorParameters): this.type = js.native
}

