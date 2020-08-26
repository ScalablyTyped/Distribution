package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndeterminateProgressProperties extends ViewProps {
  var progressAniDuration: js.UndefOr[Double] = js.native
  var progressColor: js.UndefOr[String] = js.native
}

object IndeterminateProgressProperties {
  @scala.inline
  def apply(): IndeterminateProgressProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndeterminateProgressProperties]
  }
  @scala.inline
  implicit class IndeterminateProgressPropertiesOps[Self <: IndeterminateProgressProperties] (val x: Self) extends AnyVal {
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
    def setProgressAniDuration(value: Double): Self = this.set("progressAniDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressAniDuration: Self = this.set("progressAniDuration", js.undefined)
    @scala.inline
    def setProgressColor(value: String): Self = this.set("progressColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressColor: Self = this.set("progressColor", js.undefined)
  }
  
}

