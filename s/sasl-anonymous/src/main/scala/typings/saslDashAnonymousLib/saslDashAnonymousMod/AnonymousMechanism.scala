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

object AnonymousMechanism {
  @scala.inline
  def apply(
    challenge: java.lang.String => scala.Unit,
    clientFirst: saslDashAnonymousLib.saslDashAnonymousLibNumbers.`true`,
    name: saslDashAnonymousLib.saslDashAnonymousLibStrings.ANONYMOUS,
    response: saslDashAnonymousLib.saslDashAnonymousMod.AnonymousMechanismNs.Credentials => java.lang.String
  ): AnonymousMechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst, name = name, response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[AnonymousMechanism]
  }
}

