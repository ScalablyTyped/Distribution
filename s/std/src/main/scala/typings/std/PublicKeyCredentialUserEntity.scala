package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredentialUserEntity extends PublicKeyCredentialEntity {
  var displayName: java.lang.String
  var id: BufferSource
}

object PublicKeyCredentialUserEntity {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    id: BufferSource,
    name: java.lang.String,
    icon: java.lang.String = null
  ): PublicKeyCredentialUserEntity = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialUserEntity]
  }
}

