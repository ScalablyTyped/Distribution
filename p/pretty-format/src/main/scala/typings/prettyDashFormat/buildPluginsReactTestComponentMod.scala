package typings.prettyDashFormat

import typings.prettyDashFormat.buildPluginsReactTestComponentMod.ReactTestChild
import typings.prettyDashFormat.buildPluginsReactTestComponentMod.ReactTestObject
import typings.prettyDashFormat.buildTypesMod.Config
import typings.prettyDashFormat.buildTypesMod.NewPlugin
import typings.prettyDashFormat.buildTypesMod.Printer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/ReactTestComponent", JSImport.Namespace)
@js.native
object buildPluginsReactTestComponentMod extends js.Object {
  @js.native
  trait ReactTestObject extends js.Object {
    @JSName("$$typeof")
    var $$typeof: js.Symbol = js.native
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
    refs: js.Array[_],
    printer: Printer
  ): String = js.native
  def test(`val`: js.Any): Boolean = js.native
  type ReactTestChild = ReactTestObject | String | Double
}

