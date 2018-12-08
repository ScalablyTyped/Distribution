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

