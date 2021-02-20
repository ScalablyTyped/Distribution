package typings.reactMdAutocomplete

import typings.react.mod.ReactNode
import typings.reactMdAutocomplete.typesMod.AutoCompleteData
import typings.reactMdAutocomplete.typesMod.AutoCompleteFilterFunction
import typings.reactMdAutocomplete.typesMod.FilterFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@react-md/autocomplete/types/utils", "getFilterFunction")
  @js.native
  def getFilterFunction[O /* <: js.Object */](filter: AutoCompleteFilterFunction[O]): FilterFunction[O] = js.native
  
  @JSImport("@react-md/autocomplete/types/utils", "getResultId")
  @js.native
  def getResultId(id: String, index: Double): String = js.native
  
  @JSImport("@react-md/autocomplete/types/utils", "getResultLabel")
  @js.native
  def getResultLabel(datum: AutoCompleteData, labelKey: String, _query: String): ReactNode = js.native
  
  @JSImport("@react-md/autocomplete/types/utils", "getResultValue")
  @js.native
  def getResultValue(datum: AutoCompleteData, valueKey: String): String = js.native
  
  @JSImport("@react-md/autocomplete/types/utils", "isResultOf")
  @js.native
  def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = js.native
  
  @JSImport("@react-md/autocomplete/types/utils", "noFilter")
  @js.native
  val noFilter: FilterFunction[js.Object] = js.native
}
