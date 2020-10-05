package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMergerOptions extends AudioNodeOptions {
  var numberOfInputs: js.UndefOr[Double] = js.native
}

object ChannelMergerOptions {
  @scala.inline
  def apply(): ChannelMergerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMergerOptions]
  }
  @scala.inline
  implicit class ChannelMergerOptionsOps[Self <: ChannelMergerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNumberOfInputs(value: Double): Self = this.set("numberOfInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfInputs: Self = this.set("numberOfInputs", js.undefined)
  }
  
}

