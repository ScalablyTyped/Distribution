package typings.rfc6902

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object diffMod {
  
  type Diff = js.Function3[
    /* input */ js.Any, 
    /* output */ js.Any, 
    /* ptr */ typings.rfc6902.pointerMod.Pointer, 
    js.Array[typings.rfc6902.diffMod.Operation]
  ]
  
  type VoidableDiff = js.Function3[
    /* input */ js.Any, 
    /* output */ js.Any, 
    /* ptr */ typings.rfc6902.pointerMod.Pointer, 
    js.Array[typings.rfc6902.diffMod.Operation] | scala.Unit
  ]
}
