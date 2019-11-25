package typings.radix64.radix64Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodsEnum extends js.Object {
  var BASE64: MethodsString
  var BASE64ASCII: MethodsString
  var BASE64NATURAL: MethodsString
  var BASE64URL: MethodsString
  var DEFAULT: MethodsString
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
}

