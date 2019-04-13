package typings
package reactDashLiveLib.reactDashLiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-live", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Editor: reactLib.reactMod.ComponentClass[EditorProps, reactLib.reactMod.ComponentState] = js.native
  val LiveEditor: reactLib.reactMod.ComponentClass[LiveEditorProps, reactLib.reactMod.ComponentState] = js.native
  val LiveError: reactLib.reactMod.ComponentClass[reactDashLiveLib.DivProps, reactLib.reactMod.ComponentState] = js.native
  val LivePreview: reactLib.reactMod.ComponentClass[reactDashLiveLib.DivProps, reactLib.reactMod.ComponentState] = js.native
  val LiveProvider: reactLib.reactMod.ComponentClass[LiveProviderProps, reactLib.reactMod.ComponentState] = js.native
  def withLive[P](wrappedComponent: reactDashLiveLib.Component[P]): reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] = js.native
}

