package typings.serviceworkerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerDefaultOption extends js.Object {
  var assets: js.Array[String] = js.native
}

object ServiceWorkerDefaultOption {
  @scala.inline
  def apply(assets: js.Array[String]): ServiceWorkerDefaultOption = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerDefaultOption]
  }
  @scala.inline
  implicit class ServiceWorkerDefaultOptionOps[Self <: ServiceWorkerDefaultOption] (val x: Self) extends AnyVal {
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
    def setAssetsVarargs(value: String*): Self = this.set("assets", js.Array(value :_*))
    @scala.inline
    def setAssets(value: js.Array[String]): Self = this.set("assets", value.asInstanceOf[js.Any])
  }
  
}

