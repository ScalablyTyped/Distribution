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
    challenge: java.lang.String => ScramSha1Mechanism,
    clientFirst: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1LibNumbers.`true`,
    name: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1LibStrings.`SCRAM-SHA-1`,
    response: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod.ScramSha1MechanismNs.Credentials => java.lang.String
  ): ScramSha1Mechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst, name = name, response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[ScramSha1Mechanism]
  }
}

