package typings
package radix64Lib.radix64Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodsEnum extends js.Object {
  var BASE64: radix64Lib.MethodsString
  var BASE64ASCII: radix64Lib.MethodsString
  var BASE64NATURAL: radix64Lib.MethodsString
  var BASE64URL: radix64Lib.MethodsString
  var DEFAULT: radix64Lib.MethodsString
}

object MethodsEnum {
  @scala.inline
  def apply(
    BASE64: radix64Lib.MethodsString,
    BASE64ASCII: radix64Lib.MethodsString,
    BASE64NATURAL: radix64Lib.MethodsString,
    BASE64URL: radix64Lib.MethodsString,
    DEFAULT: radix64Lib.MethodsString
  ): MethodsEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BASE64")(BASE64)
    __obj.updateDynamic("BASE64ASCII")(BASE64ASCII)
    __obj.updateDynamic("BASE64NATURAL")(BASE64NATURAL)
    __obj.updateDynamic("BASE64URL")(BASE64URL)
    __obj.updateDynamic("DEFAULT")(DEFAULT)
    __obj.asInstanceOf[MethodsEnum]
  }
}

