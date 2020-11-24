package typings.saslAnonymous.mod

import typings.saslAnonymous.saslAnonymousBooleans.`true`
import typings.saslAnonymous.saslAnonymousStrings.ANONYMOUS
import typings.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnonymousMechanism extends Mechanism {
  
  var clientFirst: `true` = js.native
  
  @JSName("name")
  var name_AnonymousMechanism: ANONYMOUS = js.native
  
  def response(cred: Credentials): String = js.native
}
object AnonymousMechanism {
  
  @scala.inline
  def apply(challenge: String => Unit, clientFirst: `true`, name: ANONYMOUS, response: Credentials => String): AnonymousMechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
    __obj.asInstanceOf[AnonymousMechanism]
  }
  
  @scala.inline
  implicit class AnonymousMechanismOps[Self <: AnonymousMechanism] (val x: Self) extends AnyVal {
    
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
    def setName(value: ANONYMOUS): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Credentials => String): Self = this.set("response", js.Any.fromFunction1(value))
  }
}
