package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesDerivedKeyParams extends Algorithm {
  var length: Double
}

object AesDerivedKeyParams {
  @scala.inline
  def apply(length: Double, name: java.lang.String): AesDerivedKeyParams = {
    val __obj = js.Dynamic.literal(length = length, name = name)
  
    __obj.asInstanceOf[AesDerivedKeyParams]
  }
}

