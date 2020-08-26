package typings.stellarSdk.stellarTomlResolverMod.StellarTomlResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StellarTomlResolveOptions extends js.Object {
  var allowHttp: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object StellarTomlResolveOptions {
  @scala.inline
  def apply(): StellarTomlResolveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StellarTomlResolveOptions]
  }
  @scala.inline
  implicit class StellarTomlResolveOptionsOps[Self <: StellarTomlResolveOptions] (val x: Self) extends AnyVal {
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
    def setAllowHttp(value: Boolean): Self = this.set("allowHttp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHttp: Self = this.set("allowHttp", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

