package typings
package saslDashDigestDashMd5Lib.saslDashDigestDashMd5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestMd5Mechanism
  extends saslmechanismsLib.saslmechanismsMod.Mechanism {
  var clientFirst: saslDashDigestDashMd5Lib.saslDashDigestDashMd5LibNumbers.`false`
  @JSName("name")
  var name_DigestMd5Mechanism: saslDashDigestDashMd5Lib.saslDashDigestDashMd5LibStrings.`DIGEST-MD5`
  def response(cred: Credentials): java.lang.String
}

object DigestMd5Mechanism {
  @scala.inline
  def apply(
    challenge: java.lang.String => DigestMd5Mechanism,
    clientFirst: saslDashDigestDashMd5Lib.saslDashDigestDashMd5LibNumbers.`false`,
    name: saslDashDigestDashMd5Lib.saslDashDigestDashMd5LibStrings.`DIGEST-MD5`,
    response: Credentials => java.lang.String
  ): DigestMd5Mechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst, name = name, response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[DigestMd5Mechanism]
  }
}

