package typings.speedtestNet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Download extends js.Object {
  
  var download: IsScalingEnabled = js.native
  
  var stableStop: IsEnabled = js.native
}
object Download {
  
  @scala.inline
  def apply(download: IsScalingEnabled, stableStop: IsEnabled): Download = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], stableStop = stableStop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Download]
  }
  
  @scala.inline
  implicit class DownloadOps[Self <: Download] (val x: Self) extends AnyVal {
    
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
    def setDownload(value: IsScalingEnabled): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStableStop(value: IsEnabled): Self = this.set("stableStop", value.asInstanceOf[js.Any])
  }
}
