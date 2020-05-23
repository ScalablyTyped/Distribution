package typings.sixRuntime.Six.plugins.dataProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider extends js.Object {
  def execute(ctx: js.Object, args: js.Any): js.Any
  def prepare(ctx: js.Object, depsRes: js.Object): js.Any
}

object DataProvider {
  @scala.inline
  def apply(execute: (js.Object, js.Any) => js.Any, prepare: (js.Object, js.Object) => js.Any): DataProvider = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), prepare = js.Any.fromFunction2(prepare))
    __obj.asInstanceOf[DataProvider]
  }
}

