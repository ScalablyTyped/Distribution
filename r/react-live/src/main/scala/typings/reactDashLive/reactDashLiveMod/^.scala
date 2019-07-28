package typings.reactDashLive.reactDashLiveMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashLive.DivProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-live", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Editor: ComponentClass[EditorProps, ComponentState] = js.native
  val LiveEditor: ComponentClass[LiveEditorProps, ComponentState] = js.native
  val LiveError: ComponentClass[DivProps, ComponentState] = js.native
  val LivePreview: ComponentClass[DivProps, ComponentState] = js.native
  val LiveProvider: ComponentClass[LiveProviderProps, ComponentState] = js.native
  def withLive[P](wrappedComponent: ComponentType[P]): ComponentClass[P, ComponentState] = js.native
}

