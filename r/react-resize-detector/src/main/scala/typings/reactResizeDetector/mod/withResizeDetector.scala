package typings.reactResizeDetector.mod

import typings.react.mod.ComponentType
import typings.reactResizeDetector.reactResizeDetectorStrings.height
import typings.reactResizeDetector.reactResizeDetectorStrings.width
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-resize-detector", "withResizeDetector")
@js.native
object withResizeDetector extends js.Object {
  def apply[T /* <: Partial[ReactResizeDetectorDimensions] */](WrappedComponent: ComponentType[T]): ComponentType[Omit[T, height | width]] = js.native
  def apply[T /* <: Partial[ReactResizeDetectorDimensions] */](WrappedComponent: ComponentType[T], props: ReactResizeDetectorProps): ComponentType[Omit[T, height | width]] = js.native
}

