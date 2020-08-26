package typings.splunkLogging.mod

import typings.splunkLogging.splunkLoggingStrings.http
import typings.splunkLogging.splunkLoggingStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var batchInterval: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var level: js.UndefOr[String] = js.native
  var maxBatchCount: js.UndefOr[Double] = js.native
  var maxBatchSize: js.UndefOr[Double] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[http | https] = js.native
  var token: String = js.native
  var url: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(token: String): Config = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchInterval(value: Double): Self = this.set("batchInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchInterval: Self = this.set("batchInterval", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMaxBatchCount(value: Double): Self = this.set("maxBatchCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBatchCount: Self = this.set("maxBatchCount", js.undefined)
    @scala.inline
    def setMaxBatchSize(value: Double): Self = this.set("maxBatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBatchSize: Self = this.set("maxBatchSize", js.undefined)
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: http | https): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

