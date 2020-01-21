package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/juxt", JSImport.Namespace)
@js.native
object juxtMod extends js.Object {
  def default[A /* <: js.Array[_] */, U](fns: js.Array[js.Function1[/* args */ A, U]]): js.Function1[/* args */ A, js.Array[U]] = js.native
  def default[A /* <: js.Array[_] */, R1, R2](fns: js.Tuple2[js.Function1[/* a */ A, R1], js.Function1[/* a */ A, R2]]): js.Function1[/* a */ A, js.Tuple2[R1, R2]] = js.native
  def default[A /* <: js.Array[_] */, R1, R2, R3](
    fns: js.Tuple3[
      js.Function1[/* a */ A, R1], 
      js.Function1[/* a */ A, R2], 
      js.Function1[/* a */ A, R3]
    ]
  ): js.Function1[/* a */ A, js.Tuple3[R1, R2, R3]] = js.native
  def default[A /* <: js.Array[_] */, R1, R2, R3, R4](
    fns: js.Tuple4[
      js.Function1[/* a */ A, R1], 
      js.Function1[/* a */ A, R2], 
      js.Function1[/* a */ A, R3], 
      js.Function1[/* a */ A, R4]
    ]
  ): js.Function1[/* a */ A, js.Tuple4[R1, R2, R3, R4]] = js.native
  def default[A /* <: js.Array[_] */, R1, R2, R3, R4, R5](
    fns: js.Tuple5[
      js.Function1[/* a */ A, R1], 
      js.Function1[/* a */ A, R2], 
      js.Function1[/* a */ A, R3], 
      js.Function1[/* a */ A, R4], 
      js.Function1[/* a */ A, R5]
    ]
  ): js.Function1[/* a */ A, js.Tuple5[R1, R2, R3, R4, R5]] = js.native
}

