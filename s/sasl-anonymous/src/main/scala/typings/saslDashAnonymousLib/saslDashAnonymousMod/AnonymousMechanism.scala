package typings
package saslDashAnonymousLib.saslDashAnonymousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnonymousMechanism
  extends saslmechanismsLib.saslmechanismsMod.FactoryNs.Mechanism {
  var clientFirst: saslDashAnonymousLib.saslDashAnonymousLibNumbers.`true`
  @JSName("name")
  var name_AnonymousMechanism: saslDashAnonymousLib.saslDashAnonymousLibStrings.ANONYMOUS
  def response(cred: saslDashAnonymousLib.saslDashAnonymousMod.AnonymousMechanismNs.Credentials): java.lang.String
}

