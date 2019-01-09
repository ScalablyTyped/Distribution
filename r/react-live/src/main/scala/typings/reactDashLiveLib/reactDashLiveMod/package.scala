package typings
package reactDashLiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLiveMod {
  type EditorProps = reactDashLiveLib.PreProps with reactDashLiveLib.Anon_IgnoreTabKey
  type LiveEditorProps = (reactDashLiveLib.Omit[EditorProps, reactDashLiveLib.reactDashLiveLibStrings.onChange]) with reactDashLiveLib.Anon_CodeOnChange
  type LiveProviderProps = (reactDashLiveLib.Omit[reactDashLiveLib.DivProps, reactDashLiveLib.reactDashLiveLibStrings.scope]) with reactDashLiveLib.Anon_Code
}
