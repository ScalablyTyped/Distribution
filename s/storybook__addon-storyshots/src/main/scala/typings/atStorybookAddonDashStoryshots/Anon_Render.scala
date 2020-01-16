package typings.atStorybookAddonDashStoryshots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Render extends js.Object {
  def render(): js.Any
}

object Anon_Render {
  @scala.inline
  def apply(render: () => js.Any): Anon_Render = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[Anon_Render]
  }
}

