package typings.stardustUiReactComponentEventListener.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.RefObject
import typings.std.Node
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capture extends js.Object {
  var capture: Requireable[Boolean] = js.native
  var listener: Validator[js.Function1[/* repeated */ _, _]] = js.native
  var targetRef: Validator[RefObject[Node | Window]] = js.native
  var `type`: Validator[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any
  ] = js.native
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
  @scala.inline
  implicit class CaptureOps[Self <: Capture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapture(value: Requireable[Boolean]): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def setListener(value: Validator[js.Function1[/* repeated */ _, _]]): Self = this.set("listener", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetRef(value: Validator[RefObject[Node | Window]]): Self = this.set("targetRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(
      value: Validator[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any
        ]
    ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

