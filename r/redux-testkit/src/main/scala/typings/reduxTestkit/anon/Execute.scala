package typings.reduxTestkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Execute extends js.Object {
  def execute(state: js.Any, args: js.Any*): js.Any
  def expect(state: js.Any, args: js.Any*): ToReturn
}

object Execute {
  @scala.inline
  def apply(
    execute: (js.Any, /* repeated */ js.Any) => js.Any,
    expect: (js.Any, /* repeated */ js.Any) => ToReturn
  ): Execute = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), expect = js.Any.fromFunction2(expect))
    __obj.asInstanceOf[Execute]
  }
}

