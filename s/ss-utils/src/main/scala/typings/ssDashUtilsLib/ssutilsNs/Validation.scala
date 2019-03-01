package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validation extends js.Object {
  var messages: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var overrideMessages: scala.Boolean
  def errorFilter(errorMsg: java.lang.String, errorCode: java.lang.String, `type`: java.lang.String): scala.Unit
}

object Validation {
  @scala.inline
  def apply(
    errorFilter: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    messages: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    overrideMessages: scala.Boolean
  ): Validation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorFilter")(errorFilter)
    __obj.updateDynamic("messages")(messages)
    __obj.updateDynamic("overrideMessages")(overrideMessages)
    __obj.asInstanceOf[Validation]
  }
}

