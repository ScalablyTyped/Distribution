package typings.qiniuDashJs.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable extends js.Object {
  /**
  	 * 订阅
  	 *
  	 * @param next 接收上传进度信息
  	 * @param error 上传错误后触发；自动重试本身并不会触发该错误，而当重试次数到达上限后则可以触发。当不是 xhr 请求错误时，会把当前错误产生原因直接抛出，诸如 JSON 解析异常等；当产生 xhr 请求错误时，参数 err 为一个包含 code、message、isRequestError 三个属性的 object
  	 * @param complete 接收上传完成后的后端返回信息，具体返回结构取决于后端sdk的配置，可参考[上传策略](https://developer.qiniu.com/kodo/manual/1206/put-policy)。
  	 * @returns
  	 */
  def subscribe(next: js.Function1[/* obj */ Next, Unit]): Subscription = js.native
  def subscribe(next: js.Function1[/* obj */ Next, Unit], error: js.Function1[/* err */ Error | String, Unit]): Subscription = js.native
  def subscribe(
    next: js.Function1[/* obj */ Next, Unit],
    error: js.Function1[/* err */ Error | String, Unit],
    complete: js.Function1[/* obj */ CompletedResult, Unit]
  ): Subscription = js.native
  def subscribe(options: Observer): Subscription = js.native
}

