package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dkimrecord extends js.Object {
  var dkim_record: String = js.native
  var spf_record: String = js.native
}

object Dkimrecord {
  @scala.inline
  def apply(dkim_record: String, spf_record: String): Dkimrecord = {
    val __obj = js.Dynamic.literal(dkim_record = dkim_record.asInstanceOf[js.Any], spf_record = spf_record.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dkimrecord]
  }
  @scala.inline
  implicit class DkimrecordOps[Self <: Dkimrecord] (val x: Self) extends AnyVal {
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
    def setDkim_record(value: String): Self = this.set("dkim_record", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpf_record(value: String): Self = this.set("spf_record", value.asInstanceOf[js.Any])
  }
  
}

