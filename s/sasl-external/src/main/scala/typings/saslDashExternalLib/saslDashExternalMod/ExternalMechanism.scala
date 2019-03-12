package typings
package saslDashExternalLib.saslDashExternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalMechanism
  extends saslmechanismsLib.saslmechanismsMod.FactoryNs.Mechanism {
  var clientFirst: saslDashExternalLib.saslDashExternalLibNumbers.`true`
  @JSName("name")
  var name_ExternalMechanism: saslDashExternalLib.saslDashExternalLibStrings.EXTERNAL
  def response(cred: saslDashExternalLib.saslDashExternalMod.ExternalMechanismNs.Credentials): java.lang.String
}

object ExternalMechanism {
  @scala.inline
  def apply(
    challenge: java.lang.String => scala.Unit,
    clientFirst: saslDashExternalLib.saslDashExternalLibNumbers.`true`,
    name: saslDashExternalLib.saslDashExternalLibStrings.EXTERNAL,
    response: saslDashExternalLib.saslDashExternalMod.ExternalMechanismNs.Credentials => java.lang.String
  ): ExternalMechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst, name = name, response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[ExternalMechanism]
  }
}

