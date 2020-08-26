package typings.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaGroupProps extends AreaBaseProps {
  /**
    * Specify `width` and `height` to be able to use percentage values in transforms.
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Specify `width` and `height` to be able to use percentage values in transforms.
    */
  var width: js.UndefOr[Double | String] = js.native
}

object AreaGroupProps {
  @scala.inline
  def apply(): AreaGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaGroupProps]
  }
  @scala.inline
  implicit class AreaGroupPropsOps[Self <: AreaGroupProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

