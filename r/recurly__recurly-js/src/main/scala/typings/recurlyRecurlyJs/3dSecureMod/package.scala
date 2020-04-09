package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object `3dSecureMod` {
  type Risk = js.Function0[typings.recurlyRecurlyJs.AnonThreeDSecure]
  type ThreeDSecure = js.Function1[
    /* riskOptions */ typings.recurlyRecurlyJs.`3dSecureMod`.RiskOptions, 
    typings.recurlyRecurlyJs.`3dSecureMod`.ThreeDSecureEmitter
  ]
}
