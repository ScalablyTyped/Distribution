package typings.radix64.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodsEnum extends js.Object {
  var BASE64: MethodsString = js.native
  var BASE64ASCII: MethodsString = js.native
  var BASE64NATURAL: MethodsString = js.native
  var BASE64URL: MethodsString = js.native
  var DEFAULT: MethodsString = js.native
}

object MethodsEnum {
  @scala.inline
  def apply(
    BASE64: MethodsString,
    BASE64ASCII: MethodsString,
    BASE64NATURAL: MethodsString,
    BASE64URL: MethodsString,
    DEFAULT: MethodsString
  ): MethodsEnum = {
    val __obj = js.Dynamic.literal(BASE64 = BASE64.asInstanceOf[js.Any], BASE64ASCII = BASE64ASCII.asInstanceOf[js.Any], BASE64NATURAL = BASE64NATURAL.asInstanceOf[js.Any], BASE64URL = BASE64URL.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodsEnum]
  }
  @scala.inline
  implicit class MethodsEnumOps[Self <: MethodsEnum] (val x: Self) extends AnyVal {
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
    def setBASE64(value: MethodsString): Self = this.set("BASE64", value.asInstanceOf[js.Any])
    @scala.inline
    def setBASE64ASCII(value: MethodsString): Self = this.set("BASE64ASCII", value.asInstanceOf[js.Any])
    @scala.inline
    def setBASE64NATURAL(value: MethodsString): Self = this.set("BASE64NATURAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setBASE64URL(value: MethodsString): Self = this.set("BASE64URL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDEFAULT(value: MethodsString): Self = this.set("DEFAULT", value.asInstanceOf[js.Any])
  }
  
}

