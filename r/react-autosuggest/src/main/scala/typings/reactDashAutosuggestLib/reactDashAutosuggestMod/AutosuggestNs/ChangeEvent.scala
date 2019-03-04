package typings
package reactDashAutosuggestLib.reactDashAutosuggestMod.AutosuggestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent extends js.Object {
  var method: reactDashAutosuggestLib.reactDashAutosuggestLibStrings.down | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.up | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.escape | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.enter | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.click | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`type`
  var newValue: java.lang.String
}

object ChangeEvent {
  @scala.inline
  def apply(
    method: reactDashAutosuggestLib.reactDashAutosuggestLibStrings.down | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.up | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.escape | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.enter | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.click | reactDashAutosuggestLib.reactDashAutosuggestLibStrings.`type`,
    newValue: java.lang.String
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], newValue = newValue)
  
    __obj.asInstanceOf[ChangeEvent]
  }
}

