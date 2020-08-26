package typings.restifyCorsMiddleware.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** user defined headers to allow */
  var allowHeaders: js.Array[String] = js.native
  /** if true, uses creds */
  var credentials: js.UndefOr[Boolean] = js.native
  /** user defined headers to expose */
  var exposeHeaders: js.Array[String] = js.native
  /**
    * an array of whitelisted origins
    * can be both strings and regular expressions
    */
  var origins: js.Array[String | RegExp] = js.native
  /** ms to cache preflight requests */
  var preflightMaxAge: js.UndefOr[Double] = js.native
  /** customize preflight request handling */
  var preflightStrategy: js.UndefOr[js.Any] = js.native
}

object Options {
  @scala.inline
  def apply(
    allowHeaders: js.Array[String],
    exposeHeaders: js.Array[String],
    origins: js.Array[String | RegExp]
  ): Options = {
    val __obj = js.Dynamic.literal(allowHeaders = allowHeaders.asInstanceOf[js.Any], exposeHeaders = exposeHeaders.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAllowHeadersVarargs(value: String*): Self = this.set("allowHeaders", js.Array(value :_*))
    @scala.inline
    def setAllowHeaders(value: js.Array[String]): Self = this.set("allowHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposeHeadersVarargs(value: String*): Self = this.set("exposeHeaders", js.Array(value :_*))
    @scala.inline
    def setExposeHeaders(value: js.Array[String]): Self = this.set("exposeHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginsVarargs(value: (String | RegExp)*): Self = this.set("origins", js.Array(value :_*))
    @scala.inline
    def setOrigins(value: js.Array[String | RegExp]): Self = this.set("origins", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentials(value: Boolean): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setPreflightMaxAge(value: Double): Self = this.set("preflightMaxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreflightMaxAge: Self = this.set("preflightMaxAge", js.undefined)
    @scala.inline
    def setPreflightStrategy(value: js.Any): Self = this.set("preflightStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreflightStrategy: Self = this.set("preflightStrategy", js.undefined)
  }
  
}

