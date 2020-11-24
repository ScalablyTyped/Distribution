package typings.reactSelect.selectMod

import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ key in string ]: any} */ @js.native
trait Props[OptionType /* <: OptionTypeBase */] extends NamedProps[OptionType]
object Props {
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](): Props[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[OptionType]]
  }
}
