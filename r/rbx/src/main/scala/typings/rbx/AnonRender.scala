package typings.rbx

import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRender extends js.Object {
  var render: Validator[js.Function1[/* repeated */ _, _]]
}

object AnonRender {
  @scala.inline
  def apply(render: Validator[js.Function1[/* repeated */ _, _]]): AnonRender = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRender]
  }
}

