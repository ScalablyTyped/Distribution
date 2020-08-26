package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentTimelineOptions extends js.Object {
  var originTime: js.UndefOr[Double] = js.native
}

object DocumentTimelineOptions {
  @scala.inline
  def apply(): DocumentTimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTimelineOptions]
  }
  @scala.inline
  implicit class DocumentTimelineOptionsOps[Self <: DocumentTimelineOptions] (val x: Self) extends AnyVal {
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
    def setOriginTime(value: Double): Self = this.set("originTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginTime: Self = this.set("originTime", js.undefined)
  }
  
}

