package typings.shot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  
  type Listener = js.Function2[
    /* req */ typings.shot.mod.SimulatedRequestObject, 
    /* res */ typings.shot.mod.SimulatedResponseObject, 
    scala.Unit
  ]
  
  type SimulatedRequestObject = typings.node.streamMod.Readable
  
  type SimulatedResponseObject = typings.node.httpMod.ServerResponse
}
