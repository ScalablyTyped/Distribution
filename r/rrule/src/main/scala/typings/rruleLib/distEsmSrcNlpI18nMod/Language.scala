package typings
package rruleLib.distEsmSrcNlpI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  var dayNames: js.Array[java.lang.String]
  var monthNames: js.Array[java.lang.String]
  var tokens: org.scalablytyped.runtime.StringDictionary[stdLib.RegExp]
}

object Language {
  @scala.inline
  def apply(
    dayNames: js.Array[java.lang.String],
    monthNames: js.Array[java.lang.String],
    tokens: org.scalablytyped.runtime.StringDictionary[stdLib.RegExp]
  ): Language = {
    val __obj = js.Dynamic.literal(dayNames = dayNames, monthNames = monthNames, tokens = tokens)
  
    __obj.asInstanceOf[Language]
  }
}

