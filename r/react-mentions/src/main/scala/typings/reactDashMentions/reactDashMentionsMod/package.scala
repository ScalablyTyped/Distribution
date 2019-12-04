package typings.reactDashMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMentionsMod {
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.reactDashMentions.Anon_Target
  import typings.std.Exclude
  import typings.std.Pick

  type DataFunc = js.Function2[
    /* query */ String, 
    /* callback */ js.Function1[/* data */ js.Array[SuggestionDataItem], Unit], 
    Unit | js.Array[SuggestionDataItem]
  ]
  type DisplayTransformFunc = js.Function2[/* id */ String, /* display */ String, String]
  type MentionsInputClass = ComponentClass[MentionsInputProps, ComponentState]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type OnChangeHandlerFunc = js.Function4[
    /* event */ Anon_Target, 
    /* newValue */ String, 
    /* newPlainTextValue */ String, 
    /* mentions */ js.Array[MentionItem], 
    Unit
  ]
}
