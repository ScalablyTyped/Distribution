package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DhKeyGenParams extends Algorithm {
  var generator: Uint8Array
  var prime: Uint8Array
}

object DhKeyGenParams {
  @scala.inline
  def apply(generator: Uint8Array, name: java.lang.String, prime: Uint8Array): DhKeyGenParams = {
    val __obj = js.Dynamic.literal(generator = generator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhKeyGenParams]
  }
}

