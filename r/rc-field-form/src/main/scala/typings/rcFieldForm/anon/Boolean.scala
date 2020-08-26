package typings.rcFieldForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boolean extends js.Object {
  var array: String = js.native
  var boolean: String = js.native
  var date: String = js.native
  var email: String = js.native
  var float: String = js.native
  var hex: String = js.native
  var integer: String = js.native
  var method: String = js.native
  var number: String = js.native
  var `object`: String = js.native
  var regexp: String = js.native
  var string: String = js.native
  var url: String = js.native
}

object Boolean {
  @scala.inline
  def apply(
    array: String,
    boolean: String,
    date: String,
    email: String,
    float: String,
    hex: String,
    integer: String,
    method: String,
    number: String,
    `object`: String,
    regexp: String,
    string: String,
    url: String
  ): Boolean = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
  @scala.inline
  implicit class BooleanOps[Self <: Boolean] (val x: Self) extends AnyVal {
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
    def setArray(value: String): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoolean(value: String): Self = this.set("boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloat(value: String): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setInteger(value: String): Self = this.set("integer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegexp(value: String): Self = this.set("regexp", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

