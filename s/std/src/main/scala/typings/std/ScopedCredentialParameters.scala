package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopedCredentialParameters extends js.Object {
  var algorithm: java.lang.String | Algorithm = js.native
  var `type`: ScopedCredentialType = js.native
}

object ScopedCredentialParameters {
  @scala.inline
  def apply(algorithm: java.lang.String | Algorithm, `type`: ScopedCredentialType): ScopedCredentialParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialParameters]
  }
  @scala.inline
  implicit class ScopedCredentialParametersOps[Self <: ScopedCredentialParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: java.lang.String | Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ScopedCredentialType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

