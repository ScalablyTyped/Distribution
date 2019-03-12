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
    errorFilter: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    messages: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    overrideMessages: scala.Boolean
  ): Validation = {
    val __obj = js.Dynamic.literal(errorFilter = js.Any.fromFunction3(errorFilter), messages = messages, overrideMessages = overrideMessages)
  
    __obj.asInstanceOf[Validation]
  }
}

