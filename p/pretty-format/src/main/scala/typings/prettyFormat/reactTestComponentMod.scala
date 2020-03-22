package typings.prettyFormat

import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.NewPlugin
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/ReactTestComponent", JSImport.Namespace)
@js.native
object reactTestComponentMod extends js.Object {
  @js.native
  trait ReactTestObject extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var children: js.UndefOr[Null | js.Array[ReactTestChild]] = js.native
    var props: js.UndefOr[Record[String, _]] = js.native
    var `type`: String = js.native
  }
  
  val default: NewPlugin = js.native
  def serialize(
    `object`: ReactTestObject,
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  def test(`val`: js.Any): Boolean = js.native
  type ReactTestChild = ReactTestObject | String | Double
}

