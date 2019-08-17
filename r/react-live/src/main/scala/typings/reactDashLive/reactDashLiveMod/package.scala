package typings.reactDashLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLiveMod {
  import typings.reactDashLive.Anon_Code
  import typings.reactDashLive.Anon_CodeOnChange
  import typings.reactDashLive.Anon_IgnoreTabKey
  import typings.reactDashLive.DivProps
  import typings.reactDashLive.Omit
  import typings.reactDashLive.PreProps
  import typings.reactDashLive.reactDashLiveStrings.onChange
  import typings.reactDashLive.reactDashLiveStrings.scope

  type EditorProps = PreProps with Anon_IgnoreTabKey
  type LiveEditorProps = (Omit[EditorProps, onChange]) with Anon_CodeOnChange
  type LiveProviderProps = (Omit[DivProps, scope]) with Anon_Code
}
