package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDkimrecord extends js.Object {
  var dkim_record: String
  var spf_record: String
}

object AnonDkimrecord {
  @scala.inline
  def apply(dkim_record: String, spf_record: String): AnonDkimrecord = {
    val __obj = js.Dynamic.literal(dkim_record = dkim_record.asInstanceOf[js.Any], spf_record = spf_record.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDkimrecord]
  }
}

