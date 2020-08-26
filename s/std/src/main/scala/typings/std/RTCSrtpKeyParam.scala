package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCSrtpKeyParam extends js.Object {
  var keyMethod: js.UndefOr[java.lang.String] = js.native
  var keySalt: js.UndefOr[java.lang.String] = js.native
  var lifetime: js.UndefOr[java.lang.String] = js.native
  var mkiLength: js.UndefOr[Double] = js.native
  var mkiValue: js.UndefOr[Double] = js.native
}

object RTCSrtpKeyParam {
  @scala.inline
  def apply(): RTCSrtpKeyParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSrtpKeyParam]
  }
  @scala.inline
  implicit class RTCSrtpKeyParamOps[Self <: RTCSrtpKeyParam] (val x: Self) extends AnyVal {
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
    def setKeyMethod(value: java.lang.String): Self = this.set("keyMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyMethod: Self = this.set("keyMethod", js.undefined)
    @scala.inline
    def setKeySalt(value: java.lang.String): Self = this.set("keySalt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySalt: Self = this.set("keySalt", js.undefined)
    @scala.inline
    def setLifetime(value: java.lang.String): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifetime: Self = this.set("lifetime", js.undefined)
    @scala.inline
    def setMkiLength(value: Double): Self = this.set("mkiLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMkiLength: Self = this.set("mkiLength", js.undefined)
    @scala.inline
    def setMkiValue(value: Double): Self = this.set("mkiValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMkiValue: Self = this.set("mkiValue", js.undefined)
  }
  
}

