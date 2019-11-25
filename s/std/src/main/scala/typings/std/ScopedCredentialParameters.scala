package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredentialParameters extends js.Object {
  var algorithm: java.lang.String | Algorithm
  var `type`: ScopedCredentialType
}

object ScopedCredentialParameters {
  @scala.inline
  def apply(algorithm: java.lang.String | Algorithm, `type`: ScopedCredentialType): ScopedCredentialParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialParameters]
  }
}

