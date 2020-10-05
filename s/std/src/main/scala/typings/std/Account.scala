package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// DOM APIs
/////////////////////////////
@js.native
trait Account extends js.Object {
  var displayName: java.lang.String = js.native
  var id: java.lang.String = js.native
  var imageURL: js.UndefOr[java.lang.String] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var rpDisplayName: java.lang.String = js.native
}

object Account {
  @scala.inline
  def apply(displayName: java.lang.String, id: java.lang.String, rpDisplayName: java.lang.String): Account = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rpDisplayName = rpDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
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
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRpDisplayName(value: java.lang.String): Self = this.set("rpDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageURL(value: java.lang.String): Self = this.set("imageURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageURL: Self = this.set("imageURL", js.undefined)
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

