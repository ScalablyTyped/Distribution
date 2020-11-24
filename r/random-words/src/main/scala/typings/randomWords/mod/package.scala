package typings.randomWords

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type WordFormatter = js.Function2[
    /* word */ java.lang.String, 
    /* relativeIndex */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
}
