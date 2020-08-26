package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, 'looping'> */
@js.native
trait PickImpllooping extends js.Object {
  var looping: String = js.native
}

object PickImpllooping {
  @scala.inline
  def apply(looping: String): PickImpllooping = {
    val __obj = js.Dynamic.literal(looping = looping.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllooping]
  }
  @scala.inline
  implicit class PickImplloopingOps[Self <: PickImpllooping] (val x: Self) extends AnyVal {
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
    def setLooping(value: String): Self = this.set("looping", value.asInstanceOf[js.Any])
  }
  
}

