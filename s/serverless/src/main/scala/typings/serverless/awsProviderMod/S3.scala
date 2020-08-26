package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3 extends js.Object {
  var bucket: String = js.native
  var event: String = js.native
  var existing: js.UndefOr[Boolean] = js.native
  var rules: js.Array[S3Rule] = js.native
}

object S3 {
  @scala.inline
  def apply(bucket: String, event: String, rules: js.Array[S3Rule]): S3 = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
  @scala.inline
  implicit class S3Ops[Self <: S3] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesVarargs(value: S3Rule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[S3Rule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setExisting(value: Boolean): Self = this.set("existing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExisting: Self = this.set("existing", js.undefined)
  }
  
}

