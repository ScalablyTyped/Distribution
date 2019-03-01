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
    challenge: js.Function1[java.lang.String, PlainMechanism],
    clientFirst: saslDashPlainLib.saslDashPlainLibNumbers.`true`,
    name: saslDashPlainLib.saslDashPlainLibStrings.PLAIN,
    response: js.Function1[saslDashPlainLib.saslDashPlainMod.PlainMechanismNs.Credentials, java.lang.String]
  ): PlainMechanism = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("challenge")(challenge)
    __obj.updateDynamic("clientFirst")(clientFirst)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[PlainMechanism]
  }
}

