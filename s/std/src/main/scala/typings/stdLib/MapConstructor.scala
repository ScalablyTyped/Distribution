package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapConstructor
  extends ScalablyTyped.runtime.Instantiable1[
      (/* iterable */ Iterable[js.Tuple2[js.Object, js.Object]]) | (/* entries */ js.Array[js.Tuple2[js.Object, js.Object]]), 
      Map[js.Object, js.Object]
    ]
     with ScalablyTyped.runtime.Instantiable0[Map[js.Object, js.Object]] {
  @JSName(ScalablyTyped.runtime.Symbol.species)
  val species: MapConstructor = js.native
}

