package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredentialRpEntity extends PublicKeyCredentialEntity {
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object PublicKeyCredentialRpEntity {
  @scala.inline
  def apply(name: java.lang.String, icon: java.lang.String = null, id: java.lang.String = null): PublicKeyCredentialRpEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRpEntity]
  }
}

