package typings
package saslmechanismsLib.saslmechanismsMod.FactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mechanism extends js.Object {
  var name: java.lang.String
  def challenge(chal: java.lang.String): scala.Unit
  def response(cred: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String
}

object Mechanism {
  @scala.inline
  def apply(
    challenge: java.lang.String => scala.Unit,
    name: java.lang.String,
    response: org.scalablytyped.runtime.StringDictionary[js.Any] => java.lang.String
  ): Mechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), name = name, response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[Mechanism]
  }
}

