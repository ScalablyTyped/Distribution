package typings.reactOverlays.autoAffixMod

import typings.react.mod.ReactInstance
import typings.reactOverlays.affixMod.AffixProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoAffixProps extends AffixProps {
  /**
    * Automatically set width when affixed
    */
  var autoWidth: js.UndefOr[Boolean] = js.native
  /**
    * The logical container node or component for determining offset from bottom
    * of viewport, or a function that returns it
    */
  var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance]] = js.native
}

object AutoAffixProps {
  @scala.inline
  def apply(): AutoAffixProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoAffixProps]
  }
  @scala.inline
  implicit class AutoAffixPropsOps[Self <: AutoAffixProps] (val x: Self) extends AnyVal {
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
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    @scala.inline
    def setContainerFunction0(value: () => ReactInstance): Self = this.set("container", js.Any.fromFunction0(value))
    @scala.inline
    def setContainer(value: ReactInstance | js.Function0[ReactInstance]): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
  }
  
}

