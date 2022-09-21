package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapConstructor
  extends StObject
     with /* standard es2015.collection */
/* standard es2015.iterable */
Instantiable0[Map[Any | js.Object, Any | js.Object]]
     with Instantiable1[
      (/* entries */ js.Array[js.Tuple2[js.Object, js.Object]]) | (/* iterable */ js.Iterable[js.Tuple2[js.Object, js.Object]]), 
      Map[js.Object, js.Object]
    ] {
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.species)
  val species: MapConstructor = js.native
}
