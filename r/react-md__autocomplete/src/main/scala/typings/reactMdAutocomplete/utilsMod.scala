package typings.reactMdAutocomplete

import typings.react.mod.ReactNode
import typings.reactMdAutocomplete.typesMod.AutoCompleteData
import typings.reactMdAutocomplete.typesMod.AutoCompleteFilterFunction
import typings.reactMdAutocomplete.typesMod.FilterFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/autocomplete/types/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def getFilterFunction[O /* <: js.Object */](filter: AutoCompleteFilterFunction[O]): FilterFunction[O] = js.native
  
  def getResultId(id: String, index: Double): String = js.native
  
  def getResultLabel(datum: AutoCompleteData, labelKey: String, _query: String): ReactNode = js.native
  
  def getResultValue(datum: AutoCompleteData, valueKey: String): String = js.native
  
  def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = js.native
  
  val noFilter: FilterFunction[js.Object] = js.native
}
