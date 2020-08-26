package typings.pusherJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthConfig extends js.Object {
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object AuthConfig {
  @scala.inline
  def apply(): AuthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthConfig]
  }
  @scala.inline
  implicit class AuthConfigOps[Self <: AuthConfig] (val x: Self) extends AnyVal {
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
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

