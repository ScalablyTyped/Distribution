package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPssParams extends Algorithm {
  var saltLength: Double
}

object RsaPssParams {
  @scala.inline
  def apply(name: java.lang.String, saltLength: Double): RsaPssParams = {
    val __obj = js.Dynamic.literal(name = name, saltLength = saltLength)
  
    __obj.asInstanceOf[RsaPssParams]
  }
}

