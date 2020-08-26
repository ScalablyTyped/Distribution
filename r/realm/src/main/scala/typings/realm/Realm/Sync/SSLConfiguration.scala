package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSLConfiguration extends js.Object {
  var certificatePath: js.UndefOr[String] = js.native
  var validate: js.UndefOr[Boolean] = js.native
  var validateCallback: js.UndefOr[SSLVerifyCallback] = js.native
}

object SSLConfiguration {
  @scala.inline
  def apply(): SSLConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLConfiguration]
  }
  @scala.inline
  implicit class SSLConfigurationOps[Self <: SSLConfiguration] (val x: Self) extends AnyVal {
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
    def setCertificatePath(value: String): Self = this.set("certificatePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatePath: Self = this.set("certificatePath", js.undefined)
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setValidateCallback(value: /* sslVerifyObject */ SSLVerifyObject => Boolean): Self = this.set("validateCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidateCallback: Self = this.set("validateCallback", js.undefined)
  }
  
}

