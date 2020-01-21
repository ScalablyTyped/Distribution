package typings.storybookHtml.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorybookStory extends js.Object {
  var name: String
  def render(): js.Any
}

object IStorybookStory {
  @scala.inline
  def apply(name: String, render: () => js.Any): IStorybookStory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[IStorybookStory]
  }
}

