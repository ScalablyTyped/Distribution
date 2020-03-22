package typings.rascal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryption extends js.Object {
  var algorithm: String
  var ivLength: Double
  var key: String
}

object Encryption {
  @scala.inline
  def apply(algorithm: String, ivLength: Double, key: String): Encryption = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ivLength = ivLength.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Encryption]
  }
}

