package typings.rbx.anon

import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render extends js.Object {
  var render: Validator[js.Function1[/* repeated */ _, _]]
}

object Render {
  @scala.inline
  def apply(render: Validator[js.Function1[/* repeated */ _, _]]): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
}

