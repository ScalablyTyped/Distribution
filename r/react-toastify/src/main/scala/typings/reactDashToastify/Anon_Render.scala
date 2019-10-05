package typings.reactDashToastify

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Render extends js.Object {
  var render: ReactNode
}

object Anon_Render {
  @scala.inline
  def apply(render: ReactNode = null): Anon_Render = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Render]
  }
}

