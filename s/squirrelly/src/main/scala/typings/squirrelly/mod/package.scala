package typings.squirrelly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Blocks = typings.std.Record[java.lang.String, js.Function0[java.lang.String]]
  
  type HelperCallback = js.Function3[
    /* args */ js.Array[java.lang.String], 
    /* content */ js.Function0[java.lang.String], 
    /* blocks */ typings.squirrelly.mod.Blocks, 
    java.lang.String
  ]
  
  type SqrlFn = js.Function2[/* options */ js.Object, /* Sqrl */ js.Any, java.lang.String]
}
