package typings
package saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScramSha1Mechanism
  extends saslmechanismsLib.saslmechanismsMod.FactoryNs.Mechanism {
  var clientFirst: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1LibNumbers.`true`
  @JSName("name")
  var name_ScramSha1Mechanism: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1LibStrings.`SCRAM-SHA-1`
  def response(cred: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod.ScramSha1MechanismNs.Credentials): java.lang.String
}

object ScramSha1Mechanism {
  @scala.inline
  def apply(
    challenge: js.Function1[java.lang.String, ScramSha1Mechanism],
    clientFirst: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1LibNumbers.`true`,
    name: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1LibStrings.`SCRAM-SHA-1`,
    response: js.Function1[
      saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod.ScramSha1MechanismNs.Credentials, 
      java.lang.String
    ]
  ): ScramSha1Mechanism = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("challenge")(challenge)
    __obj.updateDynamic("clientFirst")(clientFirst)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[ScramSha1Mechanism]
  }
}

