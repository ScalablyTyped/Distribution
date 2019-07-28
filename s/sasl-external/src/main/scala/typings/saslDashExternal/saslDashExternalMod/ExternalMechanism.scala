package typings.saslDashExternal.saslDashExternalMod

import typings.saslDashExternal.saslDashExternalNumbers.`true`
import typings.saslDashExternal.saslDashExternalStrings.EXTERNAL
import typings.saslmechanisms.saslmechanismsMod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalMechanism extends Mechanism {
  var clientFirst: `true`
  @JSName("name")
  var name_ExternalMechanism: EXTERNAL
  def response(cred: Credentials): String
}

object ExternalMechanism {
  @scala.inline
  def apply(challenge: String => Unit, clientFirst: `true`, name: EXTERNAL, response: Credentials => String): ExternalMechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst, name = name, response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[ExternalMechanism]
  }
}

