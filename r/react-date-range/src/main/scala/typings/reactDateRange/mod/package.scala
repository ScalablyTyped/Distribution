package typings.reactDateRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyDate = java.lang.String | typings.std.Date
  
  type DateFunc = js.Function1[/* now */ typings.std.Date, typings.reactDateRange.mod.AnyDate]
  
  type DateInputType = typings.reactDateRange.mod.AnyDate | typings.reactDateRange.mod.DateFunc
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDateRange.mod.Range
    - typings.reactDateRange.anon.Selection
    - typings.std.Date
  */
  type OnChangeProps = typings.reactDateRange.mod._OnChangeProps | typings.std.Date
  
  type SizeType = scala.Double
}
