package typings.reactMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataFunc = js.Function2[
    /* query */ java.lang.String, 
    /* callback */ js.Function1[/* data */ js.Array[typings.reactMentions.mod.SuggestionDataItem], scala.Unit], 
    scala.Unit | js.Array[typings.reactMentions.mod.SuggestionDataItem]
  ]
  type DisplayTransformFunc = js.Function2[/* id */ java.lang.String, /* display */ java.lang.String, java.lang.String]
  type MentionsInputClass = typings.react.mod.ComponentClass[typings.reactMentions.mod.MentionsInputProps, typings.react.mod.ComponentState]
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type OnChangeHandlerFunc = js.Function4[
    /* event */ typings.reactMentions.AnonTarget, 
    /* newValue */ java.lang.String, 
    /* newPlainTextValue */ java.lang.String, 
    /* mentions */ js.Array[typings.reactMentions.mod.MentionItem], 
    scala.Unit
  ]
}
