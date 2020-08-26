package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DhKeyDeriveParams extends Algorithm {
  var public: CryptoKey = js.native
}

object DhKeyDeriveParams {
  @scala.inline
  def apply(name: java.lang.String, public: CryptoKey): DhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhKeyDeriveParams]
  }
  @scala.inline
  implicit class DhKeyDeriveParamsOps[Self <: DhKeyDeriveParams] (val x: Self) extends AnyVal {
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
    def setPublic(value: CryptoKey): Self = this.set("public", value.asInstanceOf[js.Any])
  }
  
}

