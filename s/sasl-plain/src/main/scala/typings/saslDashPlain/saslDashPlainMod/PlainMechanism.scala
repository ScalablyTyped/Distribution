package typings.saslDashPlain.saslDashPlainMod

import typings.saslDashPlain.saslDashPlainNumbers.`true`
import typings.saslDashPlain.saslDashPlainStrings.PLAIN
import typings.saslmechanisms.saslmechanismsMod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlainMechanism extends Mechanism {
  var clientFirst: `true`
  @JSName("name")
  var name_PlainMechanism: PLAIN
  def response(cred: Credentials): String
}

object PlainMechanism {
  @scala.inline
  def apply(challenge: String => Unit, clientFirst: `true`, name: PLAIN, response: Credentials => String): PlainMechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[PlainMechanism]
  }
}

