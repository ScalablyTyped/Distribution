package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dkimrecord extends js.Object {
  var dkim_record: java.lang.String
  var spf_record: java.lang.String
}

object Anon_Dkimrecord {
  @scala.inline
  def apply(dkim_record: java.lang.String, spf_record: java.lang.String): Anon_Dkimrecord = {
    val __obj = js.Dynamic.literal(dkim_record = dkim_record, spf_record = spf_record)
  
    __obj.asInstanceOf[Anon_Dkimrecord]
  }
}

