package typings.skatejs.mod

import typings.skatejs.typesMod.PropOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", "prop")
@js.native
object prop extends js.Object {
  def apply(): PropertyDecorator with PropOptions[_] = js.native
  def apply(ops: PropOptions[_]): PropertyDecorator with PropOptions[_] = js.native
}

