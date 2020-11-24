package typings.rdfLoadersRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LoadOptions[T /* <: typings.std.Record[java.lang.String, _] */] = T with typings.rdfLoadersRegistry.anon.LoaderRegistry
  
  type Loader[T, TOptions] = js.Function2[
    /* node */ typings.clownface.mod.GraphPointer[
      typings.rdfJs.mod.Term, 
      typings.rdfJs.mod.DatasetCore[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]
    ], 
    /* options */ typings.rdfLoadersRegistry.mod.LoadOptions[TOptions], 
    T | js.Promise[T]
  ]
}
