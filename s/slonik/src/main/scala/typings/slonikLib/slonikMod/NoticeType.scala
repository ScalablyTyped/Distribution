package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeType extends js.Object {
  var code: java.lang.String
  var length: scala.Double
  var message: java.lang.String
  var name: java.lang.String
  var severity: java.lang.String
  var where: java.lang.String
}

object NoticeType {
  @scala.inline
  def apply(
    code: java.lang.String,
    length: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    severity: java.lang.String,
    where: java.lang.String
  ): NoticeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("severity")(severity)
    __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[NoticeType]
  }
}

