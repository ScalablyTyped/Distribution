package typings
package atStorybookVueLib.atStorybookVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Story extends js.Object {
  val kind: java.lang.String
  def add(storyName: java.lang.String, getStory: StoryFunction): this.type
  def addDecorator(decorator: StoryDecorator): this.type
}

object Story {
  @scala.inline
  def apply(
    add: js.Function2[java.lang.String, StoryFunction, Story],
    addDecorator: js.Function1[StoryDecorator, Story],
    kind: java.lang.String
  ): Story = {
    val __obj = js.Dynamic.literal(add = add, addDecorator = addDecorator, kind = kind)
  
    __obj.asInstanceOf[Story]
  }
}

