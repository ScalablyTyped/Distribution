package typings.reactMdForm.asyncSwitchMod

import typings.react.mod.CSSProperties
import typings.reactMdForm.switchMod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncSwitchProps extends SwitchProps {
  /**
    * Boolean if the switch is still loading. This will "disable" the switch and
    * add the circular progress indicator in the switch's ball until it is set
    * back to false.
    */
  var loading: Boolean = js.native
  /**
    * An optional class name to apply to the progress bar while the loading state
    * is enabled.
    */
  var progressClassName: js.UndefOr[String] = js.native
  /**
    * An optional style to apply to the progress bar while the loading state is
    * enabled.
    */
  var progressStyle: js.UndefOr[CSSProperties] = js.native
}

object AsyncSwitchProps {
  @scala.inline
  def apply(id: String, loading: Boolean): AsyncSwitchProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncSwitchProps]
  }
  @scala.inline
  implicit class AsyncSwitchPropsOps[Self <: AsyncSwitchProps] (val x: Self) extends AnyVal {
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgressClassName(value: String): Self = this.set("progressClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressClassName: Self = this.set("progressClassName", js.undefined)
    @scala.inline
    def setProgressStyle(value: CSSProperties): Self = this.set("progressStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressStyle: Self = this.set("progressStyle", js.undefined)
  }
  
}

