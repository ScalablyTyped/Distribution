package typings.atStorybookAddons.atStorybookAddonsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorContext[ParameterName /* <: String */, T] extends Context {
  var parameters: js.UndefOr[Record[ParameterName, T]] = js.undefined
}

object DecoratorContext {
  @scala.inline
  def apply[ParameterName /* <: String */, T](kind: String, story: String, parameters: Record[ParameterName, T] = null): DecoratorContext[ParameterName, T] = {
    val __obj = js.Dynamic.literal(kind = kind, story = story)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[DecoratorContext[ParameterName, T]]
  }
}

