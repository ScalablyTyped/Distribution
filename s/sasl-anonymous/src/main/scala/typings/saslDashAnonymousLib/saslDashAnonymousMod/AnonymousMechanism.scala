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
    challenge: js.Function1[java.lang.String, scala.Unit],
    clientFirst: saslDashAnonymousLib.saslDashAnonymousLibNumbers.`true`,
    name: saslDashAnonymousLib.saslDashAnonymousLibStrings.ANONYMOUS,
    response: js.Function1[
      saslDashAnonymousLib.saslDashAnonymousMod.AnonymousMechanismNs.Credentials, 
      java.lang.String
    ]
  ): AnonymousMechanism = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("challenge")(challenge)
    __obj.updateDynamic("clientFirst")(clientFirst)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[AnonymousMechanism]
  }
}

