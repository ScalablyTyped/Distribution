package typings.reactCssTransitionReplace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.CSSTransitionGroupProps * / any */ @js.native
trait Props extends js.Object {
  var changeWidth: js.UndefOr[Boolean] = js.native
  var overflowHidden: js.UndefOr[Boolean] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setChangeWidth(value: Boolean): Self = this.set("changeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeWidth: Self = this.set("changeWidth", js.undefined)
    @scala.inline
    def setOverflowHidden(value: Boolean): Self = this.set("overflowHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowHidden: Self = this.set("overflowHidden", js.undefined)
  }
  
}

