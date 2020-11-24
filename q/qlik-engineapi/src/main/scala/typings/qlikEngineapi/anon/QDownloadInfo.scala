package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QDownloadInfo extends js.Object {
  
  var qDownloadInfo: js.Any = js.native
}
object QDownloadInfo {
  
  @scala.inline
  def apply(qDownloadInfo: js.Any): QDownloadInfo = {
    val __obj = js.Dynamic.literal(qDownloadInfo = qDownloadInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDownloadInfo]
  }
  
  @scala.inline
  implicit class QDownloadInfoOps[Self <: QDownloadInfo] (val x: Self) extends AnyVal {
    
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
    def setQDownloadInfo(value: js.Any): Self = this.set("qDownloadInfo", value.asInstanceOf[js.Any])
  }
}
