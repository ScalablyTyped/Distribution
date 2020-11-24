package typings.rollupPluginSourcemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ReadFileCallback = js.Function2[
    /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
    /* data */ java.lang.String, 
    scala.Unit
  ]
  
  type ReadFileFunction = js.Function3[
    /* file */ java.lang.String | typings.node.Buffer | scala.Double, 
    /* encoding */ java.lang.String, 
    /* callback */ typings.rollupPluginSourcemaps.mod.ReadFileCallback, 
    scala.Unit
  ]
}
