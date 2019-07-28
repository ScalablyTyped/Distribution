package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeType extends js.Object {
  var code: String
  var length: Double
  var message: String
  var name: String
  var severity: String
  var where: String
}

object NoticeType {
  @scala.inline
  def apply(code: String, length: Double, message: String, name: String, severity: String, where: String): NoticeType = {
    val __obj = js.Dynamic.literal(code = code, length = length, message = message, name = name, severity = severity, where = where)
  
    __obj.asInstanceOf[NoticeType]
  }
}

