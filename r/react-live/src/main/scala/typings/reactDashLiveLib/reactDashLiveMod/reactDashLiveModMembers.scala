package typings
package reactDashLiveLib.reactDashLiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-live", JSImport.Namespace)
@js.native
object reactDashLiveModMembers extends js.Object {
  val Editor: reactLib.reactMod.ReactNs.ComponentClass[EditorProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  val LiveEditor: reactLib.reactMod.ReactNs.ComponentClass[LiveEditorProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  val LiveError: reactLib.reactMod.ReactNs.ComponentClass[reactDashLiveLib.DivProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  val LivePreview: reactLib.reactMod.ReactNs.ComponentClass[reactDashLiveLib.DivProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  val LiveProvider: reactLib.reactMod.ReactNs.ComponentClass[LiveProviderProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def withLive[P](wrappedComponent: reactDashLiveLib.Component[P]): reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] = js.native
}

