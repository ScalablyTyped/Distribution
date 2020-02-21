package typings.reactNative.mod.Animated

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatedComponent[T /* <: ComponentType[ComponentProps[T]] | (Component[ComponentProps[T], js.Object, _]) */] extends FunctionComponent[AnimatedProps[ComponentProps[T]]] {
  def getNode(): T = js.native
}

