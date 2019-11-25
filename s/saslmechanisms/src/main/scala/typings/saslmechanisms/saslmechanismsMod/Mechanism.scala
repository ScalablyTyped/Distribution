package typings.saslmechanisms.saslmechanismsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mechanism extends js.Object {
  var name: String
  def challenge(chal: String): Unit
  def response(cred: StringDictionary[js.Any]): String
}

object Mechanism {
  @scala.inline
  def apply(challenge: String => Unit, name: String, response: StringDictionary[js.Any] => String): Mechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[Mechanism]
  }
}

