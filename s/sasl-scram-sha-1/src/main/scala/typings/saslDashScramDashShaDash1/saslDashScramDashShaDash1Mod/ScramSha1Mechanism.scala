package typings.saslDashScramDashShaDash1.saslDashScramDashShaDash1Mod

import typings.saslDashScramDashShaDash1.saslDashScramDashShaDash1Booleans.`true`
import typings.saslDashScramDashShaDash1.saslDashScramDashShaDash1Strings.`SCRAM-SHA-1`
import typings.saslmechanisms.saslmechanismsMod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScramSha1Mechanism extends Mechanism {
  var clientFirst: `true`
  @JSName("name")
  var name_ScramSha1Mechanism: `SCRAM-SHA-1`
  def response(cred: Credentials): String
}

object ScramSha1Mechanism {
  @scala.inline
  def apply(
    challenge: String => Unit,
    clientFirst: `true`,
    name: `SCRAM-SHA-1`,
    response: Credentials => String
  ): ScramSha1Mechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[ScramSha1Mechanism]
  }
}

