package typings.stardustUiReactComponentEventListener.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.RefObject
import typings.std.Node
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capture extends js.Object {
  var capture: Requireable[Boolean]
  var listener: Validator[js.Function1[/* repeated */ _, _]]
  var targetRef: Validator[RefObject[Node | Window]]
  var `type`: Validator[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any
  ]
}

object Capture {
  @scala.inline
  def apply(
    capture: Requireable[Boolean],
    listener: Validator[js.Function1[/* repeated */ _, _]],
    targetRef: Validator[RefObject[Node | Window]],
    `type`: Validator[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any
    ]
  ): Capture = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], listener = listener.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capture]
  }
}

