package typings.prettyFormat.reactTestComponentMod

import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/ReactTestComponent", "serialize")
@js.native
object serialize extends js.Object {
  def apply(
    `object`: ReactTestObject,
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
}

