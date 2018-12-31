package typings
package atStorybookVueLib.vueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Story extends js.Object {
  val kind: java.lang.String
  def add(storyName: java.lang.String, getStory: StoryFunction): this.type
  def addDecorator(decorator: StoryDecorator): this.type
}

