package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialUserEntity extends PublicKeyCredentialEntity {
  var displayName: java.lang.String = js.native
  var id: BufferSource = js.native
}

object PublicKeyCredentialUserEntity {
  @scala.inline
  def apply(displayName: java.lang.String, id: BufferSource, name: java.lang.String): PublicKeyCredentialUserEntity = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialUserEntity]
  }
  @scala.inline
  implicit class PublicKeyCredentialUserEntityOps[Self <: PublicKeyCredentialUserEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: java.lang.String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: BufferSource): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

