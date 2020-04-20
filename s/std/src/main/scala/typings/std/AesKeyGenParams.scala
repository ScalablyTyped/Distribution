package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesKeyGenParams extends Algorithm {
  var length: Double
}

object AesKeyGenParams {
  @scala.inline
  def apply(length: Double, name: java.lang.String): AesKeyGenParams = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesKeyGenParams]
  }
}

