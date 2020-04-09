package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.`3dSecureMod`.RiskOptions
import typings.recurlyRecurlyJs.`3dSecureMod`.ThreeDSecure
import typings.recurlyRecurlyJs.`3dSecureMod`.ThreeDSecureEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonThreeDSecure extends js.Object {
  @JSName("ThreeDSecure")
  var ThreeDSecure_Original: ThreeDSecure = js.native
  def ThreeDSecure(riskOptions: RiskOptions): ThreeDSecureEmitter = js.native
}

