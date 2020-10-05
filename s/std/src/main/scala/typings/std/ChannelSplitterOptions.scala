package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSplitterOptions extends AudioNodeOptions {
  var numberOfOutputs: js.UndefOr[Double] = js.native
}

object ChannelSplitterOptions {
  @scala.inline
  def apply(): ChannelSplitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSplitterOptions]
  }
  @scala.inline
  implicit class ChannelSplitterOptionsOps[Self <: ChannelSplitterOptions] (val x: Self) extends AnyVal {
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
    def setNumberOfOutputs(value: Double): Self = this.set("numberOfOutputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfOutputs: Self = this.set("numberOfOutputs", js.undefined)
  }
  
}

