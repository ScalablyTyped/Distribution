package typings.reactNativeModalPopover.anon

import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: Validator[js.Function1[/* repeated */ _, _]]
}

object Children {
  @scala.inline
  def apply(children: Validator[js.Function1[/* repeated */ _, _]]): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

