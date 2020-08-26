package typings.saslmechanisms.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mechanism extends js.Object {
  var name: String = js.native
  def challenge(chal: String): Unit = js.native
  def response(cred: StringDictionary[js.Any]): String = js.native
}

object Mechanism {
  @scala.inline
  def apply(challenge: String => Unit, name: String, response: StringDictionary[js.Any] => String): Mechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
    __obj.asInstanceOf[Mechanism]
  }
  @scala.inline
  implicit class MechanismOps[Self <: Mechanism] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChallenge(value: String => Unit): Self = this.set("challenge", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: StringDictionary[js.Any] => String): Self = this.set("response", js.Any.fromFunction1(value))
  }
  
}

