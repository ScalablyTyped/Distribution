package typings
package reactDashLiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLiveMod {
  // React union type
  type Component[P] = (reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState]) | reactLib.reactMod.StatelessComponent[P]
  type Diff[T /* <: KeyType */, U /* <: KeyType */] = /* import warning: ImportType.apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type EditorProps = reactDashLiveLib.PreProps with reactDashLiveLib.Anon_IgnoreTabKey
  // Helper types
  type KeyType = java.lang.String | scala.Double | js.Symbol
  type LiveEditorProps = (reactDashLiveLib.Omit[EditorProps, reactDashLiveLib.reactDashLiveLibStrings.onChange]) with reactDashLiveLib.Anon_CodeOnChange
  type LiveProviderProps = (reactDashLiveLib.Omit[reactDashLiveLib.DivProps, reactDashLiveLib.reactDashLiveLibStrings.scope]) with reactDashLiveLib.Anon_Code
}
