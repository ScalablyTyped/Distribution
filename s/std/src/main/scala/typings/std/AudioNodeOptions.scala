package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioNodeOptions extends js.Object {
  var channelCount: js.UndefOr[Double] = js.native
  var channelCountMode: js.UndefOr[ChannelCountMode] = js.native
  var channelInterpretation: js.UndefOr[ChannelInterpretation] = js.native
}

object AudioNodeOptions {
  @scala.inline
  def apply(): AudioNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioNodeOptions]
  }
  @scala.inline
  implicit class AudioNodeOptionsOps[Self <: AudioNodeOptions] (val x: Self) extends AnyVal {
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
    def setChannelCount(value: Double): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelCount: Self = this.set("channelCount", js.undefined)
    @scala.inline
    def setChannelCountMode(value: ChannelCountMode): Self = this.set("channelCountMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelCountMode: Self = this.set("channelCountMode", js.undefined)
    @scala.inline
    def setChannelInterpretation(value: ChannelInterpretation): Self = this.set("channelInterpretation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelInterpretation: Self = this.set("channelInterpretation", js.undefined)
  }
  
}

