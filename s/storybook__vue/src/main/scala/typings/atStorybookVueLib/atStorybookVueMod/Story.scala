package typings
package atStorybookVueLib.atStorybookVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Story extends js.Object {
  val kind: java.lang.String
  def add(storyName: java.lang.String, getStory: StoryFunction): this.type
  def addDecorator(decorator: StoryDecorator): this.type
  def addParameters(parameters: DecoratorParameters): this.type
}

object Story {
  @scala.inline
  def apply(
    add: (java.lang.String, StoryFunction) => Story,
    addDecorator: StoryDecorator => Story,
    addParameters: DecoratorParameters => Story,
    kind: java.lang.String
  ): Story = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), kind = kind)
  
    __obj.asInstanceOf[Story]
  }
}

