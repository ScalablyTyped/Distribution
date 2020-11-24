package typings.saslScramSha1.mod

import typings.saslScramSha1.saslScramSha1Booleans.`true`
import typings.saslScramSha1.saslScramSha1Strings.`SCRAM-SHA-1`
import typings.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScramSha1Mechanism extends Mechanism {
  
  var clientFirst: `true` = js.native
  
  @JSName("name")
  var name_ScramSha1Mechanism: `SCRAM-SHA-1` = js.native
  
  def response(cred: Credentials): String = js.native
}
object ScramSha1Mechanism {
  
  @scala.inline
  def apply(
    challenge: String => Unit,
    clientFirst: `true`,
    name: `SCRAM-SHA-1`,
    response: Credentials => String
  ): ScramSha1Mechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
    __obj.asInstanceOf[ScramSha1Mechanism]
  }
  
  @scala.inline
  implicit class ScramSha1MechanismOps[Self <: ScramSha1Mechanism] (val x: Self) extends AnyVal {
    
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
    def setClientFirst(value: `true`): Self = this.set("clientFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: `SCRAM-SHA-1`): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Credentials => String): Self = this.set("response", js.Any.fromFunction1(value))
  }
}
