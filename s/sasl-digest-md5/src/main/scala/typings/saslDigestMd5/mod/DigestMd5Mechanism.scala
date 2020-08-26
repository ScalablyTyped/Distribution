package typings.saslDigestMd5.mod

import typings.saslDigestMd5.saslDigestMd5Booleans.`false`
import typings.saslDigestMd5.saslDigestMd5Strings.`DIGEST-MD5`
import typings.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DigestMd5Mechanism extends Mechanism {
  var clientFirst: `false` = js.native
  @JSName("name")
  var name_DigestMd5Mechanism: `DIGEST-MD5` = js.native
  def response(cred: Credentials): String = js.native
}

object DigestMd5Mechanism {
  @scala.inline
  def apply(
    challenge: String => Unit,
    clientFirst: `false`,
    name: `DIGEST-MD5`,
    response: Credentials => String
  ): DigestMd5Mechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
    __obj.asInstanceOf[DigestMd5Mechanism]
  }
  @scala.inline
  implicit class DigestMd5MechanismOps[Self <: DigestMd5Mechanism] (val x: Self) extends AnyVal {
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
    def setClientFirst(value: `false`): Self = this.set("clientFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: `DIGEST-MD5`): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Credentials => String): Self = this.set("response", js.Any.fromFunction1(value))
  }
  
}

