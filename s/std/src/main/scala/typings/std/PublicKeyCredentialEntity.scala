package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredentialEntity extends js.Object {
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object PublicKeyCredentialEntity {
  @scala.inline
  def apply(name: java.lang.String, icon: java.lang.String = null): PublicKeyCredentialEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialEntity]
  }
}

