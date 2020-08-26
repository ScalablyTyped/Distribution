package typings.pusherChatkitClient.chatmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenProviderConstructorArgs extends js.Object {
  var headers: js.UndefOr[js.Any] = js.native
  var queryParams: js.UndefOr[js.Any] = js.native
  var url: String = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object TokenProviderConstructorArgs {
  @scala.inline
  def apply(url: String): TokenProviderConstructorArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenProviderConstructorArgs]
  }
  @scala.inline
  implicit class TokenProviderConstructorArgsOps[Self <: TokenProviderConstructorArgs] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setQueryParams(value: js.Any): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

