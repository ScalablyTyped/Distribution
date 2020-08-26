package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpts extends js.Object {
  /**
  	 * Whether or not to unwrap the value if it happens to be wrapped, returning the original value. Defaults to true.
  	 */
  var unwrap: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether or not to include links and computations in the output. This creates a deep copy of the data, so changing any of it directly will have no effect on the data in Ractive's models. Defaults to true for root data and false everywhere else.
  	 */
  var virtual: js.UndefOr[Boolean] = js.native
}

object GetOpts {
  @scala.inline
  def apply(): GetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpts]
  }
  @scala.inline
  implicit class GetOptsOps[Self <: GetOpts] (val x: Self) extends AnyVal {
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
    def setUnwrap(value: Boolean): Self = this.set("unwrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnwrap: Self = this.set("unwrap", js.undefined)
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
  
}

