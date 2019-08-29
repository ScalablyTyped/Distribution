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
    val __obj = js.Dynamic.literal(displayName = displayName, id = id, name = name)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[PublicKeyCredentialUserEntity]
  }
}

