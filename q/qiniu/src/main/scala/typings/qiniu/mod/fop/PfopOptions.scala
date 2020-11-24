package typings.qiniu.mod.fop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PfopOptions extends js.Object {
  
  /**
    * 结果是否强制覆盖已有的同名文件
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * 回调业务服务器，通知处理结果
    */
  var notifyURL: js.UndefOr[String] = js.native
}
object PfopOptions {
  
  @scala.inline
  def apply(): PfopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PfopOptions]
  }
  
  @scala.inline
  implicit class PfopOptionsOps[Self <: PfopOptions] (val x: Self) extends AnyVal {
    
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setNotifyURL(value: String): Self = this.set("notifyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyURL: Self = this.set("notifyURL", js.undefined)
  }
}
