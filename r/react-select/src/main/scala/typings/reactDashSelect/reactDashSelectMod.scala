package typings.reactDashSelect

import typings.reactDashSelect.srcComponentsMod.SelectComponents
import typings.reactDashSelect.srcFiltersMod.Config
import typings.reactDashSelect.srcFiltersMod.Option
import typings.reactDashSelect.srcStateManagerMod.DefaultProps
import typings.reactDashSelect.srcStateManagerMod.StateManager
import typings.reactDashSelect.srcStylesMod.StylesConfig
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select", JSImport.Namespace)
@js.native
object reactDashSelectMod extends js.Object {
  @js.native
  class default[OptionType /* <: OptionTypeBase */, T /* <: typings.reactDashSelect.srcSelectMod.default[OptionType] */] () extends StateManager[OptionType, T]
  
  val components: Required[SelectComponents[js.Any]] = js.native
  def createFilter(): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def createFilter(config: Config): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def mergeStyles(source: StylesConfig, target: StylesConfig): StylesConfig = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: DefaultProps[_] = js.native
  }
  
}

