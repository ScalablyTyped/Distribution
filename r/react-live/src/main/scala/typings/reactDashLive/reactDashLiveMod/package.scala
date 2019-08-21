package typings.reactDashLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLiveMod {
  import typings.reactDashLive.Anon_Code
  import typings.reactDashLive.Anon_CodeDisabled
  import typings.reactDashLive.DivProps
  import typings.reactDashLive.Omit
  import typings.reactDashLive.PreProps
  import typings.reactDashLive.reactDashLiveStrings.onChange
  import typings.reactDashLive.reactDashLiveStrings.scope

  type EditorProps = (Omit[PreProps, onChange]) with Anon_CodeDisabled
  type LiveEditorProps = EditorProps
  type LiveProviderProps = (Omit[DivProps, scope]) with Anon_Code
}
