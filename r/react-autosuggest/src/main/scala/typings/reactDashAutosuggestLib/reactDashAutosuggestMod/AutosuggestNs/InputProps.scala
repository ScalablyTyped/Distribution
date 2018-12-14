package typings
package reactDashAutosuggestLib.reactDashAutosuggestMod.AutosuggestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick) */ 
trait InputProps[TSuggestion]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[_], 
      /* params */ js.UndefOr[BlurEvent[TSuggestion]], 
      scala.Unit
    ]
  ] = js.undefined
  var value: java.lang.String
  def onChange(event: reactLib.reactMod.ReactNs.FormEvent[_], params: ChangeEvent): scala.Unit
}

