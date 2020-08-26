package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.ValidateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array extends js.Object {
  var array: js.UndefOr[ValidateMessage] = js.native
  var boolean: js.UndefOr[ValidateMessage] = js.native
  var date: js.UndefOr[ValidateMessage] = js.native
  var email: js.UndefOr[ValidateMessage] = js.native
  var float: js.UndefOr[ValidateMessage] = js.native
  var hex: js.UndefOr[ValidateMessage] = js.native
  var integer: js.UndefOr[ValidateMessage] = js.native
  var method: js.UndefOr[ValidateMessage] = js.native
  var number: js.UndefOr[ValidateMessage] = js.native
  var `object`: js.UndefOr[ValidateMessage] = js.native
  var regexp: js.UndefOr[ValidateMessage] = js.native
  var string: js.UndefOr[ValidateMessage] = js.native
  var url: js.UndefOr[ValidateMessage] = js.native
}

object Array {
  @scala.inline
  def apply(): Array = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Array]
  }
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
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
    def setArrayFunction0(value: () => String): Self = this.set("array", js.Any.fromFunction0(value))
    @scala.inline
    def setArray(value: ValidateMessage): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    @scala.inline
    def setBooleanFunction0(value: () => String): Self = this.set("boolean", js.Any.fromFunction0(value))
    @scala.inline
    def setBoolean(value: ValidateMessage): Self = this.set("boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    @scala.inline
    def setDateFunction0(value: () => String): Self = this.set("date", js.Any.fromFunction0(value))
    @scala.inline
    def setDate(value: ValidateMessage): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setEmailFunction0(value: () => String): Self = this.set("email", js.Any.fromFunction0(value))
    @scala.inline
    def setEmail(value: ValidateMessage): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFloatFunction0(value: () => String): Self = this.set("float", js.Any.fromFunction0(value))
    @scala.inline
    def setFloat(value: ValidateMessage): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def setHexFunction0(value: () => String): Self = this.set("hex", js.Any.fromFunction0(value))
    @scala.inline
    def setHex(value: ValidateMessage): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHex: Self = this.set("hex", js.undefined)
    @scala.inline
    def setIntegerFunction0(value: () => String): Self = this.set("integer", js.Any.fromFunction0(value))
    @scala.inline
    def setInteger(value: ValidateMessage): Self = this.set("integer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteger: Self = this.set("integer", js.undefined)
    @scala.inline
    def setMethodFunction0(value: () => String): Self = this.set("method", js.Any.fromFunction0(value))
    @scala.inline
    def setMethod(value: ValidateMessage): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setNumberFunction0(value: () => String): Self = this.set("number", js.Any.fromFunction0(value))
    @scala.inline
    def setNumber(value: ValidateMessage): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setObjectFunction0(value: () => String): Self = this.set("object", js.Any.fromFunction0(value))
    @scala.inline
    def setObject(value: ValidateMessage): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setRegexpFunction0(value: () => String): Self = this.set("regexp", js.Any.fromFunction0(value))
    @scala.inline
    def setRegexp(value: ValidateMessage): Self = this.set("regexp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    @scala.inline
    def setStringFunction0(value: () => String): Self = this.set("string", js.Any.fromFunction0(value))
    @scala.inline
    def setString(value: ValidateMessage): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    @scala.inline
    def setUrlFunction0(value: () => String): Self = this.set("url", js.Any.fromFunction0(value))
    @scala.inline
    def setUrl(value: ValidateMessage): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

