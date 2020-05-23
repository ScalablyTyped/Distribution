package typings.rcFieldForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boolean extends js.Object {
  var array: String
  var boolean: String
  var date: String
  var email: String
  var float: String
  var hex: String
  var integer: String
  var method: String
  var number: String
  var `object`: String
  var regexp: String
  var string: String
  var url: String
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
}

