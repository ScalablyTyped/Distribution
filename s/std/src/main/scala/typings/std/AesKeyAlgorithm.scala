package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesKeyAlgorithm extends KeyAlgorithm {
  var length: Double
}

object AesKeyAlgorithm {
  @scala.inline
  def apply(length: Double, name: java.lang.String): AesKeyAlgorithm = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesKeyAlgorithm]
  }
}

