package typings.storybookComponents

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStoryFn extends js.Object {
  var storyFn: ElementType[_]
}

object AnonStoryFn {
  @scala.inline
  def apply(storyFn: ElementType[_]): AnonStoryFn = {
    val __obj = js.Dynamic.literal(storyFn = storyFn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStoryFn]
  }
}

