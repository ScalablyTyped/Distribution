package typings.reactDashSelect.reactDashSelectMod

import typings.reactDashSelect.srcComponentsMod.SelectComponents
import typings.reactDashSelect.srcFiltersMod.Config
import typings.reactDashSelect.srcFiltersMod.Option
import typings.reactDashSelect.srcStylesMod.StylesConfig
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val components: Required[SelectComponents[js.Any]] = js.native
  def createFilter(): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def createFilter(config: Config): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def mergeStyles(source: StylesConfig, target: StylesConfig): StylesConfig = js.native
}

