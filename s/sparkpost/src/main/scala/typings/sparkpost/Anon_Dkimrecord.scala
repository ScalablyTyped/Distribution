package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dkimrecord extends js.Object {
  var dkim_record: String
  var spf_record: String
}

object Anon_Dkimrecord {
  @scala.inline
  def apply(dkim_record: String, spf_record: String): Anon_Dkimrecord = {
    val __obj = js.Dynamic.literal(dkim_record = dkim_record.asInstanceOf[js.Any], spf_record = spf_record.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dkimrecord]
  }
}

