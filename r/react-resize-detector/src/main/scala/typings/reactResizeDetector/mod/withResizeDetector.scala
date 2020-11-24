package typings.reactResizeDetector.mod

import typings.react.mod.ComponentType
import typings.reactResizeDetector.anon.PartialReactResizeDetecto
import typings.reactResizeDetector.reactResizeDetectorStrings.height
import typings.reactResizeDetector.reactResizeDetectorStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-resize-detector", "withResizeDetector")
@js.native
object withResizeDetector extends js.Object {
  
  def apply[T /* <: PartialReactResizeDetecto */](WrappedComponent: ComponentType[T]): ComponentType[Omit[T, height | width]] = js.native
  def apply[T /* <: PartialReactResizeDetecto */](WrappedComponent: ComponentType[T], props: ReactResizeDetectorProps): ComponentType[Omit[T, height | width]] = js.native
}
