package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Filter extends StObject
object _Filter {
  
  inline def DateFilter(): typings.reactBootstrapTable.mod.DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DateFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.DateFilter]
  }
  
  inline def NumberFilter(): typings.reactBootstrapTable.mod.NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumberFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.NumberFilter]
  }
  
  inline def RegexFilter(): typings.reactBootstrapTable.mod.RegexFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RegexFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.RegexFilter]
  }
  
  inline def SelectFilter(options: SelectFilterOptionsType): typings.reactBootstrapTable.mod.SelectFilter = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.SelectFilter]
  }
  
  inline def TextFilter(): typings.reactBootstrapTable.mod.TextFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TextFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.TextFilter]
  }
}
