package typings
package saslDashPlainLib.saslDashPlainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlainMechanism
  extends saslmechanismsLib.saslmechanismsMod.FactoryNs.Mechanism {
  var clientFirst: saslDashPlainLib.saslDashPlainLibNumbers.`true`
  @JSName("name")
  var name_PlainMechanism: saslDashPlainLib.saslDashPlainLibStrings.PLAIN
  def response(cred: saslDashPlainLib.saslDashPlainMod.PlainMechanismNs.Credentials): java.lang.String
}

object PlainMechanism {
  @scala.inline
  def apply(
    challenge: java.lang.String => PlainMechanism,
    clientFirst: saslDashPlainLib.saslDashPlainLibNumbers.`true`,
    name: saslDashPlainLib.saslDashPlainLibStrings.PLAIN,
    response: saslDashPlainLib.saslDashPlainMod.PlainMechanismNs.Credentials => java.lang.String
  ): PlainMechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst, name = name, response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[PlainMechanism]
  }
}

