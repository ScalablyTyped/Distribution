package typings.statsdClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpOptions extends CommonOptions {
  /**
    * Additional headers to send (default {}).
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Where to send the stats (default localhost).
    */
  var host: js.UndefOr[String] = js.native
  /**
    * What HTTP method to use (default "PUT").
    */
  var method: js.UndefOr[String] = js.native
}

object HttpOptions {
  @scala.inline
  def apply(): HttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpOptions]
  }
  @scala.inline
  implicit class HttpOptionsOps[Self <: HttpOptions] (val x: Self) extends AnyVal {
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
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

