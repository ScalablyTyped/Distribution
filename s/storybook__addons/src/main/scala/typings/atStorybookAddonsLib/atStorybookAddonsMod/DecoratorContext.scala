package typings
package atStorybookAddonsLib.atStorybookAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorContext[ParameterName /* <: java.lang.String */, T] extends Context {
  var parameters: js.UndefOr[stdLib.Record[ParameterName, T]] = js.undefined
}

object DecoratorContext {
  @scala.inline
  def apply[ParameterName /* <: java.lang.String */, T](
    kind: java.lang.String,
    story: java.lang.String,
    parameters: stdLib.Record[ParameterName, T] = null
  ): DecoratorContext[ParameterName, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("story")(story)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[DecoratorContext[ParameterName, T]]
  }
}

