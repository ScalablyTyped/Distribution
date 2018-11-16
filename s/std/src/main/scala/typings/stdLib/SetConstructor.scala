package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetConstructor
  extends ScalablyTyped.runtime.Instantiable1[
      (/* iterable */ Iterable[js.Object]) | (/* values */ js.Array[js.Object]), 
      Set[js.Object]
    ]
     with ScalablyTyped.runtime.Instantiable0[Set[js.Object]] {
  @JSName(ScalablyTyped.runtime.Symbol.species)
  val species: SetConstructor = js.native
}

