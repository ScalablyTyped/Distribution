package typings.rrule.distEsmSrcNlpI18nMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  var dayNames: js.Array[String]
  var monthNames: js.Array[String]
  var tokens: StringDictionary[RegExp]
}

object Language {
  @scala.inline
  def apply(dayNames: js.Array[String], monthNames: js.Array[String], tokens: StringDictionary[RegExp]): Language = {
    val __obj = js.Dynamic.literal(dayNames = dayNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Language]
  }
}

