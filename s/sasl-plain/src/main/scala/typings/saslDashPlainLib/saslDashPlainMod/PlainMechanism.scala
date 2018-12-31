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

