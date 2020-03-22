package typings.relayCompiler.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  name  :string,   type  :relay-compiler.relay-compiler/lib/core/Schema.InputTypeID,   defaultValue  :any}> */
trait Argument extends js.Object {
  val defaultValue: js.Any
  val name: String
  val `type`: InputTypeID
}

object Argument {
  @scala.inline
  def apply(defaultValue: js.Any, name: String, `type`: InputTypeID): Argument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
}

