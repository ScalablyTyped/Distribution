package typings.prettyDashFormat

import typings.prettyDashFormat.buildTypesMod.Config
import typings.prettyDashFormat.buildTypesMod.NewPlugin
import typings.prettyDashFormat.buildTypesMod.Printer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/Immutable", JSImport.Namespace)
@js.native
object buildPluginsImmutableMod extends js.Object {
  val default: NewPlugin = js.native
  def serialize(
    `val`: js.Any,
    config: Config,
    indentation: String,
    depth: Double,
    refs: js.Array[_],
    printer: Printer
  ): String = js.native
  def test(`val`: js.Any): Boolean = js.native
}

