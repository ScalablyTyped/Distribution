package typings.reactDashLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLiveMod {
  import typings.react.reactMod.HTMLProps
  import typings.reactDashLive.Anon_Code
  import typings.reactDashLive.Anon_CodeDisabled
  import typings.reactDashLive.reactDashLiveStrings.onChange
  import typings.reactDashLive.reactDashLiveStrings.scope
  import typings.std.Exclude
  import typings.std.HTMLDivElement
  import typings.std.HTMLPreElement
  import typings.std.Pick

  // React Element Props
  type DivProps = HTMLProps[HTMLDivElement]
  type EditorProps = (Omit[PreProps, onChange]) with Anon_CodeDisabled
  type LiveEditorProps = EditorProps
  type LiveProviderProps = (Omit[DivProps, scope]) with Anon_Code
  // Helper types
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PreProps = HTMLProps[HTMLPreElement]
}
