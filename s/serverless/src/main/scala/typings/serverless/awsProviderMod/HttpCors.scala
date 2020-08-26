package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpCors extends js.Object {
  var allowCredentials: js.UndefOr[Boolean] = js.native
  var cacheControl: js.UndefOr[String] = js.native
  var headers: js.UndefOr[String | js.Array[String]] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var origins: js.UndefOr[String | js.Array[String]] = js.native
}

object HttpCors {
  @scala.inline
  def apply(): HttpCors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpCors]
  }
  @scala.inline
  implicit class HttpCorsOps[Self <: HttpCors] (val x: Self) extends AnyVal {
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
    def setAllowCredentials(value: Boolean): Self = this.set("allowCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCredentials: Self = this.set("allowCredentials", js.undefined)
    @scala.inline
    def setCacheControl(value: String): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: String | js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setOriginsVarargs(value: String*): Self = this.set("origins", js.Array(value :_*))
    @scala.inline
    def setOrigins(value: String | js.Array[String]): Self = this.set("origins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigins: Self = this.set("origins", js.undefined)
  }
  
}

