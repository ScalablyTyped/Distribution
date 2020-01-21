package typings.reactLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // React Element Props
  type DivProps = typings.react.mod.HTMLProps[typings.std.HTMLDivElement]
  type EditorProps = (typings.reactLive.mod.Omit[typings.reactLive.mod.PreProps, typings.reactLive.reactLiveStrings.onChange]) with typings.reactLive.AnonCodeDisabled
  type LiveEditorProps = typings.reactLive.mod.EditorProps
  type LiveProviderProps = (typings.reactLive.mod.Omit[typings.reactLive.mod.DivProps, typings.reactLive.reactLiveStrings.scope]) with typings.reactLive.AnonCode
  // Helper types
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type PreProps = typings.react.mod.HTMLProps[typings.std.HTMLPreElement]
}
