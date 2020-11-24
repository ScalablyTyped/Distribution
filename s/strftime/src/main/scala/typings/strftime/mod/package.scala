package typings.strftime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type strftimeFunction = js.Function2[
    /* format */ java.lang.String, 
    /* date */ js.UndefOr[typings.std.Date], 
    java.lang.String
  ]
}
