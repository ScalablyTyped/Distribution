package typings.storybookAddonStoryshots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRender extends js.Object {
  def render(): js.Any
}

object AnonRender {
  @scala.inline
  def apply(render: () => js.Any): AnonRender = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[AnonRender]
  }
}

