package typings.sortablejs.pluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwapOptions extends js.Object {
  /**
    * Enable swap mode
    */
  var swap: js.UndefOr[Boolean] = js.native
  /**
    * Class name for swap item (if swap mode is enabled)
    */
  var swapClass: js.UndefOr[String] = js.native
}

object SwapOptions {
  @scala.inline
  def apply(): SwapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwapOptions]
  }
  @scala.inline
  implicit class SwapOptionsOps[Self <: SwapOptions] (val x: Self) extends AnyVal {
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
    def setSwap(value: Boolean): Self = this.set("swap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwap: Self = this.set("swap", js.undefined)
    @scala.inline
    def setSwapClass(value: String): Self = this.set("swapClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwapClass: Self = this.set("swapClass", js.undefined)
  }
  
}

