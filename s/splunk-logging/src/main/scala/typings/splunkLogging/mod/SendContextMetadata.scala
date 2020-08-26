package typings.splunkLogging.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendContextMetadata extends js.Object {
  var host: js.UndefOr[String] = js.native
  var index: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
  var sourcetype: js.UndefOr[String] = js.native
}

object SendContextMetadata {
  @scala.inline
  def apply(): SendContextMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendContextMetadata]
  }
  @scala.inline
  implicit class SendContextMetadataOps[Self <: SendContextMetadata] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourcetype(value: String): Self = this.set("sourcetype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcetype: Self = this.set("sourcetype", js.undefined)
  }
  
}

