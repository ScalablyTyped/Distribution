package typings.reduxTestkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  def execute(state: js.Any, args: js.Any*): js.Any
  def expect(state: js.Any, args: js.Any*): AnonExpectedToReturn
}

object AnonArgs {
  @scala.inline
  def apply(
    execute: (js.Any, /* repeated */ js.Any) => js.Any,
    expect: (js.Any, /* repeated */ js.Any) => AnonExpectedToReturn
  ): AnonArgs = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), expect = js.Any.fromFunction2(expect))
  
    __obj.asInstanceOf[AnonArgs]
  }
}

