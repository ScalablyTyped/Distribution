package typings.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderSizeMarginProps extends LoaderSizeProps {
  var margin: js.UndefOr[LengthType] = js.native
}

object LoaderSizeMarginProps {
  @scala.inline
  def apply(): LoaderSizeMarginProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderSizeMarginProps]
  }
  @scala.inline
  implicit class LoaderSizeMarginPropsOps[Self <: LoaderSizeMarginProps] (val x: Self) extends AnyVal {
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
    def setMargin(value: LengthType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
  }
  
}

