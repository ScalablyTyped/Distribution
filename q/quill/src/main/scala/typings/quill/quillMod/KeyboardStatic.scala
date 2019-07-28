package typings.quill.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardStatic extends js.Object {
  def addBinding(key: Key, callback: js.Function2[/* range */ RangeStatic, /* context */ js.Any, Unit]): Unit = js.native
  def addBinding(
    key: Key,
    context: js.Any,
    callback: js.Function2[/* range */ RangeStatic, /* context */ js.Any, Unit]
  ): Unit = js.native
}

