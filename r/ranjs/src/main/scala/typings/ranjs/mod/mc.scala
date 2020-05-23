package typings.ranjs.mod

import typings.ranjs.anon.Dim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ranjs", "mc")
@js.native
object mc extends js.Object {
  @js.native
  class RWM protected ()
    extends typings.ranjs.mod._mc.MCMC {
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double]) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Dim) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: Dim, initialState: State) = this()
  }
  
  def gr(samples: js.Array[js.Array[js.Array[Double]]]): js.Array[js.Array[Double]] = js.native
  def gr(samples: js.Array[js.Array[js.Array[Double]]], maxLength: Double): js.Array[js.Array[Double]] = js.native
  type MCMC = typings.ranjs.mod._mc.MCMC
  type State = typings.ranjs.mod._mc.State
}

