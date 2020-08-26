package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'verbose'> */
@js.native
trait PickImplverbose extends js.Object {
  var verbose: Boolean = js.native
}

object PickImplverbose {
  @scala.inline
  def apply(verbose: Boolean): PickImplverbose = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplverbose]
  }
  @scala.inline
  implicit class PickImplverboseOps[Self <: PickImplverbose] (val x: Self) extends AnyVal {
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
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

