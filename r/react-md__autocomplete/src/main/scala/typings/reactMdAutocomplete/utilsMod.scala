package typings.reactMdAutocomplete

import typings.react.mod.ReactNode
import typings.reactMdAutocomplete.typesMod.AutoCompleteData
import typings.reactMdAutocomplete.typesMod.AutoCompleteFilterFunction
import typings.reactMdAutocomplete.typesMod.FilterFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@react-md/autocomplete/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFilterFunction[O /* <: js.Object */](filter: AutoCompleteFilterFunction[O]): FilterFunction[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterFunction")(filter.asInstanceOf[js.Any]).asInstanceOf[FilterFunction[O]]
  
  inline def getResultId(id: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getResultId")(id.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getResultLabel(datum: AutoCompleteData, labelKey: String, _query: String): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getResultLabel")(datum.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any], _query.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def getResultValue(datum: AutoCompleteData, valueKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getResultValue")(datum.asInstanceOf[js.Any], valueKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResultOf")(datum.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  @JSImport("@react-md/autocomplete/types/utils", "noFilter")
  @js.native
  val noFilter: FilterFunction[js.Object] = js.native
}
