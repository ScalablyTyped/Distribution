package typings.regeneratorRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ContextLocation = scala.Double | typings.regeneratorRuntime.regeneratorRuntimeStrings.end
  
  type InnerFunction[T, TYield, TReturn, TNext] = js.ThisFunction1[
    /* this */ T, 
    /* context */ typings.regeneratorRuntime.mod.Context[TYield, TReturn, TNext], 
    js.Any
  ]
  
  type TryLocationsList = js.Array[
    (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple4[
      scala.Double, 
      js.UndefOr[scala.Double], 
      scala.Double, 
      typings.regeneratorRuntime.mod.ContextLocation
    ])
  ]
}
