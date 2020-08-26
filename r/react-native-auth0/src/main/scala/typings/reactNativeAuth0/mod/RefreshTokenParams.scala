package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshTokenParams extends js.Object {
  var refreshToken: String = js.native
  var scope: js.UndefOr[String] = js.native
}

object RefreshTokenParams {
  @scala.inline
  def apply(refreshToken: String): RefreshTokenParams = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTokenParams]
  }
  @scala.inline
  implicit class RefreshTokenParamsOps[Self <: RefreshTokenParams] (val x: Self) extends AnyVal {
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
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

