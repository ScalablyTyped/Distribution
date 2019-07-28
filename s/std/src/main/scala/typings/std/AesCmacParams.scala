package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesCmacParams extends Algorithm {
  var length: Double
}

object AesCmacParams {
  @scala.inline
  def apply(length: Double, name: java.lang.String): AesCmacParams = {
    val __obj = js.Dynamic.literal(length = length, name = name)
  
    __obj.asInstanceOf[AesCmacParams]
  }
}

