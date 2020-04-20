package typings.rbx.themeMod

import typings.rbx.AnonClassName
import typings.rbx.factoryMod.TransformFunction
import typings.rbx.factoryMod.ValidatingTransformFunction
import typings.std.Partial
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeContextValue[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] extends js.Object {
  var transform: ValidatingTransformFunction[TTransformProps, TNewProps]
}

object ThemeContextValue {
  @scala.inline
  def apply[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */](
    transform: (/* props */ AnonClassName with Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
  ): ThemeContextValue[TTransformProps, TNewProps] = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction3(transform))
    __obj.asInstanceOf[ThemeContextValue[TTransformProps, TNewProps]]
  }
}

