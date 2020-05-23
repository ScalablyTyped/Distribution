package typings.storybookAddonStoryshots.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render extends js.Object {
  def render(): js.Any
}

object Render {
  @scala.inline
  def apply(render: () => js.Any): Render = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[Render]
  }
}

