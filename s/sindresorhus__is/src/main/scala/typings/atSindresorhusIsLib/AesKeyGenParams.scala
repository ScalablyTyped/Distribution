package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesKeyGenParams extends Algorithm {
  var length: scala.Double
}

object AesKeyGenParams {
  @scala.inline
  def apply(length: scala.Double, name: java.lang.String): AesKeyGenParams = {
    val __obj = js.Dynamic.literal(length = length, name = name)
  
    __obj.asInstanceOf[AesKeyGenParams]
  }
}

