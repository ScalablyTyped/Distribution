package typings.rbx.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Active extends js.Object {
  var active: Requireable[Boolean]
  var clipped: Requireable[Boolean]
  var closeOnBlur: Requireable[Boolean]
  var closeOnEsc: Requireable[Boolean]
  var containerClassName: Requireable[String]
  var document: Requireable[js.Object]
  var onClose: Requireable[js.Function1[/* repeated */ _, _]]
}

object Active {
  @scala.inline
  def apply(
    active: Requireable[Boolean],
    clipped: Requireable[Boolean],
    closeOnBlur: Requireable[Boolean],
    closeOnEsc: Requireable[Boolean],
    containerClassName: Requireable[String],
    document: Requireable[js.Object],
    onClose: Requireable[js.Function1[/* repeated */ _, _]]
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clipped = clipped.asInstanceOf[js.Any], closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any], containerClassName = containerClassName.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
}

