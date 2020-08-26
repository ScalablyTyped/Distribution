package typings.senchaTouch.Ext.draw.gradient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinear extends IGradient {
  /** [Config Option] (Number) */
  var The: js.UndefOr[Double] = js.native
}

object ILinear {
  @scala.inline
  def apply(): ILinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILinear]
  }
  @scala.inline
  implicit class ILinearOps[Self <: ILinear] (val x: Self) extends AnyVal {
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
    def setThe(value: Double): Self = this.set("The", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThe: Self = this.set("The", js.undefined)
  }
  
}

