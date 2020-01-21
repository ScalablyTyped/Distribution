package typings.reactSelect

import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typings.reactSelect.selectMod.default[OptionType]
  
  val defaultProps: Props[js.Any] = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
}

