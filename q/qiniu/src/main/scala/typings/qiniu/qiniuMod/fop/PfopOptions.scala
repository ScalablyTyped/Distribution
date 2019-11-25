package typings.qiniu.qiniuMod.fop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PfopOptions extends js.Object {
  /**
    * 结果是否强制覆盖已有的同名文件
    */
  var force: js.UndefOr[Boolean] = js.undefined
  /**
    * 回调业务服务器，通知处理结果
    */
  var notifyURL: js.UndefOr[String] = js.undefined
}

object PfopOptions {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined, notifyURL: String = null): PfopOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (notifyURL != null) __obj.updateDynamic("notifyURL")(notifyURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PfopOptions]
  }
}

